package space.wayvlyte.bcfd.ui.components;

import space.wayvlyte.bcfd.Colours;
import space.wayvlyte.bcfd.ui.JadeFont;
import space.wayvlyte.bcfd.ui.extension.JadeButton;

import javax.swing.*;
import java.awt.*;

public class UiButton {
    public JButton button;

    public UiButton(JButton button) {
        this.button = button;
    }

    public JButton getContext() {
        return this.button;
    }

    /**
     * Sets the height and width with a "setPreferredSize()" wrapper.
     */
    public UiButton hw(Dimension di) {
        this.button.setPreferredSize(di);
        return this;
    }

    public static UiButton create(String text, Float fontMultiplier) {
        JButton button = new JButton(text);
        button.setUI(new JadeButton());
        button.setOpaque(false);
        button.setBorderPainted(false);
        button.setBackground(Colours.getButtonsBackgroundColour());
        button.setForeground(Colours.getFontColour());
        button.setBorder(new UIButtonBorder(30));
        button.setVisible(true);

        JadeFont font = new JadeFont()
                .light();

        button.setFont(font.load().deriveFont(18f + fontMultiplier));
        return new UiButton(button);
    }
}
