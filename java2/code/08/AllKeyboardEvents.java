import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class AllKeyboardEvents extends Frame {
    public static void main(String[] arg) {
        new AllKeyboardEvents();
    }
    AllKeyboardEvents() {
        super("AllKeyboardEvents");
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e)
                { System.exit(0); } } );
        setLocation(50,200);
        AllKeyboardEventsCanvas ac = new AllKeyboardEventsCanvas();
        add(ac);
        pack();
        show();
    }
}
