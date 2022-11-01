import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.BasicStroke;

public class DashLines extends Canvas {
    private float dashPattern1[] = {40f,40f};
    private float dashPattern2[] = {40f,20f};
    private float dashPattern3[] = {40f,30f,20f,10f};
    DashLines() {
        setSize(550,250);
        setBackground(Color.white);
    }
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        BasicStroke bs;
        bs = new BasicStroke(20f,BasicStroke.CAP_BUTT,
            BasicStroke.JOIN_BEVEL,10f,dashPattern1,0f);
        g2.setStroke(bs);
        g2.drawLine(50,50,450,50);
        bs = new BasicStroke(20f,BasicStroke.CAP_BUTT,
            BasicStroke.JOIN_BEVEL,10f,dashPattern2,0f);
        g2.setStroke(bs);
        g2.drawLine(50,100,450,100);
        bs = new BasicStroke(20f,BasicStroke.CAP_BUTT,
            BasicStroke.JOIN_BEVEL,10f,dashPattern3,0f);
        g2.setStroke(bs);
        g2.drawLine(50,150,450,150);
        bs = new BasicStroke(20f,BasicStroke.CAP_BUTT,
            BasicStroke.JOIN_BEVEL,10f,dashPattern3,70f);
        g2.setStroke(bs);
        g2.drawLine(50,200,450,200);
    }
}
