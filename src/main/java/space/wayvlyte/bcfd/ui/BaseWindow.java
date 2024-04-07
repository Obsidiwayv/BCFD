package space.wayvlyte.bcfd.ui;

import space.wayvlyte.bcfd.Window;

import javax.swing.*;
import java.awt.*;

public class BaseWindow {
    public Window window;

    public void start() {
        this.window.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.window.frame.setPreferredSize(new Dimension(800, 600));
        this.window.frame.setMinimumSize(new Dimension(400, 300));
        this.window.frame.pack();
        this.window.frame.setVisible(true);
        this.window.frame.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 30));

        try {
            this.render();
        } catch (Exception ignored) {}
    }

    public static void build(Window win) {}

    public void render() {}
}
