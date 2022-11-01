import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class SolidMover extends Frame {
    public static void main(String[] arg) {
        new SolidMover();
    }
    SolidMover() {
        super("SolidMover");
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e)
                { System.exit(0); } } );
        setLocation(200,200);
        SolidMoverCanvas mc = new SolidMoverCanvas();
        add(mc);
        pack();
        show();
    }
}
