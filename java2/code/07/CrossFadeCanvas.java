import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.AlphaComposite;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
class CrossFadeCanvas extends Canvas {
    BufferedImage edge;
    BufferedImage center;
    int w;
    int h;
    CrossFadeCanvas(Image edgeImage,Image centerImage) {
        Graphics g2;
        w = Math.min(edgeImage.getWidth(this),centerImage.getWidth(this));
        h = Math.min(edgeImage.getHeight(this),centerImage.getHeight(this));
        createEdge(edgeImage);
        createCenter(centerImage);
        setSize(w,h);
    }
    private void createEdge(Image image) {
        edge = new BufferedImage(w,h,BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = edge.createGraphics();
        g2.drawImage(image,0,0,this);
    }
    private void createCenter(Image image) {
        center = new BufferedImage(w,h,BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = center.createGraphics();
        g2.drawImage(image,0,0,this);
        WritableRaster wr = center.getAlphaRaster();
        double[] array = null;
        int h2 = h / 2;
        for(int y=0; y<h; y++) {
            double factor = Math.abs(y - h2);
            factor /= h2;
            for(int x=0; x<w; x++) {
                array = wr.getPixel(x,y,array);
                array[0] *= 1.0 - factor;
                wr.setPixel(x,y,array);
            }
        }
    }
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        g2.drawImage(edge,0,0,this);
        g2.setComposite(AlphaComposite.SrcOver);
        g2.drawImage(center,0,0,this);
    }
}
