import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.Color;
import java.awt.Font;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.font.TextLayout;
import java.awt.font.FontRenderContext;
public class LayoutCanvas extends Canvas {
    Font font;
    LayoutCanvas() {
        font = new Font("Times New Roman",Font.BOLD,42);
        setSize(350,450);
    }
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        g2.setFont(font);
        showBounding(g2,50,50);
        showHighlight(g2,50,100);
        showOutlining(g2,50,150);
        showTiltedLine(g2,50,200);
        showTiltedOutline(g2,50,250);
        showShear(g2,50,400);
    }
    private void showBounding(Graphics2D g2,int x,int y) {
        FontRenderContext frc = g2.getFontRenderContext();
        TextLayout tl = new TextLayout("Bounded Text",font,frc);
        tl.draw(g2,x,y);
        Rectangle2D rect = tl.getBounds();
        rect.setRect(rect.getX() + x,rect.getY() + y,
                rect.getWidth(),rect.getHeight());
        g2.draw(rect);
    }
    private void showHighlight(Graphics2D g2,int x,int y) {
        FontRenderContext frc = g2.getFontRenderContext();
        TextLayout tl = new TextLayout("Highlighting",font,frc);
        Rectangle2D rect = tl.getBounds();
        rect.setRect(rect.getX() + x,rect.getY() + y,
                rect.getWidth(),rect.getHeight());
        g2.setColor(Color.lightGray);
        g2.fill(rect);
        g2.setColor(Color.black);
        tl.draw(g2,x,y);
    }
    private void showOutlining(Graphics2D g2,int x,int y) {
        AffineTransform at = new AffineTransform();
        at.setToTranslation(x,y);
        FontRenderContext frc = g2.getFontRenderContext();
        TextLayout tl = new TextLayout("Outlined Text",font,frc);
        Shape s = tl.getOutline(at);
        g2.setColor(Color.red);
        g2.fill(s);
        g2.setColor(Color.black);
        g2.draw(s);
    }
    private void showTiltedLine(Graphics2D g2,int x,int y) {
        FontRenderContext frc = g2.getFontRenderContext();
        TextLayout tl = new TextLayout("Tilted Text",font,frc);
        AffineTransform at = new AffineTransform();
        at.setToTranslation(x,y);
        at.rotate(Math.PI / 8.0);
        Shape s = tl.getOutline(at);
        g2.fill(s);
    }
    private void showTiltedOutline(Graphics2D g2,int x,int y) {
        FontRenderContext frc = g2.getFontRenderContext();
        TextLayout tl = new TextLayout("Tilted Outline",font,frc);
        AffineTransform at = new AffineTransform();
        at.setToTranslation(x,y);
        at.rotate(Math.PI / 8.0);
        Shape s = tl.getOutline(at);
        g2.draw(s);
    }
    private void showShear(Graphics2D g2,int x,int y) {
        FontRenderContext frc = g2.getFontRenderContext();
        TextLayout tl = new TextLayout("Sheared Text",font,frc);
        AffineTransform at = new AffineTransform();
        at.setToTranslation(x,y);
        at.shear(0.5,0.0);
        Shape s = tl.getOutline(at);
        g2.fill(s);
    }
}
