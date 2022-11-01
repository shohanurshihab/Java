import java.awt.Frame;
import java.awt.AWTEvent;
import java.awt.event.WindowEvent;

public class ShowDiagonalGradient extends Frame {
    public static void main(String arg[]) {
        new ShowDiagonalGradient();
    }
    ShowDiagonalGradient() {
        enableEvents(AWTEvent.WINDOW_EVENT_MASK);
        setLocation(250,150);
        DiagonalGradient canvas = new DiagonalGradient();
        add(canvas);
        pack();
        show();
    }
    public void processWindowEvent(WindowEvent event) {
        if(event.getID() == WindowEvent.WINDOW_CLOSING)
            System.exit(0);
    }
}
