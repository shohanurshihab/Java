import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class LetterPicture extends Frame {
    public static void main(String arg[]) {
        new LetterPicture();
    }
    LetterPicture() {
        super("LetterPicture");
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e)
                { System.exit(0); } } );
        setLocation(200,100);
        LetterPictureCanvas lp = new LetterPictureCanvas();
        add(lp);
        pack();
        show();
    }
}
