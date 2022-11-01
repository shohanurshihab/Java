import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Font;
import java.awt.Shape;
import java.awt.Color;
import java.awt.Image;
import java.awt.geom.AffineTransform;
import java.awt.geom.GeneralPath;
import java.awt.font.TextLayout;
import java.awt.font.FontRenderContext;
class DrawnLetters2Canvas extends Canvas {
    private GeneralPath generalPath;
    private int width = 550;
    private int height = 200;
    private Image image;
    DrawnLetters2Canvas() {
        setSize(width,height);
        setBackground(Color.lightGray);
        AffineTransform at = new AffineTransform();
        at.setToTranslation(10,160);
        Font font = new Font("Times New Roman",Font.BOLD,180);
        FontRenderContext frc = new FontRenderContext(null,false,false);
        TextLayout tl = new TextLayout("Waffle",font,frc);
        generalPath = new GeneralPath(tl.getOutline(at));
        generalPath.setWindingRule(GeneralPath.WIND_EVEN_ODD);
    }
    public void paint(Graphics g) {
        if(image == null) {
            image = createImage(width,height);
            Graphics2D g2 = (Graphics2D)image.getGraphics();
            g2.clip(generalPath);
            for(int w=0; w<width; w+= 5) {
                g2.drawLine(w,0,w,height);
            }
            for(int h=0; h<height; h+= 5) {
                g2.drawLine(0,h,width,h);
            }
        }
        g.drawImage(image,0,0,null);
    }
}
