import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.geom.Arc2D;

public class ArcsScale extends Canvas {
    ArcsScale() {
        setSize(475,300);
        setBackground(Color.white);
    }
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        Arc2D arc = new Arc2D.Double(0d,0d,100d,100d,45d,-270d,Arc2D.PIE);
        AffineTransform at = new AffineTransform();

        // First row
        at.setToTranslation(20d,30d);
        g2.setTransform(at);
        g2.fill(arc);

        at.setToTranslation(140d,30d);
        at.scale(0.5,1.0);
        g2.setTransform(at);
        g2.fill(arc);

        at.setToTranslation(210d,30d);
        at.scale(1.0,0.5);
        g2.setTransform(at);
        g2.fill(arc);

        at.setToTranslation(320d,30d);
        at.scale(1.25,1.25);
        g2.setTransform(at);
        g2.fill(arc);

        // Second row
        at.setToTranslation(20d,160d);
        g2.setTransform(at);
        g2.fill(arc);

        arc.setFrame(0d,0d,50d,100d);
        at.setToTranslation(140d,160d);
        g2.setTransform(at);
        g2.fill(arc);

        arc.setFrame(0d,0d,100d,50d);
        at.setToTranslation(210d,160d);
        g2.setTransform(at);
        g2.fill(arc);

        arc.setFrame(0d,0d,125d,125d);
        at.setToTranslation(320d,160d);
        g2.setTransform(at);
        g2.fill(arc);
    }
}
