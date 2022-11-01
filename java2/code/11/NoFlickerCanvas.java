import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
public class NoFlickerCanvas extends Canvas 
            implements Runnable {
    private Rectangle rect = null;
    private boolean running = false;
    private Color foreground;
    private Color background;
    private Thread looper;
    private int diameter;
    private int xCurrent;
    private int xLeft;
    private int xRight;
    private BufferedImage bufferedimage;
    NoFlickerCanvas() {
        setSize(250,100);
    }
    public void init() {
        background = Color.lightGray;
        foreground = Color.black;
    }
    public void start() {
        if(!running) {
            running = true;
            looper = new Thread(this);
            looper.start();
        }
    }
    public void stop() {
        running = false;
    }
    public void run() {
        try {
            while(running) {
                if(xCurrent++ > xRight)
                    xCurrent = xLeft;
                repaint();
                looper.sleep(20);
            }
        } catch(InterruptedException e) {
            running = false;
        }
    }
    public void update(Graphics g) {
        if(!getBounds().equals(rect)) {
            rect = getBounds();
            xLeft = 0;
            xCurrent = 0;
            diameter = rect.height;
            xRight = rect.width - diameter;
            bufferedimage = new BufferedImage(rect.width,rect.height,
                        BufferedImage.TYPE_INT_RGB);
        }
        if(running) {
            paint(bufferedimage.getGraphics());
            g.drawImage(bufferedimage,0,0,null);
        }
    }
    public void paint(Graphics g) {
        if(rect == null)
            return;
        g.setColor(background);
        g.fillRect(0,0,rect.width,rect.height); 
        g.setColor(foreground);
        g.fillOval(xCurrent,0,diameter,diameter);
    }
}
