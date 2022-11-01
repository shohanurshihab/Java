import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.FontMetrics;

public class Measure extends Canvas {
    Measure() {
        setSize(300,200);
        setBackground(Color.white);
    }
    public void paint(Graphics g) {
        FontMetrics fm = g.getFontMetrics();
        int x = 20;
        int y = 20;
        g.drawString("Ascent=" + fm.getAscent(),x,y);
        y += fm.getHeight();
        g.drawString("Descent=" + fm.getDescent(),x,y);
        y += fm.getHeight();
        g.drawString("Leading=" + fm.getLeading(),x,y);
        y += fm.getHeight();
        g.drawString("Height=" + fm.getHeight(),x,y);
        y += fm.getHeight();
        g.drawString("Width of \"mink\"=" + fm.stringWidth("mink"),x,y);
    }
}
