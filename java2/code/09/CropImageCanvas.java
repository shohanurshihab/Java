import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.MediaTracker;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.FilteredImageSource;
import java.awt.image.CropImageFilter;
import java.awt.image.ImageProducer;
public class CropImageCanvas extends Canvas {
    private Image image;
    private Image cropImage;
    CropImageCanvas() {
        image = Toolkit.getDefaultToolkit().getImage("halebopp.jpeg");
        CropImageFilter cf = new CropImageFilter(350,10,100,100);
        ImageProducer ip = image.getSource();
        FilteredImageSource is = new FilteredImageSource(ip,cf);
        cropImage = getToolkit().createImage(is);
        MediaTracker mt = new MediaTracker(this);
        mt.addImage(image,1);
        mt.addImage(cropImage,1);
        try {
            mt.waitForAll();
        } catch(Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
        setSize(image.getWidth(this),image.getHeight(this));
    }
    public void paint(Graphics g) {
        g.drawImage(image,0,0,this);
        g.drawImage(cropImage,20,200,this);
    }
}
