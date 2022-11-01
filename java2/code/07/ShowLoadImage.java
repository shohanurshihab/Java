import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.Canvas;
import java.awt.MediaTracker;
import java.awt.Image;
import java.awt.AWTEvent;
import java.awt.event.WindowEvent;

public class ShowLoadImage extends Frame {
    public static void main(String arg[]) {
        String imageName;
        if(arg.length == 0)
            imageName = "earth.jpeg";
        else
            imageName = arg[0];
        new ShowLoadImage(imageName);
    }
    ShowLoadImage(String imageName) {
        enableEvents(AWTEvent.WINDOW_EVENT_MASK);
        setLocation(25,25);
        Image image = imageFromDisk(imageName);
        LoadImage canvas = new LoadImage(image);
        add(canvas);
        pack();
        show();
    }
    private Image imageFromDisk(String imageName) {
        Image image = Toolkit.getDefaultToolkit().getImage(imageName);
        MediaTracker mt = new MediaTracker(this);
        mt.addImage(image,1);
        try {
            mt.waitForAll();
        } catch(Exception e) {
            System.err.println(e);
            System.exit(1);
        }
        return(image);
    }
   
    public void processWindowEvent(WindowEvent event) {
        if(event.getID() == WindowEvent.WINDOW_CLOSING)
            System.exit(0);
    }
}
