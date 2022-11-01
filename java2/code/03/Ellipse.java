import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class Ellipse extends Canvas {
    Ellipse() {
        setSize(400,200);
        setBackground(Color.pink);
    }
    public void paint(Graphics g) {
        g.fillOval(75,50,250,100);
    }
}
