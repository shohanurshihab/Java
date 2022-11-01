import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class RedSquare extends Canvas {
    RedSquare() {
        setSize(200,200);
    }
    public void paint(Graphics g) {
        Rectangle rect = getBounds();
        g.setColor(Color.cyan);
        g.fillRect(0,0,rect.width,rect.height);
        g.setColor(Color.red);
        g.fillRect(50,50,rect.width - 100,rect.height - 100);
    }
}
