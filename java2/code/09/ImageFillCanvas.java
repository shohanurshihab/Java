import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.TexturePaint;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;
class ImageFillCanvas extends Canvas {
    Image fillImage;
    Area area;
    ImageFillCanvas(Image fillImage) {
        this.fillImage = fillImage;
        area = new Area(new Ellipse2D.Float(50f,50f,200f,200f));
        area.add(new Area(new Rectangle2D.Float(50f,50f,100f,100f)));
        area.add(new Area(new Rectangle2D.Float(150f,150f,100f,100f)));
        setSize(300,300);
    }
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        BufferedImage bi = new BufferedImage(36,36,BufferedImage.TYPE_INT_RGB);
        Graphics2D ig = bi.createGraphics();
        ig.drawImage(fillImage,0,0,this);
        Rectangle2D r = new Rectangle2D.Float();
        r.setRect(0f,0f,36f,36f);
        TexturePaint tp = new TexturePaint(bi,r);
        g2.setPaint(tp);
        g2.fill(area);
    }
}
