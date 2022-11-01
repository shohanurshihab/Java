import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Shading extends Canvas {
    Shading() {
        setSize(250,200);
    }
    public void paint(Graphics g) {
        Color light2dark = Color.white;
        Color dark2light = Color.darkGray;
        for(int i=0; i<5; i++) {
            g.setColor(light2dark);
            g.fillRect(i * 50,0,50,100);
            g.setColor(dark2light);
            g.fillRect(i * 50,100,50,100);
            light2dark = light2dark.darker();
            dark2light = dark2light.brighter();
        }
    }
}
