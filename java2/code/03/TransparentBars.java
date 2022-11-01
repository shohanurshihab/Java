import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class TransparentBars extends Canvas {
    TransparentBars() {
        setSize(200,200);
    }
    public void paint(Graphics g) {
        Color color;
        int x = 0;
        int y = 0;
        Rectangle rect = getBounds();

        g.setColor(Color.blue);
        g.fillOval(0,0,rect.width,rect.height);

        color = new Color(255,0,0,200);
        g.setColor(color);
        g.fillRect(x,y,rect.width,rect.height / 3);

        color = new Color(150,150,150,200);
        g.setColor(color);
        y += rect.height / 3;
        g.fillRect(x,y,rect.width,rect.height / 3);

        color = new Color(35,155,100,200);
        g.setColor(color);
        y += rect.height / 3;
        g.fillRect(x,y,rect.width,rect.height / 3);
    }
}
