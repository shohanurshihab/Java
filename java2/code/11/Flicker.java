import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
class Flicker extends Frame {
    public static void main(String arg[]) {
        new Flicker();
    }
    Flicker() {
        super("Flicker");
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e)
                { System.exit(0); } } );
        setLocation(150,50);
        FlickerCanvas fc = new FlickerCanvas();
        fc.init();
        fc.start();
        add(fc);
        pack();
        show();
    }
}
