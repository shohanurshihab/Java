import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

public class Circling3 extends Canvas {
    private int x[] = {   0, 10, 5,  5, -5, -5, -10 };
    private int y[] = { -15,  5, 5, 15, 15,  5,  5, };
    Circling3() {
        setSize(300,300);
        setBackground(Color.white);
    }
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        AffineTransform at = new AffineTransform();
        double fpoint[] = { 100.0,0.0 };
        AffineTransform ftrans = new AffineTransform();
        ftrans.setToRotation(Math.PI / 8);

        for(int i=0; i<16; i++) {
            at.setToTranslation(fpoint[0],fpoint[1]);
            at.translate(150.0,150.0);
            g2.setTransform(at);
            g2.drawPolygon(x,y,7);
            ftrans.transform(fpoint,0,fpoint,0,1);
        }
    }
}
