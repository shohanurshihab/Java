import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
class NoFlicker extends Frame {
    public static void main(String arg[]) {
        new NoFlicker();
    }
    NoFlicker() {
        super("NoFlicker");
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e)
                { System.exit(0); } } );
        setLocation(150,50);
        NoFlickerCanvas fc = new NoFlickerCanvas();
        fc.init();
        fc.start();
        add(fc);
        pack();
        show();
    }
}
