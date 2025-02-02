package space.wayvlyte.bcfd.ui.components;

import javax.swing.border.Border;
import java.awt.*;

public class UIButtonBorder implements Border {

    private final int radius;


    UIButtonBorder(int radius) {
        this.radius = radius;
    }


    public Insets getBorderInsets(Component c) {
        return new Insets(this.radius+1, this.radius+1, this.radius+2, this.radius);
    }


    public boolean isBorderOpaque() {
        return true;
    }


    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        g.clipRect(x, y, width-1, height-1);
        g.drawRoundRect(x, y, width-1, height-1, radius, radius);
    }
}