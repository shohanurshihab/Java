import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
class QuadCurve extends Frame {
    public static void main(String arg[]) {
        new QuadCurve();
    }
    QuadCurve() {
        super("QuadCurve");
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e)
                { System.exit(0); } } );
        setLocation(200,100);
        QuadCurveCanvas qc = new QuadCurveCanvas();
        add(qc);
        pack();
        show();
    }
}
