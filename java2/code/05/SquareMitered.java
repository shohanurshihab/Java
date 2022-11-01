import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.BasicStroke;

public class SquareMitered extends Canvas {
    SquareMitered() {
        setSize(550,550);
        setBackground(Color.white);
    }
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        BasicStroke bs = new BasicStroke(20f,BasicStroke.CAP_SQUARE,
            BasicStroke.JOIN_MITER);
        g2.setStroke(bs);
        Shape shapeArray[] = BunchaShapes.getShapeArray();
        for(int i=0; i<shapeArray.length; i++)
            g2.draw(shapeArray[i]);
    }
}
