import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

public class Shearing extends Canvas {
    private int x[] = {   0, 10, 5,  5, -5, -5, -10 };
    private int y[] = { -15,  5, 5, 15, 15,  5,  5, };
    Shearing() {
        setSize(400,250);
        setBackground(Color.white);
    }
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        AffineTransform at = new AffineTransform();

        for(int i=0; i<10; i++) {
            double shear = i * 0.1;
            double xpos = 50.0 + (i * 30.0);

            at.setToTranslation(xpos,50.0);
            at.shear(shear,0.0);
            g2.setTransform(at);
            g2.drawPolygon(x,y,7);

            at.setToTranslation(xpos,100.0);
            at.shear(0.0,shear);
            g2.setTransform(at);
            g2.drawPolygon(x,y,7);

            at.setToTranslation(xpos,150.0);
            at.shear(shear,shear);
            g2.setTransform(at);
            g2.drawPolygon(x,y,7);
        }
    }
}
