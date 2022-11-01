import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
class SimpleArrow extends Frame {
    public static void main(String arg[]) {
        new SimpleArrow();
    }
    SimpleArrow() {
        super("SimpleArrow");
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e)
                { System.exit(0); } } );
        setLocation(200,200);
        SimpleArrowCanvas ac = new SimpleArrowCanvas();
        add(ac);
        pack();
        show();
    }
}
