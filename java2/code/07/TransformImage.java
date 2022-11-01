import java.awt.Frame;
import java.awt.Button;
import java.awt.Panel;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class TransformImage extends Frame
        implements ActionListener {
    TransformImageCanvas tic;
    TransformImageDialog tid;
    public static void main(String[] arg) {
        if(arg.length == 0)
            new TransformImage("banana.jpeg");
        else
            new TransformImage(arg[0]);
    }
    public TransformImage(String imageFileName) {
        super(imageFileName);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e)
                { System.exit(0); } } );
        tic = createCanvas(imageFileName);
        setLayout(new BorderLayout());
        add("North",tic);
        add("South",makeButtonPanel());
        pack();
        show();
        tid = new TransformImageDialog(tic);
    }
    private TransformImageCanvas createCanvas(String imageFileName) {
        Image image;
        image = Toolkit.getDefaultToolkit().getImage(imageFileName);
        MediaTracker mt = new MediaTracker(this);
        mt.addImage(image,1);
        try {
            mt.waitForAll();
        } catch(Exception e) {
            System.err.println(e);
            System.exit(1);
        }
        return(new TransformImageCanvas(image));
    }
    private Panel makeButtonPanel() {
        Panel panel = new Panel();
        Button button;
        button = new Button("Identity");
        button.addActionListener(this);
        panel.add(button);
        button = new Button("Rotate");
        button.addActionListener(this);
        panel.add(button);
        button = new Button("Shear");
        button.addActionListener(this);
        panel.add(button);
        button = new Button("Scale Down");
        button.addActionListener(this);
        panel.add(button);
        button = new Button("Scale Up");
        button.addActionListener(this);
        panel.add(button);
        return(panel);
    }
    public void actionPerformed(ActionEvent event) {
        if(event.getActionCommand().equals("Identity"))
            tic.setIdentity();
        else if(event.getActionCommand().equals("Rotate"))
            tic.setRotate();
        else if(event.getActionCommand().equals("Shear"))
            tic.setShear();
        else if(event.getActionCommand().equals("Scale Down"))
            tic.setScaleDown();
        else if(event.getActionCommand().equals("Scale Up"))
            tic.setScaleUp();
    }
}
