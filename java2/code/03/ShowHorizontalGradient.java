import java.awt.Frame;
import java.awt.AWTEvent;
import java.awt.event.WindowEvent;

public class ShowHorizontalGradient extends Frame {
    public static void main(String arg[]) {
        new ShowHorizontalGradient();
    }
    ShowHorizontalGradient() {
        enableEvents(AWTEvent.WINDOW_EVENT_MASK);
        setLocation(250,150);
        HorizontalGradient canvas = new HorizontalGradient();
        add(canvas);
        pack();
        show();
    }
    public void processWindowEvent(WindowEvent event) {
        if(event.getID() == WindowEvent.WINDOW_CLOSING)
            System.exit(0);
    }
}
