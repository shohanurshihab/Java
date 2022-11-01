import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;
public class FollowMouse extends Frame {
    public static void main(String[] arg) {
        new FollowMouse();
    }
    FollowMouse() {
        super("FollowMouse");
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e)
                { System.exit(0); } } );
        setLocation(200,200);
        FollowMouseCanvas mc = new FollowMouseCanvas();
        add(mc);
        pack();
        show();
    }
}
