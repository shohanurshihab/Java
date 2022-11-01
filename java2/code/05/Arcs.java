import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Arc2D;

public class Arcs extends Canvas {
    Arcs() {
        setSize(350,350);
        setBackground(Color.white);
    }
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        Arc2D arc = new Arc2D.Double();

        // First row
        arc.setArc(10d,30d,100d,100d,0d,45d,Arc2D.PIE);
        g2.draw(arc);
        arc.setArc(120d,30d,100d,100d,0d,45d,Arc2D.CHORD);
        g2.draw(arc);
        arc.setArc(230d,30d,100d,100d,0d,45d,Arc2D.OPEN);
        g2.draw(arc);

        // Second row
        arc.setArc(10d,60d,100d,100d,0d,-135d,Arc2D.PIE);
        g2.draw(arc);
        arc.setArc(120d,60d,100d,100d,0d,-135d,Arc2D.CHORD);
        g2.draw(arc);
        arc.setArc(230d,60d,100d,100d,0d,-135d,Arc2D.OPEN);
        g2.draw(arc);

        // Third row
        arc.setArc(10d,190d,100d,100d,45d,270d,Arc2D.PIE);
        g2.draw(arc);
        arc.setArc(120d,190d,100d,100d,45d,270d,Arc2D.CHORD);
        g2.draw(arc);
        arc.setArc(230d,190d,100d,100d,45d,270d,Arc2D.OPEN);
        g2.draw(arc);
    }
}
