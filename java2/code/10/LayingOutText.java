import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
class LayingOutText extends Frame {
    public static void main(String arg[]) {
        new LayingOutText();
    }
    LayingOutText() {
        super("LayingOutText");
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e)
                { System.exit(0); } } );
        setLocation(200,100);
        LayingOutTextCanvas lo = new LayingOutTextCanvas();
        add(lo);
        pack();
        show();
    }
}
