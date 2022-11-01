import java.awt.Frame;
import java.awt.AWTEvent;
import java.awt.event.WindowEvent;

public class ShowFillRoundRect extends Frame {
    public static void main(String arg[]) {
        new ShowFillRoundRect();
    }
    ShowFillRoundRect() {
        enableEvents(AWTEvent.WINDOW_EVENT_MASK);
        setLocation(250,25);
        FillRoundRect canvas = new FillRoundRect();
        add(canvas);
        pack();
        show();
    }
    public void processWindowEvent(WindowEvent event) {
        if(event.getID() == WindowEvent.WINDOW_CLOSING)
            System.exit(0);
    }
}
