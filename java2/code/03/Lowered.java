import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Lowered extends Canvas {
    Lowered() {
        setSize(200,150);
    }
    public void paint(Graphics g) {
        g.setColor(Color.cyan);
        int x = 25;
        int y = 25;
        int width = 150;
        int hieght = 100;
        g.fillRect(x,y,width,hieght);
        for(int i=0; i<5; i++) {
            g.draw3DRect(x,y,width,hieght,false);
            x--;
            y--;
            width += 2;
            hieght += 2;
        }
    }
}
