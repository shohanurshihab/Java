import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class HexBars extends Canvas {
    HexBars() {
        setSize(200,200);
    }
    public void paint(Graphics g) {
        Color color;
        int x = 0;
        int y = 0;
        Rectangle rect = getBounds();

        color = new Color(0x00FF0000);
        g.setColor(color);
        g.fillRect(x,y,rect.width,rect.height / 3);

        color = new Color(0x00969696);
        g.setColor(color);
        y += rect.height / 3;
        g.fillRect(x,y,rect.width,rect.height / 3);

        color = new Color(0x00239B64);
        g.setColor(color);
        y += rect.height / 3;
        g.fillRect(x,y,rect.width,rect.height / 3);
    }
}
