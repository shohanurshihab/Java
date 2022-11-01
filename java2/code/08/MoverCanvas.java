import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.BasicStroke;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.awt.geom.AffineTransform;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
public class MoverCanvas extends Canvas
        implements MouseListener, MouseMotionListener {
    boolean moving = false;
    int moveIndex;
    int startx;
    int starty;
    int endx;
    int endy;
    Area[] area;
    AffineTransform at;
    BasicStroke dashes;
    MoverCanvas() {
        addMouseListener(this);
        addMouseMotionListener(this);
        area = new Area[4];
        area[0] = new Area(new Ellipse2D.Float(10,10,40,40));
        area[1] = new Area(new Ellipse2D.Float(80,80,20,50));
        area[2] = new Area(new Ellipse2D.Float(130,130,60,60));
        area[3] = new Area(new Ellipse2D.Float(200,200,50,20));
        setSize(300,250);
        at = new AffineTransform();
        float[] pattern = { 5f,5f };
        dashes = new BasicStroke(1f,BasicStroke.CAP_BUTT,
                BasicStroke.JOIN_BEVEL,1f,pattern,0f);
    }
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        for(int i=0; i<area.length; i++)
            g2.draw(area[i]);
        if(moving) {
            g2.setTransform(at);
            g2.setStroke(dashes);
            g2.draw(area[moveIndex]);
        }
    }
    public void mouseMoved(MouseEvent event) {
        moving = false;
    }
    public void mouseDragged(MouseEvent event) {
        if(!moving)
            return;
        endx = event.getX();
        endy = event.getY();
        at.setToTranslation(endx - startx,endy - starty);
        repaint();
    }
    public void mousePressed(MouseEvent event) {
        moving = false;
        startx = event.getX();
        starty = event.getY();
        for(int i=0; i<area.length; i++) {
            if(area[i].contains(startx,starty)) {
                moving = true;
                moveIndex = i;
                at.setToTranslation(0,0);
                break;
            }
        }
    }
    public void mouseReleased(MouseEvent event) {
        if(moving) {
            area[moveIndex].transform(at);
            moving = false;
            repaint();
        }
    }
    public void mouseEntered(MouseEvent event) { }
    public void mouseExited(MouseEvent event) { }
    public void mouseClicked(MouseEvent event) { }
}
