import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class Polygon2 extends Canvas {
    private int x[] = {   0, 10, 5,  5, -5, -5, -10,  0 };
    private int y[] = { -15,  5, 5, 15, 15,  5,  5, -15 };
    Polygon2() {
        setSize(100,50);
        setBackground(Color.white);
    }
    public void paint(Graphics g) {
        for(int i=0; i<7; i++)
            g.drawLine(x[i]+20,y[i]+20,x[i+1]+20,y[i+1]+20);
    }
}
