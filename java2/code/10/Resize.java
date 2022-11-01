import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class Resize extends Frame {
    public static void main(String arg[]) {
        new Resize();
    }
    Resize() {
        super("Resize");
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e)
                { System.exit(0); } } );
        setLocation(200,200);
        ResizeCanvas rc = new ResizeCanvas();
        add(rc);
        pack();
        show();
    }
}
