import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

public class Scaling3 extends Canvas {
    private int x[] = {   0, 10, 5,  5, -5, -5, -10 };
    private int y[] = { -15,  5, 5, 15, 15,  5,  5, };
    Scaling3() {
        setSize(400,200);
        setBackground(Color.white);
    }
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        AffineTransform at = new AffineTransform();

        double xoffset = 50.0;
        double yoffset = 50.0;
        double scaleup = 1.0;
        double scaledown = 1.0;
        double angle = 0.0;
        
        for(int i=0; i<10; i++) {
            at.setToTranslation(xoffset,yoffset);
            at.scale(scaleup,scaleup);
            at.rotate(angle);
            g2.setTransform(at);
            g2.drawPolygon(x,y,7);

            at.setToTranslation(xoffset,yoffset+100.0);
            at.scale(scaledown,scaledown);
            at.rotate(angle);
            g2.setTransform(at);
            g2.drawPolygon(x,y,7);

            xoffset += 30.0;
            scaleup += 0.1;
            scaledown -= 0.1;
            angle += Math.PI / 16;
        }
    }
}
