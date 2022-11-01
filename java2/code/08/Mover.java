import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class Mover extends Frame {
    public static void main(String[] arg) {
        new Mover();
    }
    Mover() {
        super("Mover");
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e)
                { System.exit(0); } } );
        setLocation(200,200);
        MoverCanvas mc = new MoverCanvas();
        add(mc);
        pack();
        show();
    }
}
