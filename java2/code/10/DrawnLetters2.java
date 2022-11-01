import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
class DrawnLetters2 extends Frame {
    public static void main(String arg[]) {
        new DrawnLetters2();
    }
    DrawnLetters2() {
        super("DrawnLetters2");
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e)
                { System.exit(0); } } );
        setLocation(150,200);
        DrawnLetters2Canvas dl = new DrawnLetters2Canvas();
        add(dl);
        pack();
        show();
    }
}
