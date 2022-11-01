import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;
class SimpleRectangle extends Frame {
    public static void main(String arg[]) {
        new SimpleRectangle();
    }
    SimpleRectangle() {
        super("SimpleRectangle");
        addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent e)
            { System.exit(0); } } );
        setLocation(200,200);
        SimpleRectangleCanvas rc = new SimpleRectangleCanvas();
        add(rc);
        pack();
        show();
    }
}
