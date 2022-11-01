import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.geom.GeneralPath;
public class ZigZagCanvas extends Canvas {
    ZigZagCanvas() {
        setSize(325,315);
    }
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        GeneralPath gp = getZigZag();
        AffineTransform at = new AffineTransform();
        at.setToTranslation(30.0,40.0);
        g2.setTransform(at);
        g2.draw(gp);
        at.setToTranslation(30.0,170.0);
        g2.setTransform(at);
        g2.fill(gp);
    }
    private GeneralPath getZigZag() {
        GeneralPath gp =
            new GeneralPath(GeneralPath.WIND_EVEN_ODD);
        gp.moveTo(0.0f,0.0f);
        gp.lineTo(80.0f,120.0f);
        gp.lineTo(160.0f,0.0f);
        gp.lineTo(240.0f,120.0f);
        gp.lineTo(240.0f,0.0f);
        gp.lineTo(160.0f,120.0f);
        gp.lineTo(80.0f,0.0f);
        gp.lineTo(0.0f,120.0f);
        gp.closePath();
        return(gp);
    }
}
