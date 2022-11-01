import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class AllMouseEvents extends Frame {
    public static void main(String[] arg) {
        new AllMouseEvents();
    }
    AllMouseEvents() {
        super("AllMouseEvents");
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e)
                { System.exit(0); } } );
        setLocation(50,200);
        AllMouseEventsCanvas ac = new AllMouseEventsCanvas();
        add(ac);
        pack();
        show();
    }
}
