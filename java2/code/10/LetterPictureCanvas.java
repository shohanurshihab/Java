import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Font;
import java.awt.MediaTracker;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.geom.AffineTransform;
import java.awt.geom.GeneralPath;
import java.awt.font.TextLayout;
import java.awt.font.FontRenderContext;
public class LetterPictureCanvas extends Canvas
                implements MouseListener {
    private int width = 548;
    private int height = 187;
    private GeneralPath generalPath;
    private Image image;
    private Image pictureImage;
    private int state = 0;
    LetterPictureCanvas() {
        setSize(width,height);
        addMouseListener(this);
        AffineTransform at = new AffineTransform();
        at.setToTranslation(0,160);
        at.scale(0.6,1.0);
        Font font = new Font("Times New Roman",Font.BOLD,210);
        FontRenderContext frc = new FontRenderContext(null,false,false);
        TextLayout tl = new TextLayout("ALASKA",font,frc);
        generalPath = new GeneralPath(tl.getOutline(at));
        generalPath.setWindingRule(GeneralPath.WIND_NON_ZERO);
        loadPictureImage("alaska.jpeg");
    }
    private void loadPictureImage(String name) {
        pictureImage = getToolkit().getImage(name);
        MediaTracker mt = new MediaTracker(this);
        mt.addImage(pictureImage,1);
        try {
            mt.waitForAll();
        } catch(Exception e) {
            System.out.println("Unable to load " + name);
            e.printStackTrace();
            pictureImage = null;
        }
    }
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        if(image == null) {
            image = createImage(width,height);
            Graphics2D gi = (Graphics2D)image.getGraphics();
            gi.clip(generalPath);
            gi.drawImage(pictureImage,0,0,null);
        }
        switch(state) {
        case 0:
            g2.drawImage(pictureImage,0,0,null);
            break;
        case 1:
            g2.drawImage(pictureImage,0,0,null);
            g2.fill(generalPath);
            break;
        case 2:
            g2.drawImage(image,0,0,null);
            break;
        }
    }
    public void mouseClicked(MouseEvent event) {
        if(++state > 2)
            state = 0;
        repaint();
    }
    public void mouseEntered(MouseEvent event) {}
    public void mouseExited(MouseEvent event) {}
    public void mousePressed(MouseEvent event) {}
    public void mouseReleased(MouseEvent event) {}
}
