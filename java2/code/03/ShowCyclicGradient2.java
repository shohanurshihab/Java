import java.awt.Frame;
import java.awt.AWTEvent;
import java.awt.event.WindowEvent;

public class ShowCyclicGradient2 extends Frame {
    public static void main(String arg[]) {
        new ShowCyclicGradient2();
    }
    ShowCyclicGradient2() {
        enableEvents(AWTEvent.WINDOW_EVENT_MASK);
        setLocation(250,150);
        CyclicGradient2 canvas = new CyclicGradient2();
        add(canvas);
        pack();
        show();
    }
    public void processWindowEvent(WindowEvent event) {
        if(event.getID() == WindowEvent.WINDOW_CLOSING)
            System.exit(0);
    }
}
