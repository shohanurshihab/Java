import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.Canvas;
import java.awt.MediaTracker;
import java.awt.Image;
import java.awt.AWTEvent;
import java.awt.event.WindowEvent;

public class ShowScaleImage extends Frame {
    public static void main(String arg[]) {
        int scaleType;
        if(arg.length == 0)
            scaleType = Image.SCALE_DEFAULT;
        else if(arg[0].equalsIgnoreCase("averaging"))
            scaleType = Image.SCALE_AREA_AVERAGING;
        else if(arg[0].equalsIgnoreCase("fast"))
            scaleType = Image.SCALE_FAST;
        else if(arg[0].equalsIgnoreCase("replicate"))
            scaleType = Image.SCALE_REPLICATE;
        else if(arg[0].equalsIgnoreCase("smooth"))
            scaleType = Image.SCALE_SMOOTH;
        else
            scaleType = Image.SCALE_DEFAULT;
        new ShowScaleImage(scaleType);
    }
    ShowScaleImage(int scaleType) {
        enableEvents(AWTEvent.WINDOW_EVENT_MASK);
        setLocation(25,25);
        Image image = imageFromDisk("earthlet.jpeg");
        ScaleImage canvas = new ScaleImage(image,scaleType);
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
