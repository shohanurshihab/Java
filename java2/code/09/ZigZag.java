import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
class ZigZag extends Frame {
    public static void main(String arg[]) {
        new ZigZag();
    }
    ZigZag() {
        super("ZigZag");
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e)
                { System.exit(0); } } );
        setLocation(200,200);
        ZigZagCanvas zz = new ZigZagCanvas();
        add(zz);
        pack();
        show();
    }
}
