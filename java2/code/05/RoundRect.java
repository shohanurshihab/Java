import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class RoundRect extends Canvas {
    RoundRect() {
        setSize(350,500);
        setBackground(Color.cyan);
    }
    public void paint(Graphics g) {
        g.drawRoundRect(50,50,250,100,10,10);
        g.drawRoundRect(50,200,250,100,10,30);
        g.drawRoundRect(50,350,250,100,50,30);
    }
}
