import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

public class Flipping extends Canvas {
    private int x[] = {-4,-8,-7,-1,-1,3,16,16,10,4,4};
    private int y[] = {-12,3,8,8,4,8,8,4,3,-3,-12};
    Flipping() {
        setSize(200,150);
        setBackground(Color.white);
    }
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        AffineTransform at;

        at = new AffineTransform(1.0,0.0,0.0,1.0,0.0,0.0);
        at.translate(50,50);
        at.scale(3.0,3.0);
        g2.setTransform(at);
        g2.drawPolygon(x,y,11);

        at = new AffineTransform(-1.0,0.0,0.0,1.0,0.0,0.0);
        at.translate(-150,50);
        at.scale(3.0,3.0);
        g2.setTransform(at);
        g2.drawPolygon(x,y,11);

        at = new AffineTransform(1.0,0.0,0.0,-1.0,0.0,0.0);
        at.translate(50,-100);
        at.scale(3.0,3.0);
        g2.setTransform(at);
        g2.drawPolygon(x,y,11);

        at = new AffineTransform(-1.0,0.0,0.0,-1.0,0.0,0.0);
        at.translate(-150,-100);
        at.scale(3.0,3.0);
        g2.setTransform(at);
        g2.drawPolygon(x,y,11);
    }
}
