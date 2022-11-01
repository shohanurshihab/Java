import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.geom.GeneralPath;
class WindingCanvas extends Canvas {
    WindingCanvas() {
        setSize(325,420);
    }
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        GeneralPath gp;
        gp = getWinding(GeneralPath.WIND_EVEN_ODD);
        AffineTransform at = new AffineTransform();
        at.setToTranslation(30.0,60.0);
        g2.setTransform(at);
        g2.draw(gp);
        at.setToTranslation(30.0,180.0);
        g2.setTransform(at);
        g2.fill(gp);
        gp = getWinding(GeneralPath.WIND_NON_ZERO);
        at.setToTranslation(30.0,300.0);
        g2.setTransform(at);
        g2.fill(gp);
    }
    private GeneralPath getWinding(int rule) {
        GeneralPath gp = new GeneralPath(rule);
        gp.moveTo(0.0f,40.0f);
        gp.lineTo(180.0f,40.0f);
        gp.lineTo(180.0f,20.0f);
        gp.lineTo(120.0f,20.0f);
        gp.lineTo(120.0f,80.0f);
        gp.lineTo(60.0f,80.0f);
        gp.lineTo(60.0f,0.0f);
        gp.lineTo(240.0f,0.0f);
        gp.lineTo(240.0f,60.0f);
        gp.lineTo(0.0f,60.0f);
        gp.closePath();
        return(gp);
    }
}
                                                                        
