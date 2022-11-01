import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class ShowCursor extends Frame {
    public static void main(String[] arg) {
        new ShowCursor();
    }
    ShowCursor() {
        super("ShowCursor");
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e)
                { System.exit(0); } } );
        setLocation(150,150);
        ShowCursorCanvas cc = new ShowCursorCanvas();
        add(cc);
        pack();
        show();
    }
}
