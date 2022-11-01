import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
public class PongCanvas extends Canvas 
            implements Runnable {
    private Rectangle rect = null;
    private Thread looper;
    private boolean running;
    private Color background;
    private Color foreground;
    private int diameter;
    private int xLeft;
    private int xRight;
    private int xCurrent;
    private int yTop;
    private int yBottom;
    private int yCurrent;
    private boolean movingDown;
    private boolean movingRight;
    private BufferedImage bufferedimage;
    PongCanvas() {
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
                if(movingRight) {
                    if(++xCurrent > xRight)
                        movingRight = false;
                } else {
                    if(--xCurrent < xLeft)
                        movingRight = true;
                }
                if(movingDown) {
                    if(++yCurrent > yBottom)
                        movingDown = false;
                } else {
                    if(--yCurrent < yTop)
                        movingDown = true;
                }
                repaint();
                looper.sleep(10);
            }
        } catch(InterruptedException e) {
            running = false;
        }
    }
    public void update(Graphics g) {
        if(!getBounds().equals(rect)) {
            rect = getBounds();
            diameter = rect.width / 20;
            xLeft = 0;
            xCurrent = 0;
            xRight = rect.width  - diameter;
            yTop = 0;
            yCurrent = 0;
            yBottom = rect.height - diameter;
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
        g.fillOval(xCurrent,yCurrent,diameter,diameter);
    }
}
