import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
public class FollowMouseMotionCanvas extends Canvas
            implements MouseMotionListener {
    String description = "";
    FollowMouseMotionCanvas() {
        addMouseMotionListener(this);
        setSize(400,150);
    }
    public void paint(Graphics g) {
        g.drawString(description,20,30);
    }
    public void mouseMoved(MouseEvent event) {
        description = "Moved (" + event.getX() +
                "," + event.getY() + ")";
        repaint();
    }
    public void mouseDragged(MouseEvent event) {
        description = "Dragged (" + event.getX() +
                "," + event.getY() + ")";
        repaint();
    }
}
