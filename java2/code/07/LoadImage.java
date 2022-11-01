import java.awt.Canvas;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.Graphics;
import java.awt.Image;

public class LoadImage extends Canvas {
    Image image;
    LoadImage(Image image) {
        this.image = image;
        setSize(image.getWidth(this),image.getHeight(this));
    }
    public void paint(Graphics g) {
        g.drawImage(image,0,0,this);
    }
}
