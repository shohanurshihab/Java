import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class Square extends Canvas {
    Square() {
        setSize(200,200);
        setBackground(Color.pink);
    }
    public void paint(Graphics g) {
        g.fillRect(50,50,100,100);
    }
}
