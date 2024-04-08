package space.wayvlyte.bcfd.ui.extension;

import space.wayvlyte.bcfd.ui.JadeUtil;

import javax.swing.*;
import javax.swing.plaf.basic.BasicPanelUI;
import java.awt.*;

public class JadePanel extends JPanel {
    public JadePanel() {}
    public JadePanel(LayoutManager layout) {
        super(layout);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D graphics = (Graphics2D) g.create();
        JadeUtil.setAA(graphics);
        graphics.setColor(getBackground());
        graphics.fillRoundRect(0, 0, getWidth(), getHeight(), 40, 40);
        graphics.dispose();
    }
}
