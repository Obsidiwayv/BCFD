package space.wayvlyte.bcfd.ui.extension;

import space.wayvlyte.bcfd.ui.JadeUtil;

import javax.swing.*;
import javax.swing.plaf.basic.BasicButtonUI;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;

public class JadeButton extends BasicButtonUI {

    @Override
    protected void paintButtonPressed(Graphics g, AbstractButton b) {
        Graphics2D g2 = (Graphics2D) g;
        JadeUtil.setAA(g2);

        g2.setColor(Color.red.darker());
        g2.fill(new RoundRectangle2D.Double(0, 0, b.getWidth() - 1, b.getHeight() - 1, 40, 40));
        g2.dispose();
    }

    @Override
    public void paint(Graphics g, JComponent c) {
        Graphics2D graphics = (Graphics2D) g.create();
        JadeUtil.setAA(graphics);

        graphics.setColor(c.getBackground()); // Set background color
        graphics.fillRoundRect(0, 0, c.getWidth() - 1, c.getHeight() - 1, 40, 40);

        super.paint(g, c);
        graphics.dispose();
    }
}
