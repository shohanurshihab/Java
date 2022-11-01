import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
class Layout extends Frame {
    public static void main(String arg[]) {
        new Layout();
    }
    Layout() {
        super("Layout");
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e)
                { System.exit(0); } } );
        setLocation(150,50);
        LayoutCanvas lc = new LayoutCanvas();
        add(lc);
        pack();
        show();
    }
}
