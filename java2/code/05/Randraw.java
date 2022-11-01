import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Randraw extends Canvas {
    Randraw() {
        setSize(400,300);
        setBackground(Color.white);
    }
    public void paint(Graphics g) {
        Rectangle rect = getBounds();
        for(int i=0; i<100; i++) {
            g.setColor(new Color(randint(0,255),randint(0,255),randint(0,255)));
            int x = randint(-rect.width,rect.width);
            int y = randint(-rect.height,rect.height);
            int width = randint(5,rect.width);
            int height = randint(5,rect.height);
            switch(randint(0,4)) {
            case 0:
                g.drawRect(x,y,width,height);        
                break;
            case 1:
                g.fillRect(x,y,width,height);        
                break;
            case 3:
                g.drawOval(x,y,width,height);        
                break;
            case 4:
                g.fillOval(x,y,width,height);        
                break;
            }
        }
    }
    private int randint(int low,int high) {
        return(((int)((high-low+1)*(Math.random()))) + low);
    }
}
