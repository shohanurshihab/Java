import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.FilteredImageSource;
import java.awt.image.ImageProducer;
import java.awt.image.ReplicateScaleFilter;

public class RecolorImage extends Canvas {
    private Image image;
    private Image darker;
    RecolorImage(Image image) {
        this.image = image;
        darker = getRecoloredImage();
        setSize(image.getWidth(this),2*image.getHeight(this));
    }
    private Image getRecoloredImage() {
        ImageProducer ip = image.getSource();
        RecolorImageFilter rif = new RecolorImageFilter();
        ImageProducer fip = new FilteredImageSource(ip,rif);
        return(getToolkit().createImage(fip));
    }
    public void paint(Graphics g) {
        g.drawImage(image,0,0,this);
        g.drawImage(darker,0,image.getHeight(this),this);
    }
}
