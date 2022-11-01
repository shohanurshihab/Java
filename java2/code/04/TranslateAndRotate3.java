import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

public class TranslateAndRotate3 extends Canvas {
    private int x[] = {   0, 10, 5,  5, -5, -5, -10 };
    private int y[] = { -15,  5, 5, 15, 15,  5,  5, };
    TranslateAndRotate3() {
        setSize(150,150);
        setBackground(Color.white);
    }
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        AffineTransform at;

        at = new AffineTransform();
        at.setToTranslation(60.0,60.0);
        at.rotate(Math.PI / 4.0);
        g2.setTransform(at);
        g2.setColor(Color.blue);
        g2.fillPolygon(x,y,7);

        at = new AffineTransform();
        at.setToRotation(Math.PI / 4.0);
        at.translate(60.0,60.0);
        g2.setTransform(at);
        g2.setColor(Color.red);
        g2.fillPolygon(x,y,7);
    }
}
