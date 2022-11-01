import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.Font;
import java.awt.font.TextLayout;
import java.awt.font.GlyphVector;
import java.awt.font.FontRenderContext;
import java.text.AttributedCharacterIterator;
import java.text.AttributedString;
import java.util.Map;
public class LayingOutTextCanvas extends Canvas {
    Font font;
    LayingOutTextCanvas() {
        font = new Font("TimesRoman",Font.BOLD,32);
        setSize(400,450);
    }
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        g2.setFont(font);
        simpleString(g2,50,50);
        simpleCharArray(g2,50,100);
        simpleTextLayout(g2,50,150);
        outlineTextLayout(g2,50,200);
        simpleAttributedString(g2,50,250);
        mappedAttributedString(g2,50,300);
        simpleGlyphVector(g2,50,350);
        mappedGlyphVector(g2,50,400);
    }
    private void simpleString(Graphics2D g2,int x,int y) {
        g2.drawString("Simple String",x,y);
    }
    private void simpleCharArray(Graphics2D g2,int x,int y) {
        char[] array = { 'C','h','a','r',' ','A','r','r','a','y' };
        g2.drawChars(array,0,10,x,y);
    }
    private void simpleTextLayout(Graphics2D g2,int x,int y) {
        FontRenderContext frc = new FontRenderContext(null,false,false);
        TextLayout tl = new TextLayout("TextLayout",font,frc);
        tl.draw(g2,x,y);
    }
    private void outlineTextLayout(Graphics2D g2,int x,int y) {
        FontRenderContext frc = new FontRenderContext(null,false,false);
        TextLayout tl = new TextLayout("TextLayout Outline",font,frc);
        Shape s = tl.getOutline(null);
        g2.translate(x,y);
        g2.draw(s);
        g2.translate(-x,-y);
    }
    private void simpleAttributedString(Graphics2D g2,int x,int y) {
        AttributedString as = new AttributedString("AttributedString Default");
        AttributedCharacterIterator aci = as.getIterator();
        g2.drawString(aci,x,y);
    }
    private void mappedAttributedString(Graphics2D g2,int x,int y) {
        Map map = font.getAttributes();
        AttributedString as = new AttributedString("AttributedString Map",map);
        AttributedCharacterIterator aci = as.getIterator();
        g2.drawString(aci,x,y);
    }
    private void simpleGlyphVector(Graphics2D g2,int x,int y) {
        FontRenderContext frc = new FontRenderContext(null,false,false);
        GlyphVector gv = font.createGlyphVector(frc,"GlyphVector");
        g2.drawGlyphVector(gv,x,y);
    }
    private void mappedGlyphVector(Graphics2D g2,int x,int y) {
        FontRenderContext frc = new FontRenderContext(null,false,false);
        Map map = font.getAttributes();
        AttributedString as = new AttributedString("Mapped GlyphVector",map);
        AttributedCharacterIterator aci = as.getIterator();
        GlyphVector gv = font.createGlyphVector(frc,aci);
        g2.drawGlyphVector(gv,x,y);
    }
}
