import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
class DrawnLetters extends Frame {
    public static void main(String arg[]) {
        new DrawnLetters();
    }
    DrawnLetters() {
        super("DrawnLetters");
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e)
                { System.exit(0); } } );
        setLocation(150,200);
        DrawnLettersCanvas dl = new DrawnLettersCanvas();
        add(dl);
        pack();
        show();
    }
}
