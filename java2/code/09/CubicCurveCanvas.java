import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.CubicCurve2D;
import java.awt.geom.Rectangle2D;
public class CubicCurveCanvas extends Canvas {
    CubicCurveCanvas() {
        setSize(300,100);
    }
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        float x1, y1;
        float x1ctl, y1ctl;
        float x2ctl, y2ctl;
        float x2, y2;
        CubicCurve2D.Float curve;

        // First curve
        x1 = 20.0f; y1 = 40.0f;
        x1ctl = 30.0f; y1ctl = 40.0f;
        x2ctl = 60.0f; y2ctl = 70.0f;
        x2 = 60.0f; y2 = 80.0f;
        curve = new CubicCurve2D.Float(
            x1,y1,x1ctl,y1ctl,
            x2ctl,y2ctl,x2,y2);
        controlLine(g2,x1,y1,x1ctl,y1ctl);
        controlLine(g2,x2,y2,x2ctl,y2ctl);
        g2.draw(curve);

        // Second curve
        x1 = 90.0f; y1 = 40.0f;
        x1ctl = 110.0f; y1ctl = 40.0f;
        x2ctl = 130.0f; y2ctl = 60.0f;
        x2 = 130.0f; y2 = 80.0f;
        curve = new CubicCurve2D.Float(
            x1,y1,x1ctl,y1ctl,
            x2ctl,y2ctl,x2,y2);
        controlLine(g2,x1,y1,x1ctl,y1ctl);
        controlLine(g2,x2,y2,x2ctl,y2ctl);
        g2.draw(curve);

        // Third curve
        x1 = 160.0f; y1 = 40.0f;
        x1ctl = 190.0f; y1ctl = 40.0f;
        x2ctl = 200.0f; y2ctl = 50.0f;
        x2 = 200.0f; y2 = 80.0f;
        curve = new CubicCurve2D.Float(
            x1,y1,x1ctl,y1ctl,
            x2ctl,y2ctl,x2,y2);
        controlLine(g2,x1,y1,x1ctl,y1ctl);
        controlLine(g2,x2,y2,x2ctl,y2ctl);
        g2.draw(curve);

        // Fourth curve
        x1 = 230.0f; y1 = 40.0f;
        x1ctl = 240.0f; y1ctl = 40.0f;
        x2ctl = 270.0f; y2ctl = 50.0f;
        x2 = 270.0f; y2 = 80.0f;
        curve = new CubicCurve2D.Float(
            x1,y1,x1ctl,y1ctl,
            x2ctl,y2ctl,x2,y2);
        controlLine(g2,x1,y1,x1ctl,y1ctl);
        controlLine(g2,x2,y2,x2ctl,y2ctl);
        g2.draw(curve);
    }
    private void controlLine(Graphics2D g2,
            float x1,float y1,float x2,float y2) {
        g2.fill(new Rectangle2D.Float(x1 - 3.0f,y1 - 3.0f,6.0f,6.0f));
        g2.drawLine((int)x1,(int)y1,(int)x2,(int)y2);
    }
}
