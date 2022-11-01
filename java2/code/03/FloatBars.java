import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class FloatBars extends Canvas {
    FloatBars() {
        setSize(200,200);
    }
    public void paint(Graphics g) {
        Color color;
        int x = 0;
        int y = 0;
        Rectangle rect = getBounds();

        color = new Color((float)1.0,(float)0.0,(float)0.0);
        g.setColor(color);
        g.fillRect(x,y,rect.width,rect.height / 3);

        color = new Color((float)0.586,(float)0.586,(float)0.586);
        g.setColor(color);
        y += rect.height / 3;
        g.fillRect(x,y,rect.width,rect.height / 3);

        color = new Color((float)0.137,(float)0.605,(float)0.391);
        g.setColor(color);
        y += rect.height / 3;
        g.fillRect(x,y,rect.width,rect.height / 3);
    }
}
