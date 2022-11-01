import java.awt.Frame;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.RenderingHints;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class TransformImageDialog extends Frame
            implements ActionListener {
    private Checkbox[] box = new Checkbox[option.length];
    private TransformImageCanvas tic;
    static Object[][] option  = {
      { RenderingHints.KEY_INTERPOLATION,
        RenderingHints.VALUE_INTERPOLATION_NEAREST_NEIGHBOR,
        "Interpolation is Nearest Neighbor" },
      { RenderingHints.KEY_INTERPOLATION,
        RenderingHints.VALUE_INTERPOLATION_BILINEAR,
        "Interpolation is Bilinear" },
      { RenderingHints.KEY_INTERPOLATION,
        RenderingHints.VALUE_INTERPOLATION_BICUBIC,
        "Interpolation is Bicubic" },
      { RenderingHints.KEY_ALPHA_INTERPOLATION,
        RenderingHints.VALUE_ALPHA_INTERPOLATION_DEFAULT,
        "Alpha Interpolation by Default" },
      { RenderingHints.KEY_ALPHA_INTERPOLATION,
        RenderingHints.VALUE_ALPHA_INTERPOLATION_QUALITY,
        "Alpha Interpolation for Quality" },
      { RenderingHints.KEY_ALPHA_INTERPOLATION,
        RenderingHints.VALUE_ALPHA_INTERPOLATION_SPEED,
        "Alpha Interpolation for Speed" },
      { RenderingHints.KEY_ANTIALIASING,
        RenderingHints.VALUE_ANTIALIAS_DEFAULT,
        "Antialiasing Default" },
      { RenderingHints.KEY_ANTIALIASING,
        RenderingHints.VALUE_ANTIALIAS_OFF,
        "Antialiasing Off" },
      { RenderingHints.KEY_ANTIALIASING,
        RenderingHints.VALUE_ANTIALIAS_ON,
        "Antialiasing On" },
      { RenderingHints.KEY_COLOR_RENDERING,
        RenderingHints.VALUE_COLOR_RENDER_DEFAULT,
        "Color Rendering Default" },
      { RenderingHints.KEY_COLOR_RENDERING,
        RenderingHints.VALUE_COLOR_RENDER_QUALITY,
        "Color Rendering for Quality" },
      { RenderingHints.KEY_COLOR_RENDERING,
        RenderingHints.VALUE_COLOR_RENDER_SPEED,
        "Color Rendering for Speed" },
      { RenderingHints.KEY_DITHERING,
        RenderingHints.VALUE_DITHER_DEFAULT,
        "Dithering Default" },
      { RenderingHints.KEY_DITHERING,
        RenderingHints.VALUE_DITHER_DISABLE,
        "Dithering Disabled" },
      { RenderingHints.KEY_DITHERING,
        RenderingHints.VALUE_DITHER_ENABLE,
        "Dithering Enabled" },
      { RenderingHints.KEY_FRACTIONALMETRICS,
        RenderingHints.VALUE_FRACTIONALMETRICS_DEFAULT,
        "Fractional Metrics Default" },
      { RenderingHints.KEY_FRACTIONALMETRICS,
        RenderingHints.VALUE_FRACTIONALMETRICS_OFF,
        "Fractional Metrics Off" },
      { RenderingHints.KEY_FRACTIONALMETRICS,
        RenderingHints.VALUE_FRACTIONALMETRICS_ON,
        "Fractional Metrics On" },
      { RenderingHints.KEY_RENDERING,
        RenderingHints.VALUE_RENDER_DEFAULT,
        "Render by Default" },
      { RenderingHints.KEY_RENDERING,
        RenderingHints.VALUE_RENDER_SPEED,
        "Render for Speed" },
      { RenderingHints.KEY_RENDERING,
        RenderingHints.VALUE_RENDER_QUALITY,
        "Render for Quality" },
    };
    TransformImageDialog(TransformImageCanvas tic) {
        super("Hints");
        setBackground(Color.lightGray);
        this.tic = tic;
        Button button;
        setLayout(new GridLayout(option.length+2,2));
        makeCheckboxes();
        button = new Button("Apply");
        button.addActionListener(this);
        add(button);
        button = new Button("Quit");
        button.addActionListener(this);
        add(button);
        pack();
        setVisible(true);
    }
    private void makeCheckboxes() { 
        CheckboxGroup group = null;
        boolean defaultSetting;
        Color color = Color.black;
        for(int i=0; i<option.length; i++) {
            if((group == null) || (option[i][0] != option[i-1][0])) {
                if(color == Color.black)
                    color = Color.blue;
                else
                    color = Color.black;
                defaultSetting = true;
                group = new CheckboxGroup();
            } else {
                defaultSetting = false;
            }
            box[i] = new Checkbox((String)option[i][2],defaultSetting);
            box[i].setCheckboxGroup(group);
            box[i].setForeground(color);
            add(box[i]);
            if(defaultSetting)
                group.setSelectedCheckbox(box[i]);
        }
    }
    public void actionPerformed(ActionEvent event) {
        if(event.getActionCommand().equals("Quit")) {
            setVisible(false);
            System.exit(0);
        }
        if(event.getActionCommand().equals("Apply")) {
            RenderingHints hints = null;
            for(int i=0; i<option.length; i++) {
                if(box[i].getState()) {
                    if(hints == null) {
                        hints = new RenderingHints(
                            (RenderingHints.Key)option[i][0],
                            option[i][1]);
                    } else {
                        hints.put(
                            (RenderingHints.Key)option[i][0],
                            option[i][1]);
                    }
                }
            }
            tic.setHints(hints);
        }
    }
}
