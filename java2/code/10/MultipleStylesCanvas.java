import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Font;
import java.awt.font.TextAttribute;
import java.text.AttributedString;
import java.text.AttributedCharacterIterator;
public class MultipleStylesCanvas extends Canvas {
    MultipleStylesCanvas() {
        setSize(450,350);
    }
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        mixedFonts(g2,50,50);
        mixedColors(g2,50,100);
        wordUnderline(g2,50,150);
        wordInversion(g2,50,200);
        wordStrike(g2,50,250);
        expandingText(g2,50,300);
    }
    private void mixedFonts(Graphics2D g2,int x,int y) {
        Font font1 = new Font("Times New Roman",Font.BOLD,32);
        Font font2 = new Font("sansserif",Font.PLAIN,50);
        AttributedString as = new AttributedString("TwoFonts");
        as.addAttribute(TextAttribute.FONT,font1,0,3);
        as.addAttribute(TextAttribute.FONT,font2,3,8);
        AttributedCharacterIterator aci = as.getIterator();
        g2.drawString(aci,x,y);
    }
    private void mixedColors(Graphics2D g2,int x,int y) {
        Font font = new Font("Courier New Negreta",Font.BOLD,50);
        AttributedString as = new AttributedString("TwoColors");
        as.addAttribute(TextAttribute.FONT,font,0,9);
        as.addAttribute(TextAttribute.FOREGROUND,Color.red,3,9);
        AttributedCharacterIterator aci = as.getIterator();
        g2.drawString(aci,x,y);
    }
    private void wordUnderline(Graphics2D g2,int x,int y) {
        Font font = new Font("Times New Roman",Font.BOLD,40);
        AttributedString as = new AttributedString("Underline one word");
        as.addAttribute(TextAttribute.FONT,font,0,18);
        as.addAttribute(TextAttribute.UNDERLINE,
            TextAttribute.UNDERLINE_ON,10,13);
        AttributedCharacterIterator aci = as.getIterator();
        g2.drawString(aci,x,y);
    }
    private void wordInversion(Graphics2D g2,int x,int y) {
        Font font = new Font("Times New Roman",Font.BOLD,40);
        AttributedString as = new AttributedString("Invert one word");
        as.addAttribute(TextAttribute.FONT,font,0,15);
        as.addAttribute(TextAttribute.SWAP_COLORS,
            TextAttribute.SWAP_COLORS_ON,0,6);
        AttributedCharacterIterator aci = as.getIterator();
        g2.drawString(aci,x,y);
    }
    private void wordStrike(Graphics2D g2,int x,int y) {
        Font font = new Font("Monospace",Font.BOLD,40);
        AttributedString as = new AttributedString("Strike one word");
        as.addAttribute(TextAttribute.FONT,font,0,15);
        as.addAttribute(TextAttribute.STRIKETHROUGH,
            TextAttribute.STRIKETHROUGH_ON,0,6);
        AttributedCharacterIterator aci = as.getIterator();
        g2.drawString(aci,x,y);
    }
    private void expandingText(Graphics2D g2,int x,int y) {
        AttributedString as = new AttributedString("an expanding text line");
        for(int i=0; i<22; i++) {
            Font font = new Font("Monospace",Font.BOLD,i+20);
            as.addAttribute(TextAttribute.FONT,font,i,i+1);
        }
        AttributedCharacterIterator aci = as.getIterator();
        g2.drawString(aci,x,y);
    }
}
