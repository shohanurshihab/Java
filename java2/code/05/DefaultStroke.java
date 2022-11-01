import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;

public class DefaultStroke extends Canvas {
    DefaultStroke() {
        setSize(550,550);
        setBackground(Color.white);
    }
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        Shape shapeArray[] = BunchaShapes.getShapeArray();
        for(int i=0; i<shapeArray.length; i++)
            g2.draw(shapeArray[i]);
    }
}
