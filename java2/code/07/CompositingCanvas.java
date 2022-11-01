import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Font;
import java.awt.Image;
import java.awt.Composite;
import java.awt.AlphaComposite;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
class CompositingCanvas extends Canvas {
    private BufferedImage background;
    private BufferedImage foreground;
    private Image image;
    private int w;
    private int h;
    private Composite composite = AlphaComposite.SrcOver;
    CompositingCanvas(Image image) {
        Graphics g2;
        w = image.getWidth(this);
        h = image.getHeight(this);
        this.image = image;
        createBackground();
        createForeground(100);
        setSize(w,h);
    }
    private void createBackground() {
        background = new BufferedImage(w,h,BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = background.createGraphics();
        g2.drawImage(image,0,0,this);
    }
    private void createForeground(int percent) {
        Font font = new Font("TimesRoman",Font.BOLD,150);
        foreground = new BufferedImage(w,h,BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = foreground.createGraphics();
        g2.setFont(font);
        g2.drawString("FLY!",130,230);
        WritableRaster wr = foreground.getAlphaRaster();
        int[] array = null;
        for(int x=0; x<w; x++) {
            for(int y=0; y<h; y++) {
                array = wr.getPixel(x,y,array);
                array[0] = (int)(((double)(array[0]) * (double)(percent)) / 100.00);
                wr.setPixel(x,y,array);
            }
        }
    }
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        g2.drawImage(background,0,0,this);
        g2.setComposite(composite);
        g2.drawImage(foreground,0,0,this);
    }
    void setPercent(int setting) {
        createForeground(setting);
        repaint();
    }
    void setComposite(Composite setting) {
        composite = setting;
        repaint();
    }
}
