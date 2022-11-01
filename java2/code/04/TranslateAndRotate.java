import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

public class TranslateAndRotate extends Canvas {
    private int x[] = {   0, 10, 5,  5, -5, -5, -10 };
    private int y[] = { -15,  5, 5, 15, 15,  5,  5, };
    TranslateAndRotate() {
        setSize(100,50);
        setBackground(Color.white);
    }
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        AffineTransform at;

        at = new AffineTransform();
        at.setToTranslation(20.0,20.0);
        g2.setTransform(at);
        g2.drawPolygon(x,y,7);

        at = new AffineTransform();
        at.setToRotation(Math.PI / 4.0);
        g2.setTransform(at);
        g2.drawPolygon(x,y,7);
    }
}
