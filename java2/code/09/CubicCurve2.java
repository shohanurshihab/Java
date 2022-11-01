import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
class CubicCurve2 extends Frame {
    public static void main(String arg[]) {
        new CubicCurve2();
    }
    CubicCurve2() {
        super("CubicCurve2");
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e)
                { System.exit(0); } } );
        setLocation(200,200);
        CubicCurve2Canvas cc = new CubicCurve2Canvas();
        add(cc);
        pack();
        show();
    }
}
