import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.AffineTransform;
class CombineCanvas extends Canvas {
    GeneralPath part1;
    GeneralPath part2;
    GeneralPath part3;
    CombineCanvas() {
        makeParts();
        setSize(300,500);
    }
    private void makeParts() {
        part1 = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
        part1.moveTo(25f,100f);
        part1.lineTo(50f,25f);
        part1.lineTo(75f,100f);

        part2 = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
        part2.moveTo(100f,25f);
        part2.lineTo(100f,100f);

        part3 = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
        part3.moveTo(125f,25f);
        part3.lineTo(150f,100f);
        part3.lineTo(175f,25f);
    }
        
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        AffineTransform at = new AffineTransform();

        // Top row
        at.setToTranslation(25f,50f);
        g2.setTransform(at);
        g2.draw(part1);
        g2.draw(part2);
        g2.draw(part3);

        // Middle row
        GeneralPath unconnected = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
        unconnected.append(part1,false);
        unconnected.append(part2,false);
        unconnected.append(part3,false);
        at.setToTranslation(25f,175f);
        g2.setTransform(at);
        g2.draw(unconnected);

        // Bottom row
        GeneralPath connected = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
        connected.append(part1,true);
        connected.append(part2,true);
        connected.append(part3,true);
        at.setToTranslation(25f,300f);
        g2.setTransform(at);
        g2.draw(connected);
    }
}
