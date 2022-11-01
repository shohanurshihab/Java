import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
class CubicCurve3 extends Frame {
    public static void main(String arg[]) {
        new CubicCurve3();
    }
    CubicCurve3() {
        super("CubicCurve3");
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e)
                { System.exit(0); } } );
        setLocation(200,200);
        CubicCurve3Canvas cc = new CubicCurve3Canvas();
        add(cc);
        pack();
        show();
    }
}
