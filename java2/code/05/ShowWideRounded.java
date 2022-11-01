import java.awt.Frame;
import java.awt.AWTEvent;
import java.awt.event.WindowEvent;

public class ShowWideRounded extends Frame {
    public static void main(String arg[]) {
        new ShowWideRounded();
    }
    ShowWideRounded() {
        enableEvents(AWTEvent.WINDOW_EVENT_MASK);
        setLocation(150,10);
        WideRounded canvas = new WideRounded();
        add(canvas);
        pack();
        show();
    }
    public void processWindowEvent(WindowEvent event) {
        if(event.getID() == WindowEvent.WINDOW_CLOSING)
            System.exit(0);
    }
}
