import java.awt.Frame;
import java.awt.AWTEvent;
import java.awt.event.WindowEvent;

public class ShowSquareMitered extends Frame {
    public static void main(String arg[]) {
        new ShowSquareMitered();
    }
    ShowSquareMitered() {
        enableEvents(AWTEvent.WINDOW_EVENT_MASK);
        setLocation(150,10);
        SquareMitered canvas = new SquareMitered();
        add(canvas);
        pack();
        show();
    }
    public void processWindowEvent(WindowEvent event) {
        if(event.getID() == WindowEvent.WINDOW_CLOSING)
            System.exit(0);
    }
}
