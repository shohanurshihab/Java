import java.awt.Frame;
import java.awt.AWTEvent;
import java.awt.event.WindowEvent;

public class ShowEdges extends Frame {
    public static void main(String arg[]) {
        new ShowEdges();
    }
    ShowEdges() {
        enableEvents(AWTEvent.WINDOW_EVENT_MASK);
        setLocation(250,25);
        Edges canvas = new Edges();
        add(canvas);
        addKeyListener(canvas);
        pack();
        show();
    }
    public void processWindowEvent(WindowEvent event) {
        if(event.getID() == WindowEvent.WINDOW_CLOSING)
            System.exit(0);
    }
}
