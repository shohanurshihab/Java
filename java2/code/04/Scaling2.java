import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

public class Scaling2 extends Canvas {
    private int x[] = {   0, 10, 5,  5, -5, -5, -10 };
    private int y[] = { -15,  5, 5, 15, 15,  5,  5, };
    private int x2[] = new int[8];
    private int y2[] = new int[8];
    Scaling2() {
        setSize(300,200);
        setBackground(Color.white);

        AffineTransform at = new AffineTransform();
        at.setToScale(3.0,3.0);
        for(int i=0; i<7; i++) {
            double pt[] = new double[2];
            pt[0] = (double)x[i];
            pt[1] = (double)y[i];
            at.transform(pt,0,pt,0,1);
            x2[i] = (int)pt[0];
            y2[i] = (int)pt[1];
        }
    }
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        AffineTransform at = new AffineTransform();

        at.setToTranslation(100.0,100.0);
        g2.setTransform(at);
        g2.drawPolygon(x,y,7);

        at.setToTranslation(200.0,100.0);
        g2.setTransform(at);
        g2.drawPolygon(x2,y2,7);
    }
}
