import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class Block extends Canvas {
    Block() {
        setSize(400,200);
        setBackground(Color.pink);
    }
    public void paint(Graphics g) {
        g.fillRect(75,50,250,100);
    }
}
