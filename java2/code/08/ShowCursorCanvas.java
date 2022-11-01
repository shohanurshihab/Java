import java.awt.Canvas;
import java.awt.Cursor;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
public class ShowCursorCanvas extends Canvas
            implements MouseMotionListener {
    private Cursor cursor;
    private int cursorType = -1;
    private int[] cursorTypeArray = {
        Cursor.CROSSHAIR_CURSOR,
        Cursor.DEFAULT_CURSOR,
        Cursor.HAND_CURSOR,
        Cursor.MOVE_CURSOR,
        Cursor.TEXT_CURSOR,
        Cursor.WAIT_CURSOR,
        Cursor.W_RESIZE_CURSOR,
        Cursor.NW_RESIZE_CURSOR,
        Cursor.N_RESIZE_CURSOR,
        Cursor.NE_RESIZE_CURSOR,
        Cursor.E_RESIZE_CURSOR,
        Cursor.SE_RESIZE_CURSOR,
        Cursor.S_RESIZE_CURSOR,
        Cursor.SW_RESIZE_CURSOR,
    };
    int x;
    ShowCursorCanvas() {
        addMouseMotionListener(this);
        setSize(600,100);
    }
    public void paint(Graphics g) {
        Dimension dim = getSize();
        float delta = (float)dim.width / (float)cursorTypeArray.length;
        int index = (int)(x / delta);
        if(index < cursorTypeArray.length) {
            int newCursorType = cursorTypeArray[index];
            if(newCursorType != cursorType) {
                cursorType = newCursorType;
                cursor = Cursor.getPredefinedCursor(cursorType);
                setCursor(cursor);
            }
        }
        g.setColor(Color.lightGray);
        for(float xPos=delta; xPos<dim.width; xPos += delta) {
            g.drawLine((int)xPos,0,(int)xPos,dim.height);
        }
        g.setColor(Color.black);
        g.drawString(cursor.toString(),20,30);
    }
    public void mouseMoved(MouseEvent event) {
        x = event.getX();
        repaint();
    }
    public void mouseDragged(MouseEvent event) {
        x = event.getX();
        repaint();
    }
}
