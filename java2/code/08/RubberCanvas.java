import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Area;
import java.awt.geom.Line2D;
import java.util.Vector;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
public class RubberCanvas extends Canvas
        implements MouseListener, MouseMotionListener {
    private int startx;
    private int starty;
    private int endx;
    private int endy;
    private boolean stretching;
    private Vector vector;
    RubberCanvas() {
        addMouseListener(this);
        addMouseMotionListener(this);
        setSize(600,150);
        vector = new Vector();
        stretching = false;
    }
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        for(int i=0; i<vector.size(); i++) {
            Line2D line = (Line2D)vector.elementAt(i);
            g2.draw(line);
        }
        if(stretching) {
            g.drawLine(startx-10,starty,startx+10,starty);
            g.drawLine(startx,starty-10,startx,starty+10);
            g.drawLine(endx-10,endy,endx+10,endy);
            g.drawLine(endx,endy-10,endx,endy+10);
            g.drawLine(startx,starty,endx,endy);
        }
    }
    public void mouseMoved(MouseEvent event) {
        stretching = false;
    }
    public void mouseDragged(MouseEvent event) {
        endx = event.getX();
        endy = event.getY();
        repaint();
    }
    public void mousePressed(MouseEvent event) {
        stretching = true;
        startx = endx = event.getX();
        starty = endy = event.getY();
        repaint();
    }
    public void mouseReleased(MouseEvent event) {
       if(stretching) {
           Line2D line = new Line2D.Float((float)startx,(float)starty,
                                (float)endx,(float)endy);
           vector.addElement(line);
           stretching = false;
           repaint();
       }
    }
    public void mouseEntered(MouseEvent event) { }
    public void mouseExited(MouseEvent event) { }
    public void mouseClicked(MouseEvent event) { }
}
