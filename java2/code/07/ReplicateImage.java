import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.FilteredImageSource;
import java.awt.image.ImageProducer;
import java.awt.image.ReplicateScaleFilter;

public class ReplicateImage extends Canvas {
    private int h;
    private int w;
    private Image image;
    private Image taller;
    private Image wider;
    private Image bigger;
    ReplicateImage(Image image) {
        this.image = image;
        h = image.getHeight(this);
        w = image.getWidth(this);
        wider = getScaledImage(3*w,h);
        taller = getScaledImage(h,3*h);
        bigger = getScaledImage(3*w,3*h);
        setSize(4*w,4*h);
    }
    private Image getScaledImage(int width,int height) {
        ImageProducer ip = image.getSource();
        ReplicateScaleFilter rsf = new ReplicateScaleFilter(width,height);
        ImageProducer fip = new FilteredImageSource(ip,rsf);
        return(getToolkit().createImage(fip));
    }
    public void paint(Graphics g) {
        g.drawImage(image,0,0,this);
        g.drawImage(wider,w,0,this);
        g.drawImage(taller,0,h,this);
        g.drawImage(bigger,w,h,this);
    }
}
