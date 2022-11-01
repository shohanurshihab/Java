import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class FollowMouseMotion extends Frame {
    public static void main(String[] arg) {
        new FollowMouseMotion();
    }
    FollowMouseMotion() {
        super("FollowMouseMotion");
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e)
                { System.exit(0); } } );
        setLocation(200,200);
        FollowMouseMotionCanvas mc = new FollowMouseMotionCanvas();
        add(mc);
        pack();
        show();
    }
}
