import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
class ScaledArrow extends Frame {
    public static void main(String arg[]) {
        new ScaledArrow();
    }
    ScaledArrow() {
        super("ScaledArrow");
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e)
                { System.exit(0); } } );
        setLocation(200,200);
        ScaledArrowCanvas ac = new ScaledArrowCanvas();
        add(ac);
        pack();
        show();
    }
}
