import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class GeneralShape extends Frame {
    public static void main(String arg[]) {
        new GeneralShape();
    }
    GeneralShape() {
        super("GeneralShape");
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e)
                { System.exit(0); } } );
        setLocation(200,200);
        GeneralShapeCanvas sc = new GeneralShapeCanvas();
        add(sc);
        pack();
        show();
    }
}
