import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class Three extends Canvas {
    Three() {
        setSize(350,500);
        setBackground(Color.cyan);
    }
    public void paint(Graphics g) {
        g.drawRect(50,50,250,100);
        g.drawRoundRect(50,200,250,100,125,50);
        g.drawOval(50,350,250,100);
    }
}
