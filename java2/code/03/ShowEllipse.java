import java.awt.Frame;
import java.awt.AWTEvent;
import java.awt.event.WindowEvent;

public class ShowEllipse extends Frame {
    public static void main(String arg[]) {
        new ShowEllipse();
    }
    ShowEllipse() {
        enableEvents(AWTEvent.WINDOW_EVENT_MASK);
        setLocation(250,250);
        Ellipse canvas = new Ellipse();
        add(canvas);
        pack();
        show();
    }
    public void processWindowEvent(WindowEvent event) {
        if(event.getID() == WindowEvent.WINDOW_CLOSING)
            System.exit(0);
    }
}
