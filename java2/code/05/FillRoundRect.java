import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class FillRoundRect extends Canvas {
    FillRoundRect() {
        setSize(350,500);
        setBackground(Color.cyan);
    }
    public void paint(Graphics g) {
        g.setColor(Color.magenta);
        g.fillRoundRect(50,50,250,100,10,10);
        g.fillRoundRect(50,200,250,100,10,30);
        g.fillRoundRect(50,350,250,100,50,30);
    }
}
