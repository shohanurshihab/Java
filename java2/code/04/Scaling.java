import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

public class Scaling extends Canvas {
    private int x[] = {   0, 10, 5,  5, -5, -5, -10 };
    private int y[] = { -15,  5, 5, 15, 15,  5,  5, };
    Scaling() {
        setSize(300,200);
        setBackground(Color.white);
    }
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        AffineTransform at = new AffineTransform();

        at.setToTranslation(100.0,100.0);
        g2.setTransform(at);
        g2.drawPolygon(x,y,7);

        at.setToTranslation(200.0,100.0);
        at.scale(3.0,3.0);
        g2.setTransform(at);
        g2.drawPolygon(x,y,7);
    }
}
