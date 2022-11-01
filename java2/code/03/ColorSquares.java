import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class ColorSquares extends Canvas {
    ColorSquares() {
        setSize(200,200);
        setBackground(Color.pink);
    }
    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.fillRect(50,50,100,100);
        g.setColor(Color.yellow);
        g.fillRect(75,75,50,50);
    }
}
