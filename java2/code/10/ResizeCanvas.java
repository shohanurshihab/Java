import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Font;
import java.awt.Shape;
import java.awt.font.TextLayout;
import java.awt.font.FontRenderContext;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
class ResizeCanvas extends Canvas {
    private TextLayout textLayout;
    private AffineTransform affineTransform;
    ResizeCanvas() {
        setSize(350,50);
        Font font = new Font("Arial",Font.PLAIN,40);
        FontRenderContext frc = new FontRenderContext(null,false,false);
        textLayout = new TextLayout("RubberWord",font,frc);
    }
    private void createTransform() {
        Rectangle2D tRect = textLayout.getBounds();
        Rectangle2D wRect = getBounds();
        double xDelta = (wRect.getWidth()-5) / tRect.getWidth();
        double yDelta = (wRect.getHeight()-5) / tRect.getHeight();
        affineTransform = new AffineTransform();
        affineTransform.scale(xDelta,yDelta);
        affineTransform.translate(0,30);
    }
    public void paint(Graphics g) {
        createTransform();
        Shape text = textLayout.getOutline(affineTransform);
        Graphics2D g2 = (Graphics2D)g;
        g2.fill(text);
    }
}
