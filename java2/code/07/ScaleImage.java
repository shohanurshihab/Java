import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.image.FilteredImageSource;
import java.awt.image.ImageProducer;
import java.awt.image.ReplicateScaleFilter;

public class ScaleImage extends Canvas {
    private int h;
    private int w;
    private Image image;
    private Image taller;
    private Image wider;
    private Image bigger;
    ScaleImage(Image image,int scaleType) {
        this.image = image;
        h = image.getHeight(this);
        w = image.getWidth(this);
        wider = image.getScaledInstance(3*w,h,scaleType);
        taller = image.getScaledInstance(h,3*h,scaleType);
        bigger = image.getScaledInstance(3*w,3*h,scaleType);
        setSize(4*w,4*h);
        MediaTracker mt = new MediaTracker(this);
        mt.addImage(wider,1);
        mt.addImage(taller,1);
        mt.addImage(bigger,1);
        try {
            mt.waitForAll();
        } catch(Exception e) {
            System.err.println(e);
            System.exit(1);
        }
    }
    public void paint(Graphics g) {
        g.drawImage(image,0,0,this);
        g.drawImage(wider,w,0,this);
        g.drawImage(taller,0,h,this);
        g.drawImage(bigger,w,h,this);
    }
}
