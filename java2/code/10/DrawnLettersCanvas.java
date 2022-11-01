import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Font;
import java.awt.Shape;
import java.awt.Color;
import java.awt.geom.AffineTransform;
import java.awt.geom.GeneralPath;
import java.awt.font.TextLayout;
import java.awt.font.FontRenderContext;
public class DrawnLettersCanvas extends Canvas {
    private int height = 200;
    private int width = 550;
    DrawnLettersCanvas() {
        setSize(width,height);
        setBackground(Color.lightGray);
    }
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        AffineTransform at = new AffineTransform();
        at.setToTranslation(10,160);
        Font font = new Font("Times New Roman",Font.BOLD,180);
        FontRenderContext frc = new FontRenderContext(null,false,false);
        TextLayout tl = new TextLayout("Waffle",font,frc);
        Shape shape = tl.getOutline(at);
        GeneralPath gp = new GeneralPath(shape);
        gp.setWindingRule(GeneralPath.WIND_NON_ZERO);
        g2.clip(gp);
        for(int w=0; w<width; w+= 5) {
            g2.drawLine(w,0,w,height);
        }
        for(int h=0; h<height; h+= 5) {
            g2.drawLine(0,h,width,h);
        }
    }
}
