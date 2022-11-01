import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
public class ElectronsCanvas extends Canvas 
            implements Runnable {
    private Rectangle rect = null;
    private int pause = 15;
    private boolean running = false;
    private Color backgroundColor = Color.lightGray;
    private int electronCount = 14;
    private Color[] electronColor;
    private Thread looper;
    private BufferedImage bufferedimage;

    private double a[] = new double[electronCount];
    private double b[] = new double[electronCount];
    private double sine[] = new double[electronCount];
    private double cosine[] = new double[electronCount];
    private double angle[] = new double[electronCount];
    private int colorIndex[] = new int[electronCount];
    private int xCenter;
    private int yCenter;

    ElectronsCanvas() {
        setSize(400,200);
        electronColor = new Color[6];
        electronColor[0] = Color.blue;
        electronColor[1] = Color.cyan;
        electronColor[2] = Color.magenta;
        electronColor[3] = Color.red;
        electronColor[4] = Color.white;
        electronColor[5] = Color.black;
        setBackground(backgroundColor);
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
            firstFrame();
            bufferedimage = new BufferedImage(rect.width,rect.height,
                        BufferedImage.TYPE_INT_RGB);
        } else {
            nextFrame();
        }
        if(running) {
            paint(bufferedimage.getGraphics());
            g.drawImage(bufferedimage,0,0,null);
        }
    }


    public void paint(Graphics g) {
        if(rect == null)
            return;
        g.setColor(backgroundColor);
        g.fillRect(0,0,getSize().width,getSize().height);
        for(int i=0; i<electronCount; i++) {
            g.setColor(electronColor[colorIndex[i]]);
            int x = (int)(a[i] * cosine[i]);
            int y = (int)(b[i] * sine[i]);
            g.fillOval(x + xCenter,y + yCenter,10,10);
        }
    }
    private void firstFrame() {
        xCenter = rect.width / 2;
        yCenter = rect.height / 2;
        int index = 0;
        for(int i=0; i<electronCount; i++) {
            a[i] = Math.random() * rect.width / 2;
            b[i] = Math.random() * rect.height / 2;
            angle[i] = Math.random() * Math.PI * 2;
            if(++index >= electronColor.length)
                index = 0;
            colorIndex[i] = index;
        }
    }
    private boolean nextFrame() {
        for(int i=0; i<electronCount; i++) {
            angle[i] += 5.0 / (a[i] + b[i]);
            cosine[i] = Math.cos(angle[i]);
            sine[i] = Math.sin(angle[i]);
        }
        return(true);
    }
}
