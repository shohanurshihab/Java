import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;
public class AreaManipulateCanvas extends Canvas {
    Area box;
    Area ellipse;
    AreaManipulateCanvas() {
        setSize(460,400);
    }
    private void makeParts() {
        Rectangle2D b = new Rectangle2D.Float(50f,0f,100f,40f);
        box = new Area(b);
        Ellipse2D e = new Ellipse2D.Float(0f,10f,200f,20f);
        ellipse = new Area(e);
    }
        
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        AffineTransform at = new AffineTransform();

        // Top center. Separate figures.
        makeParts();
        at.setToTranslation(110f,50f);
        g2.setTransform(at);
        g2.draw(box);
        g2.draw(ellipse);

        // Area add().
        makeParts();
        box.add(ellipse);
        at.setToTranslation(10f,100f);
        g2.setTransform(at);
        g2.draw(box);
        at.setToTranslation(220f,100f);
        g2.setTransform(at);
        g2.fill(box);

        // Area exclusiveOr().
        makeParts();
        box.exclusiveOr(ellipse);
        at.setToTranslation(10f,150f);
        g2.setTransform(at);
        g2.draw(box);
        at.setToTranslation(220f,150f);
        g2.setTransform(at);
        g2.fill(box);

        // Area intersect().
        makeParts();
        box.intersect(ellipse);
        g2.setTransform(at);
        at.setToTranslation(10f,200f);
        g2.draw(box);
        at.setToTranslation(220f,200f);
        g2.setTransform(at);
        g2.fill(box);

        // Area subtract().
        makeParts();
        box.subtract(ellipse);
        at.setToTranslation(10f,250f);
        g2.setTransform(at);
        g2.draw(box);
        at.setToTranslation(220f,250f);
        g2.setTransform(at);
        g2.fill(box);

        // Area subtract().
        makeParts();
        ellipse.subtract(box);
        at.setToTranslation(10f,300f);
        g2.setTransform(at);
        g2.draw(ellipse);
        at.setToTranslation(220f,300f);
        g2.setTransform(at);
        g2.fill(ellipse);
    }
}
