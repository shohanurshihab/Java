import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
class MultipleStyles extends Frame {
    public static void main(String arg[]) {
        new MultipleStyles();
    }
    MultipleStyles() {
        super("MultipleStyles");
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e)
                { System.exit(0); } } );
        setLocation(200,100);
        MultipleStylesCanvas ms = new MultipleStylesCanvas();
        add(ms);
        pack();
        show();
    }
}
