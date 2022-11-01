import java.awt.Frame;
import java.awt.AWTEvent;
import java.awt.event.WindowEvent;

public class ShowThree extends Frame {
    public static void main(String arg[]) {
        new ShowThree();
    }
    ShowThree() {
        enableEvents(AWTEvent.WINDOW_EVENT_MASK);
        setLocation(250,25);
        Three canvas = new Three();
        add(canvas);
        pack();
        show();
    }
    public void processWindowEvent(WindowEvent event) {
        if(event.getID() == WindowEvent.WINDOW_CLOSING)
            System.exit(0);
    }
}
