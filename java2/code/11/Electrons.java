import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
class Electrons extends Frame {
    public static void main(String arg[]) {
        new Electrons();
    }
    Electrons() {
        super("Electrons");
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e)
                { System.exit(0); } } );
        setLocation(150,50);
        ElectronsCanvas ec = new ElectronsCanvas();
        ec.start();
        add(ec);
        pack();
        show();
    }
}
