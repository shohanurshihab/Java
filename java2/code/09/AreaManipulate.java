import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class AreaManipulate extends Frame {
    public static void main(String arg[]) {
        new AreaManipulate();
    }
    AreaManipulate() {
        super("AreaManipulate");
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e)
                { System.exit(0); } } );
        setLocation(200,50);
        AreaManipulateCanvas am = new AreaManipulateCanvas();
        add(am);
        pack();
        show();
    }
}
