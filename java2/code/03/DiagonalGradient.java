import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GradientPaint;
import java.awt.geom.Rectangle2D;

public class DiagonalGradient extends Canvas {
    DiagonalGradient() {
        setSize(300,300);
    }
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        Rectangle2D rect = new Rectangle2D.Float();
        rect.setRect(0f,0f,300f,300f);
        GradientPaint gp;
        gp = new GradientPaint(0f,0f,Color.pink,300f,300f,Color.white);
        g2.setPaint(gp);
        g2.fill(rect);
    }
}
