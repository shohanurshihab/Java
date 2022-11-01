import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
class Pong extends Frame {
    public static void main(String arg[]) {
        new Pong();
    }
    Pong() {
        super("Pong");
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e)
                { System.exit(0); } } );
        setLocation(150,50);
        PongCanvas fc = new PongCanvas();
        fc.init();
        fc.start();
        add(fc);
        pack();
        show();
    }
}
