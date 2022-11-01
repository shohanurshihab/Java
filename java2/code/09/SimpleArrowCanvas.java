import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.geom.GeneralPath;
public class SimpleArrowCanvas extends Canvas {
    SimpleArrowCanvas() {
        setSize(200,200);
    }
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        AffineTransform at = new AffineTransform();
        at.setToTranslation(90.0,90.0);
        at.scale(2.0,2.0);
        g2.setTransform(at);
        GeneralPath gp = getArrow();
        g2.fill(gp);
    }
    private GeneralPath getArrow() {
        GeneralPath gp =
            new GeneralPath(GeneralPath.WIND_EVEN_ODD);
        gp.moveTo(0.0f,-15.0f);
        gp.lineTo(10.0f,5.0f);
        gp.lineTo(5.0f,5.0f);
        gp.lineTo(5.0f,15.0f);
        gp.lineTo(-5.0f,15.0f);
        gp.lineTo(-5.0f,5.0f);
        gp.lineTo(-10.0f,5.0f);
        gp.closePath();
        return(gp);
    }
}
