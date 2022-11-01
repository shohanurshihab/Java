import java.awt.Frame;
import java.awt.Panel;
import java.awt.Button;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.AlphaComposite;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
public class Compositing extends Frame
            implements ActionListener {
    private static String[] buttonLabel = {
        "100%","75%","50%","25%","Clear","DstIn","DstOut",
        "DstOver","Src","SrcIn","SrcOut","SrcOver"
    };
    private CompositingCanvas cc;

    public static void main(String[] arg) {
        if(arg.length == 0)
            new Compositing("theseus.jpeg");
        else
            new Compositing(arg[0]);
    }
    public Compositing(String imageFileName) {
        super("Compositing");
        Image image;
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e)
                { System.exit(0); } } );
        image = Toolkit.getDefaultToolkit().getImage(imageFileName);
        MediaTracker mt = new MediaTracker(this);
        mt.addImage(image,1);
        try {
            mt.waitForAll();
        } catch(Exception e) {
            System.err.println(e);
            System.exit(1);
        }
        cc = new CompositingCanvas(image);
        Panel p = makeButtonPanel(cc);
        add("Center",cc);
        add("South",p);
        pack();
        show();
    }
    private Panel makeButtonPanel(CompositingCanvas cc) {
        Button button;
        Panel p = new Panel();
        for(int i=0; i<buttonLabel.length; i++) {
            button = new Button(buttonLabel[i]);
            button.addActionListener(this);
            p.add(button);
        }
        return(p);
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("100%"))
            cc.setPercent(100);
        else if(e.getActionCommand().equals("75%"))
            cc.setPercent(75);
        else if(e.getActionCommand().equals("50%"))
            cc.setPercent(50);
        else if(e.getActionCommand().equals("25%"))
            cc.setPercent(25);
        else if(e.getActionCommand().equals("Clear"))
            cc.setComposite(AlphaComposite.Clear);
        else if(e.getActionCommand().equals("DstIn"))
            cc.setComposite(AlphaComposite.DstIn);
        else if(e.getActionCommand().equals("DstOut"))
            cc.setComposite(AlphaComposite.DstOut);
        else if(e.getActionCommand().equals("DstOver"))
            cc.setComposite(AlphaComposite.DstOver);
        else if(e.getActionCommand().equals("Src"))
            cc.setComposite(AlphaComposite.Src);
        else if(e.getActionCommand().equals("SrcIn"))
            cc.setComposite(AlphaComposite.SrcIn);
        else if(e.getActionCommand().equals("SrcOut"))
            cc.setComposite(AlphaComposite.SrcOut);
        else if(e.getActionCommand().equals("SrcOver"))
            cc.setComposite(AlphaComposite.SrcOver);
    }
}
