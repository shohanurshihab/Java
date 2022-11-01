import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;

public class BunchaShapes {
    static public Shape[] getShapeArray() {
        Shape sarray[] = new Shape[7];
        sarray[0] = new Rectangle2D.Float(50f,50f,200f,200f);
        sarray[1] = new Ellipse2D.Float(50f,300f,200f,200f);
        GeneralPath triangle = new GeneralPath();
        triangle.moveTo(300f,50f);
        triangle.lineTo(300f,250f);
        triangle.lineTo(500f,250f);
        triangle.closePath();
        sarray[2] = triangle;
        sarray[3] = new Line2D.Float(300f,400f,500f,400f);
        sarray[4] = new Line2D.Float(300f,300f,500f,500f);
        sarray[5] = new Line2D.Float(400f,300f,400f,500f);
        sarray[6] = new Line2D.Float(500f,300f,300f,500f);
        return(sarray);
    }
}
