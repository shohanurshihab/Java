import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;
class SimpleRectangleCanvas extends Canvas {
    SimpleRectangleCanvas() {
        setSize(240,90);
    }
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        GeneralPath gp = rectangleShape();
        g2.fill(gp);
    }
    private GeneralPath rectangleShape() {
        GeneralPath gp = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
        gp.moveTo(30.0f,30.0f);
        gp.lineTo(210.0f,30.0f);
        gp.lineTo(210.0f,60.0f);
        gp.lineTo(30.0f,60.0f);
        gp.closePath();
        return(gp);
    }
}
