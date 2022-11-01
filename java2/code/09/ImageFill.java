import java.awt.Frame;
import java.awt.MediaTracker;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
class ImageFill extends Frame {
    Image fillImage;
    public static void main(String arg[]) {
        new ImageFill();
    }
    ImageFill() {
        super("ImageFill");
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e)
                { System.exit(0); } } );
        fillImage = getToolkit().getImage("fill.gif");
        MediaTracker mt = new MediaTracker(this);
        mt.addImage(fillImage,1);
        try {
            mt.waitForAll();
        } catch(Exception e) {
            System.out.println(e);
            System.exit(1);
        }
        setLocation(200,150);
        ImageFillCanvas ic = new ImageFillCanvas(fillImage);
        add(ic);
        pack();
        show();
    }
}
