import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
class CubicCurve extends Frame {
    public static void main(String arg[]) {
        new CubicCurve();
    }
    CubicCurve() {
        super("CubicCurve");
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e)
                { System.exit(0); } } );
        setLocation(200,100);
        CubicCurveCanvas cc = new CubicCurveCanvas();
        add(cc);
        pack();
        show();
    }
}
