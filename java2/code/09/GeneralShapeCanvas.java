import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.CubicCurve2D;
import java.awt.geom.Arc2D;
class GeneralShapeCanvas extends Canvas {
    GeneralPath widget;
    GeneralShapeCanvas() {
        setSize(300,320);
        widget = makeWidget();
    }
    private GeneralPath makeWidget() {
        GeneralPath w = new GeneralPath(GeneralPath.WIND_EVEN_ODD);

        // Top left corner
        w.moveTo(110f,100f);
        w.lineTo(110f,120f);
        w.lineTo(150f,120f);

        // Top connecting curve
        CubicCurve2D cc1 = new CubicCurve2D.Float(
            150f,120f,
            170f,120f,
            230f,100f,
            250f,100f);
        w.append(cc1,true);

        // Oval on right
        w.curveTo(270f,80f,
            270f,140f,
            250f,120f);

        // Bottom connecting curve
        CubicCurve2D cc2 = new CubicCurve2D.Float(
            250f,120f,
            230f,120f,
            170f,300f,
            110f,300f);
        w.append(cc2,true);

        // Half circle at left
        Arc2D arc = new Arc2D.Float(10f,100f,
            200f,200f,
            270f,-135f,
            Arc2D.OPEN);
        w.append(arc,true);

        // Draw a straight line to close figure
        w.closePath();
        return(w);
    }
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        g2.draw(widget);
    }
}
