import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
class TransformImageCanvas extends Canvas {
    private boolean needBuild = true;
    private BufferedImage normal;
    private BufferedImage current;
    private AffineTransform at;
    private RenderingHints hints;
    private int w;
    private int h;
    TransformImageCanvas(Image image) {
        w = image.getWidth(this);
        h = image.getHeight(this);
        at = new AffineTransform();
        normal = new BufferedImage(w,h,BufferedImage.TYPE_INT_RGB);
        current = normal;
        Graphics2D g2 = normal.createGraphics();
        g2.drawImage(image,0,0,this);
        setSize(w,h);
    }
    public void paint(Graphics g) {
        if(needBuild) {
            AffineTransformOp op = new AffineTransformOp(at,hints);
            current = op.filter(normal,null);
            needBuild = false;
        }
        g.drawImage(current,0,0,this);
    }
    public void setIdentity() {
        at = new AffineTransform();
        needBuild = true;
        repaint();
    }
    public void setRotate() {
        at.setToTranslation(w/2,h/2);
        at.rotate(Math.PI/4);
        at.translate(-w/2,-h/2);
        needBuild = true;
        repaint();
    }
    public void setShear() {
        at.setToTranslation(w/2,h/2);
        at.shear(0.7,0.7);
        at.translate(-w/2,-h/2);
        needBuild = true;
        repaint();
    }
    public void setScaleDown() {
        at.setToTranslation(0.3 * w/2,0.3 * h/2);
        at.scale(0.3,0.3);
        at.translate(-w/2,-h/2);
        needBuild = true;
        repaint();
    }
    public void setScaleUp() {
        at.setToTranslation(w/2,h/2);
        at.scale(1.5,1.5);
        at.translate(-w/2,-h/2);
        needBuild = true;
        repaint();
    }
    public void setHints(RenderingHints hints) {
        this.hints = hints;
        needBuild = true;
        repaint();
    }
}
