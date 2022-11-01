import java.awt.Canvas;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.Graphics;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class Edges extends Canvas implements KeyListener {
    private int x;
    private int y;
    private String str;
    private int position = 0;
    Edges() {
        setSize(400,300);
        setBackground(Color.yellow);
    }
    public void paint(Graphics g) {
        Font font = new Font("TimesRoman",Font.BOLD | Font.ITALIC,20);
        g.setFont(font);
        FontMetrics fm = g.getFontMetrics();
        Rectangle rect = getBounds();
        switch(position) {
        case 0: // top center
            str = "Top Center";
            x = (rect.width - fm.stringWidth(str)) / 2;
            y = fm.getAscent();
            break;
        case 1: // left center
            str = "Left Center";
            x = 0;
            y = (rect.height - fm.getHeight()) / 2;
            y += fm.getAscent();
            break;
        case 2: // bottom center
            str = "Bottom Center";
            x = (rect.width - fm.stringWidth(str)) / 2;
            y = rect.height - fm.getDescent();
            break;
        case 3: // right center
            str = "Right Center";
            x = rect.width - fm.stringWidth(str);
            y = (rect.height - fm.getHeight()) / 2;
            y += fm.getAscent();
            break;
        case 4: // center
            str = "Center";
            x = (rect.width - fm.stringWidth(str)) / 2;
            y = (rect.height - fm.getHeight()) / 2;
            y += fm.getAscent();
            break;
        }
        g.drawString(str,x,y);
    }
    public void keyPressed(KeyEvent e) {
        if(++position > 4)
            position = 0;
        repaint();
    }
    public void keyReleased(KeyEvent e) {}
    public void keyTyped(KeyEvent e) {}
}
