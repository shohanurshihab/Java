import java.awt.*;
import java.awt.event.*;
public class FontShow extends Frame
		implements ActionListener, ItemListener {
	private FontShowCanvas fontShowCanvas;
	private Choice fontChoice;
	private Choice pointChoice;
	private Checkbox bold;
	private Checkbox italic;

	private int smallestPoint = 6;
	private int largestPoint = 72;
	private int canvasWidth = 300;
	private int canvasHeight = 100;

	private String fontName;
	private int fontStyle;
	private int pointSize;

	public static void main(String[] arg) {
		new FontShow();
	}
	FontShow() {
		fontShowCanvas = new FontShowCanvas(canvasWidth,canvasHeight);
		add("Center",fontShowCanvas);
		Panel p = new Panel();
		createFontChoice();
		p.add(fontChoice);
		createPointChoice();
		p.add(pointChoice);
		bold = new Checkbox("Bold");
		bold.addItemListener(this);
		p.add(bold);
		italic = new Checkbox("Italic");
		italic.addItemListener(this);
		p.add(italic);
		Button quit = new Button("Quit");
		quit.addActionListener(this);
		p.add(quit);
		add("South",p);
		fontShowCanvas.setValues(fontName,fontStyle,pointSize);
		pack();
		show();
	}
	private void createFontChoice() {
		fontChoice = new Choice();
		fontChoice.addItemListener(this);
		String[] fontList;
		fontList = Toolkit.getDefaultToolkit().getFontList();
		for(int i=0; i<fontList.length; i++)
			fontChoice.addItem(fontList[i]);
		fontName = fontList[0];
	}
	private void createPointChoice() {
		pointChoice = new Choice();
		pointChoice.addItemListener(this);
		for(int i=smallestPoint; i<=largestPoint; i++)
			pointChoice.addItem(i + " pt");
		pointChoice.select("20 pt");
		pointSize = 20;
	}
	public void itemStateChanged(ItemEvent event) {
		fontName = fontChoice.getSelectedItem();
		if(bold.getState() && italic.getState())
			fontStyle = Font.BOLD | Font.ITALIC;
		else if(bold.getState())
			fontStyle = Font.BOLD;
		else if(italic.getState())
			fontStyle = Font.ITALIC;
		else
			fontStyle = Font.PLAIN;
		pointSize = pointChoice.getSelectedIndex();
		pointSize += smallestPoint;
		fontShowCanvas.setValues(fontName,fontStyle,pointSize);
	}
	public void actionPerformed(ActionEvent event) {
		System.exit(0);
	}
}

class FontShowCanvas extends Canvas {
	Font font;
	String fontName;
	public FontShowCanvas(int width,int height) {
		setSize(width,height);
	}
	public void setValues(String fontName,int fontStyle,int pointSize) {
		font = new Font(fontName,fontStyle,pointSize);
		this.fontName = fontName;
		repaint();
	}
	public void paint(Graphics gc) {
		gc.setFont(font);
		gc.setColor(Color.black);
		gc.drawString(fontName,5,getSize().height * 2 / 3);
	}
}
