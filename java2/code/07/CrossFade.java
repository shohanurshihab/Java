import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;
public class CrossFade extends Frame {
    public static void main(String[] arg) {
        new CrossFade();
    }
    public CrossFade() {
        super("CrossFade");
        Image edgeImage;
        Image centerImage;
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e)
                { System.exit(0); } } );
        edgeImage = Toolkit.getDefaultToolkit().getImage("earth.jpeg");
        centerImage = Toolkit.getDefaultToolkit().getImage("theseus2.jpeg");
        MediaTracker mt = new MediaTracker(this);
        mt.addImage(edgeImage,1);
        mt.addImage(centerImage,1);
        try {
            mt.waitForAll();
        } catch(Exception e) {
            System.err.println(e);
            System.exit(1);
        }
        add(new CrossFadeCanvas(edgeImage,centerImage));
        pack();
        show();
    }
}
