import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class OrangeSquare extends Canvas {
    OrangeSquare() {
        setSize(200,200);
    }
    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.fillRect(0,0,200,200);
        g.setColor(Color.orange);
        g.fillRect(50,50,100,100);
    }
}
