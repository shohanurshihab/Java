import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class Rubber extends Frame {
    public static void main(String[] arg) {
        new Rubber();
    }
    Rubber() {
        super("Rubber");
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e)
                { System.exit(0); } } );
        setLocation(50,200);
        RubberCanvas rc = new RubberCanvas();
        add(rc);
        pack();
        show();
    }
}
