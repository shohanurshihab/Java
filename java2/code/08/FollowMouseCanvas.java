import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
public class FollowMouseCanvas extends Canvas
            implements MouseListener {
    String enterExit = "";
    String click = "";
    String press = "";
    String release = "";
    FollowMouseCanvas() {
        addMouseListener(this);
        setSize(400,150);
    }
    public void paint(Graphics g) {
        g.drawString(enterExit,20,30);
        g.drawString(click,20,50);
        g.drawString(press,20,70);
        g.drawString(release,20,90);
    }
    public void mouseEntered(MouseEvent event) {
        enterExit = "Mouse Entered (" + event.getX() +
                "," + event.getY() + ")";
        repaint();
    }
    public void mouseExited(MouseEvent event) {
        enterExit = "Mouse Exited (" + event.getX() +
                "," + event.getY() + ")";
        repaint();
    }
    public void mouseClicked(MouseEvent event) {
        click = "Mouse Clicked (" + event.getX() +
                "," + event.getY() + ")";
        repaint();
    }
    public void mousePressed(MouseEvent event) {
        press = "Mouse Pressed (" + event.getX() +
                "," + event.getY() + ")";
        repaint();
    }
    public void mouseReleased(MouseEvent event) {
        release = "Mouse Released (" + event.getX() +
                "," + event.getY() + ")";
        repaint();
    }
}
