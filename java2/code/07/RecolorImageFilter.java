import java.awt.image.ColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageFilter;
public class RecolorImageFilter extends ImageFilter {
    public void setHints(int hint) {
        hint |= ImageConsumer.TOPDOWNLEFTRIGHT;
        super.setHints(hint);
    }
    public void setPixels(int x,int y,int width,int height,
            ColorModel model,byte pixels[],
            int offset,int scansize) {
        int[] co = null;
        byte[] pnew = new byte[width * height];
        for(int px=0; px<width; px++) {
            for(int py=0; py<height; py++) {
                int index = px + (py*scansize) + offset;
                co = model.getComponents(pixels[index],co,0);
                co[0] *= 3; // Red
                co[0] /= 4;
                co[1] *= 3; // Green
                co[1] /= 4;
                co[2] *= 3; // Blue
                co[2] /= 4;
                pnew[index] = (byte)model.getDataElement(co,0);
            }
        }
        super.setPixels(x,y,width,height,model,pnew,offset,scansize);
    }
    public void setPixels(int x,int y,int width,int height,
            ColorModel model,int pixels[],
            int offset,int scansize) {
        int[] co = null;
        int[] pnew = new int[width * height];
        for(int px=0; px<width; px++) {
            for(int py=0; py<height; py++) {
                int index = px + (py*scansize) + offset;
                co = model.getComponents(pixels[index],co,0);
                co[0] *= 3; // Red
                co[0] /= 4;
                co[1] *= 3; // Green
                co[1] /= 4;
                co[2] *= 3; // Blue
                co[2] /= 4;
                pnew[index] = (int)model.getDataElement(co,0);
            }
        }
        super.setPixels(x,y,width,height,model,pnew,offset,scansize);
    }
}
