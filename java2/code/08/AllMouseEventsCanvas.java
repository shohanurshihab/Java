import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
import java.awt.event.InputEvent;
public class AllMouseEventsCanvas extends Canvas
        implements MouseListener, MouseMotionListener {
    String when = "";
    String modifier = "";
    String eventID = "";
    String location = "";
    String clickCount = "";
    String param = "";
    AllMouseEventsCanvas() {
        addMouseListener(this);
        addMouseMotionListener(this);
        setSize(600,150);
    }
    public void paint(Graphics g) {
        g.drawString(modifier,20,30);
        g.drawString(eventID,20,50);
        g.drawString(location,20,70);
        g.drawString(clickCount,20,90);
        g.drawString(when,20,110);
        g.drawString(param,20,130);
    }
    public void mouseMoved(MouseEvent event) {
        showEvent(event);
    }
    public void mouseDragged(MouseEvent event) {
        showEvent(event);
    }
    public void mouseEntered(MouseEvent event) {
        showEvent(event);
    }
    public void mouseExited(MouseEvent event) {
        showEvent(event);
    }
    public void mouseClicked(MouseEvent event) {
        showEvent(event);
    }
    public void mousePressed(MouseEvent event) {
        showEvent(event);
    }
    public void mouseReleased(MouseEvent event) {
        showEvent(event);
    }
    private void showEvent(MouseEvent event) {
        modifier = "";
        if(event.isAltDown())
            modifier += "ALT ";
        if(event.isControlDown())
            modifier += "CTRL ";
        if(event.isMetaDown())
            modifier += "META ";
        if(event.isShiftDown())
            modifier += "SHIFT ";
        if((event.getModifiers() & InputEvent.BUTTON1_MASK) != 0)
            modifier += "BUTTON1 ";
        if((event.getModifiers() & InputEvent.BUTTON2_MASK) != 0)
            modifier += "BUTTON2 ";
        if((event.getModifiers() & InputEvent.BUTTON3_MASK) != 0)
            modifier += "BUTTON3 ";
        switch(event.getID()) {
        case MouseEvent.MOUSE_CLICKED:
            eventID = "Mouse clicked";
            break;
        case MouseEvent.MOUSE_DRAGGED:
            eventID = "Mouse dragged";
            break;
        case MouseEvent.MOUSE_ENTERED:
            eventID = "Mouse entered";
            break;
        case MouseEvent.MOUSE_EXITED:
            eventID = "Mouse exited";
            break;
        case MouseEvent.MOUSE_MOVED:
            eventID = "Mouse moved";
            break;
        case MouseEvent.MOUSE_PRESSED:
            eventID = "Mouse pressed";
            break;
        case MouseEvent.MOUSE_RELEASED:
            eventID = "Mouse released";
            break;
        default:
            eventID = "";
            break;
        }
        clickCount = "Click count: " + event.getClickCount();
        location = "(" + event.getX() + "," + event.getY() + ")";
        when = "When: " + event.getWhen();
        param = event.paramString();
        repaint();
    }
}
