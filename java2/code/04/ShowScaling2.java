import java.awt.Frame;
import java.awt.AWTEvent;
import java.awt.event.WindowEvent;

public class ShowScaling2 extends Frame {
    public static void main(String arg[]) {
        new ShowScaling2();
    }
    ShowScaling2() {
        enableEvents(AWTEvent.WINDOW_EVENT_MASK);
        setLocation(250,250);
        Scaling2 canvas = new Scaling2();
        add(canvas);
        pack();
        show();
    }
    public void processWindowEvent(WindowEvent event) {
        if(event.getID() == WindowEvent.WINDOW_CLOSING)
            System.exit(0);
    }
}
