package space.wayvlyte.bcfd.ui;

import space.wayvlyte.bcfd.Window;
import space.wayvlyte.bcfd.ui.components.UIButtonBorder;
import space.wayvlyte.bcfd.ui.components.UiButton;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends BaseWindow {

    public MainWindow(Window win) {
        this.window = win;
        this.start();
    }

    public static void build(Window win) {
        new MainWindow(win);
    }

    @Override
    public void render() {
        JButton host = UiButton.create("text")
                .getContext();
        host.setPreferredSize(new Dimension(120, 40));
        host.setHorizontalAlignment(SwingConstants.WEST);

        this.window.frame.add(host);
    }
}
