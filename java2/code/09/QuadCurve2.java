import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
class QuadCurve2 extends Frame {
    public static void main(String arg[]) {
        new QuadCurve2();
    }
    QuadCurve2() {
        super("QuadCurve2");
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e)
                { System.exit(0); } } );
        setLocation(200,100);
        QuadCurve2Canvas qc = new QuadCurve2Canvas();
        add(qc);
        pack();
        show();
    }
}
