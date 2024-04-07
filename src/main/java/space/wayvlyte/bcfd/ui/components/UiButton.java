package space.wayvlyte.bcfd.ui.components;

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

    public static UiButton create(String text) {
        JButton button = new JButton(text);
        button.setOpaque(true);
        button.setBackground(Color.BLACK);
        button.setBorder(new UIButtonBorder(10));
        button.setVisible(true);
        return new UiButton(button);
    }
}
