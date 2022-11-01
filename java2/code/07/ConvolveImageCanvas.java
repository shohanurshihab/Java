import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;

class ConvolveImageCanvas extends Canvas {
    float[] IDENTITY = {0f,0f,0f,0f,1f,0f,0f,0f,0f};
    float[] SOFTEN = {0.1f,0.1f,0.1f,0.1f,0.2f,0.1f,0.1f,0.1f,0.1f};
    float[] DARKEN = {0f,0f,0f,0f,0.8f,0f,0f,0f,0f};
    float[] LIGHTEN = {0f,0f,0f,0f,1.5f,0f,0f,0f,0f};
    float[] SHARPEN = {0f,-0.5f,0f,-0.5f,3f,-0.5f,0f,-0.5f,0f};
    float[] CONTRAST = {-1f,-1f,-1f,-1f,9f,-1f,-1f,-1f,-1f};
    float[] selection;
    BufferedImage normal;
    ConvolveImageCanvas(Image image) {
        int w = image.getWidth(this);
        int h = image.getHeight(this);
        normal = new BufferedImage(w,h,BufferedImage.TYPE_INT_RGB);
        selection = IDENTITY;
        Graphics2D g2 = normal.createGraphics();
        g2.drawImage(image,0,0,this);
        setSize(w,h);
    }
    public void paint(Graphics g) {
        BufferedImage current;
        Kernel kernel = new Kernel(3,3,selection);
        ConvolveOp co = new ConvolveOp(kernel);
        current = co.filter(normal,null);
        g.drawImage(current,0,0,this);
    }
    public void setNormal() {
        selection = IDENTITY;
        repaint();
    }
    public void setSoft() {
        selection = SOFTEN;
        repaint();
    }
    public void setDark() {
        selection = DARKEN;
        repaint();
    }
    public void setLight() {
        selection = LIGHTEN;
        repaint();
    }
    public void setSharp() {
        selection = SHARPEN;
        repaint();
    }
    public void setContrast() {
        selection = CONTRAST;
        repaint();
    }
}
