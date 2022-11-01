import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GradientPaint;
import java.awt.geom.Rectangle2D;

public class HorizontalGradient extends Canvas {
    HorizontalGradient() {
        setSize(400,300);
    }
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        Rectangle2D rect = new Rectangle2D.Float();
        rect.setRect(0f,0f,400f,300f);
        GradientPaint gp;
        gp = new GradientPaint(0f,0f,Color.cyan,400f,0f,Color.green);
        g2.setPaint(gp);
        g2.fill(rect);
    }
}
