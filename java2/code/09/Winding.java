import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
class Winding extends Frame {
    public static void main(String arg[]) {
        new Winding();
    }
    Winding() {
        super("Winding");
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e)
                { System.exit(0); } } );
        setLocation(200,100);
        WindingCanvas wc = new WindingCanvas();
        add(wc);
        pack();
        show();
    }
}
