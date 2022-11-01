import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Bars extends Canvas {
    Bars() {
        setSize(200,200);
    }
    public void paint(Graphics g) {
        Color color;
        int x = 0;
        int y = 0;
        Rectangle rect = getBounds();

        color = new Color(255,0,0);
        g.setColor(color);
        g.fillRect(x,y,rect.width,rect.height / 3);

        color = new Color(150,150,150);
        g.setColor(color);
        y += rect.height / 3;
        g.fillRect(x,y,rect.width,rect.height / 3);

        color = new Color(35,155,100);
        g.setColor(color);
        y += rect.height / 3;
        g.fillRect(x,y,rect.width,rect.height / 3);
    }
}
