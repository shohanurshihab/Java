import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.geom.GeneralPath;
class ScaledArrowCanvas extends Canvas {
    ScaledArrowCanvas() {
        setSize(200,220);
    }
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        GeneralPath gp = getArrow();
        AffineTransform at = new AffineTransform();
        at.setToTranslation(30.0,50.0);
        g2.setTransform(at);
        g2.draw(gp);
        at.setToTranslation(60.0,80.0);
        at.scale(2.0,2.0);
        g2.setTransform(at);
        g2.draw(gp);
        at.setToTranslation(110.0,140.0);
        at.scale(4.0,4.0);
        g2.setTransform(at);
        g2.draw(gp);
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
