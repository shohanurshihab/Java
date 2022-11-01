import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class CropImage extends Frame {
    public static void main(String arg[]) {
        new CropImage();
    }
    CropImage() {
        super("CropImage");
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e)
                { System.exit(0); } } );
        setLocation(200,50);
        CropImageCanvas ci = new CropImageCanvas();
        add(ci);
        pack();
        show();
    }
}
