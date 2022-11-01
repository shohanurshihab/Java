import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
class Combine extends Frame {
    public static void main(String arg[]) {
        new Combine();
    }
    Combine() {
        super("Combine");
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e)
                { System.exit(0); } } );
        setLocation(200,50);
        CombineCanvas cc = new CombineCanvas();
        add(cc);
        pack();
        show();
    }
}
