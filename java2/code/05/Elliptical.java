import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;

public class Elliptical extends Canvas {
    Elliptical() {
        setSize(200,180);
        setBackground(Color.white);
    }
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        Shape shape;
        shape = new Ellipse2D.Float(50f,50f,100f,80f);
        g2.draw(shape);
    }
}
