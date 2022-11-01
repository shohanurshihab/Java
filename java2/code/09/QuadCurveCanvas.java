import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.QuadCurve2D;
import java.awt.geom.Rectangle2D;
class QuadCurveCanvas extends Canvas {
    QuadCurveCanvas() {
        setSize(300,110);
    }
    private Shape dot(float x,float y) {
        return(new Rectangle2D.Float(x - 3.0f,y - 3.0f,6.0f,6.0f));
    }
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        float x1, y1;
        float xctl, yctl;
        float x2, y2;
        QuadCurve2D.Float curve;

        // First curve
        x1 = 10.0f; y1 = 30.0f;
        xctl = 60.0f; yctl = 30.0f;
        x2 = 60.0f; y2 = 80.0f;
        curve = new QuadCurve2D.Float(
            x1,y1,xctl,yctl,x2,y2);
        g2.fill(dot(x1,y1));
        g2.fill(dot(x2,y2));
        g2.draw(dot(xctl,yctl));
        g2.draw(curve);

        // Second curve
        x1 = 110.0f; y1 = 30.0f;
        xctl = 90.0f; yctl = 60.0f;
        x2 = 110.0f; y2 = 90.0f;
        curve = new QuadCurve2D.Float(
            x1,y1,xctl,yctl,x2,y2);
        g2.fill(dot(x1,y1));
        g2.fill(dot(x2,y2));
        g2.draw(dot(xctl,yctl));
        g2.draw(curve);

        // Third curve
        x1 = 150.0f; y1 = 30.0f;
        xctl = 180.0f; yctl = 60.0f;
        x2 = 150.0f; y2 = 90.0f;
        curve = new QuadCurve2D.Float(
            x1,y1,xctl,yctl,x2,y2);
        g2.fill(dot(x1,y1));
        g2.fill(dot(x2,y2));
        g2.draw(dot(xctl,yctl));
        g2.draw(curve);

        // Fourth curve
        x1 = 210.0f; y1 = 30.0f;
        xctl = 230.0f; yctl = 90.0f;
        x2 = 250.0f; y2 = 30.0f;
        curve = new QuadCurve2D.Float(
            x1,y1,xctl,yctl,x2,y2);
        g2.fill(dot(x1,y1));
        g2.fill(dot(x2,y2));
        g2.draw(dot(xctl,yctl));
        g2.draw(curve);
    }
}
