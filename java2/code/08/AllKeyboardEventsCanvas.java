import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
public class AllKeyboardEventsCanvas extends Canvas
            implements KeyListener {
    String keychar = "";
    String keylocation = "";
    String keymodifiers = "";
    String keytext = "";
    String keyaction = "";
    String param = "";
    String keyevent = "";
    String keycode = "";
    AllKeyboardEventsCanvas() {
        addKeyListener(this);
        setSize(600,200);
    }
    public void paint(Graphics g) {
        g.drawString(keychar,20,30);
        g.drawString(keylocation,20,50);
        g.drawString(keymodifiers,20,70);
        g.drawString(keytext,20,90);
        g.drawString(keyaction,20,110);
        g.drawString(param,20,130);
        g.drawString(keyevent,20,150);
        g.drawString(keycode,20,170);
    }
    public void keyTyped(KeyEvent event) {
        showEvent(event);
    }
    public void keyPressed(KeyEvent event) {
        showEvent(event);
    }
    public void keyReleased(KeyEvent event) {
        showEvent(event);
    }
    private void showEvent(KeyEvent event) {
        if(event.getKeyChar() == event.CHAR_UNDEFINED)
            keychar = "Key character: UNDEFINED";
        else
            keychar = "Key character: " + event.getKeyChar();
        keycode = "Key code: " + event.getKeyCode();
        if(event.getKeyLocation() == event.KEY_LOCATION_LEFT)
            keylocation = "Key location: left";
        else if (event.getKeyLocation() == event.KEY_LOCATION_RIGHT)
            keylocation = "Key location: right";
        else if (event.getKeyLocation() == event.KEY_LOCATION_NUMPAD)
            keylocation = "Key location: number pad";
        else if (event.getKeyLocation() == event.KEY_LOCATION_STANDARD)
            keylocation = "Key location: standard";
        else if (event.getKeyLocation() == event.KEY_LOCATION_UNKNOWN)
            keylocation = "Key location: unknown";
        if(event.getID() == event.KEY_PRESSED)
            keyevent = "Key event: key pressed";
        else if(event.getID() == event.KEY_RELEASED)
            keyevent = "Key event: key released";
        else if(event.getID() == event.KEY_TYPED)
            keyevent = "Key event: key released";
        keymodifiers = "Key modifiers: " + event.getModifiers() + "  (" +
            event.getKeyModifiersText(event.getModifiers()) + ")";
        keytext = "Key text: " + event.getKeyText(event.getKeyCode());
        keyaction = "Is an action key: " + event.isActionKey();
        param = event.paramString();
        repaint();
    }
}
