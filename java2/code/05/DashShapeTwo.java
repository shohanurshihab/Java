import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.BasicStroke;

public class DashShapeTwo extends Canvas {
    private float dashPattern[] = {40f,40f};
    DashShapeTwo() {
        setSize(550,550);
        setBackground(Color.white);
    }
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        BasicStroke bs = new BasicStroke(20f,BasicStroke.CAP_ROUND,
            BasicStroke.JOIN_ROUND,10f,dashPattern,0f);
        g2.setStroke(bs);
        Shape shapeArray[] = BunchaShapes.getShapeArray();
        for(int i=0; i<shapeArray.length; i++)
            g2.draw(shapeArray[i]);
    }
}
