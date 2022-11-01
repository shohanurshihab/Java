import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class Polygon3 extends Canvas {
    private int x[] = {   0, 10, 5,  5, -5, -5, -10 };
    private int y[] = { -15,  5, 5, 15, 15,  5,  5  };
    Polygon3() {
        setSize(100,50);
        setBackground(Color.white);
    }
    public void paint(Graphics g) {
        g.drawPolygon(x,y,7);
    }
}
