import java.awt.Frame;
import java.awt.Panel;
import java.awt.Button;
import java.awt.BorderLayout;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class ConvolveImage extends Frame
        implements ActionListener {
    ConvolveImageCanvas cic;
    public static void main(String[] arg) {
        if(arg.length == 0)
            new ConvolveImage("trmm.jpeg");
        else
            new ConvolveImage(arg[0]);
    }
    public ConvolveImage(String imageFileName) {
        super(imageFileName);
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
        cic = new ConvolveImageCanvas(image);
        setLayout(new BorderLayout());
        add("North",cic);
        add("South",makeButtonPanel());
        pack();
        show();
    }
    private Panel makeButtonPanel() {
        Panel panel = new Panel();
        Button button;
        button = new Button("Normal");
        button.addActionListener(this);
        panel.add(button);
        button = new Button("Soft");
        button.addActionListener(this);
        panel.add(button);
        button = new Button("Dark");
        button.addActionListener(this);
        panel.add(button);
        button = new Button("Light");
        button.addActionListener(this);
        panel.add(button);
        button = new Button("Sharp");
        button.addActionListener(this);
        panel.add(button);
        button = new Button("Contrast");
        button.addActionListener(this);
        panel.add(button);
        return(panel);
    }
    public void actionPerformed(ActionEvent event) {
        if(event.getActionCommand().equals("Normal"))
            cic.setNormal();
        else if(event.getActionCommand().equals("Soft"))
            cic.setSoft();
        else if(event.getActionCommand().equals("Dark"))
            cic.setDark();
        else if(event.getActionCommand().equals("Light"))
            cic.setLight();
        else if(event.getActionCommand().equals("Sharp"))
            cic.setSharp();
        else if(event.getActionCommand().equals("Contrast"))
            cic.setContrast();
    }
}
