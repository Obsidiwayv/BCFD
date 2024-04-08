package space.wayvlyte.bcfd.ui.windows;

import space.wayvlyte.bcfd.Colours;
import space.wayvlyte.bcfd.ui.components.UiButton;
import space.wayvlyte.bcfd.ui.extension.JadePanel;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends BaseWindow {

    public MainWindow(space.wayvlyte.bcfd.ui.windows.Window win) {
        this.window = win;
        this.start();
    }

    public static void build(Window win) {
        new MainWindow(win);
    }

    @Override
    public void render() {
        GridBagConstraints cc = new GridBagConstraints(),
                nc = new GridBagConstraints();
        cc.fill = GridBagConstraints.CENTER;
        nc.anchor = GridBagConstraints.PAGE_END;
        nc.fill = GridBagConstraints.VERTICAL;
        nc.gridy = 1;
        nc.insets = new Insets(40,0,0,0);
        int button_size = 170;

        JPanel center = new JadePanel(new BorderLayout());
        JPanel navigation = new JadePanel(new BorderLayout());
        JPanel center_buttons = new JadePanel();
        JPanel nav_buttons = new JadePanel();
        center_buttons.setLayout(new BoxLayout(center_buttons, BoxLayout.Y_AXIS));
        nav_buttons.setLayout(new FlowLayout(FlowLayout.CENTER, 0, (55 - 20) / 2));
        center.setPreferredSize(new Dimension(400, 300));
        navigation.setPreferredSize(new Dimension(600, 75));

        JButton host = UiButton.create("start", 0f)
                .hw(new Dimension(button_size, 40))
                .getContext();

        host.setAlignmentX(Component.CENTER_ALIGNMENT);

        JButton commands = UiButton.create("commands", 0f)
                .hw(new Dimension(button_size, 40))
                .getContext();
        JButton settings = UiButton.create("help", 0f)
                .hw(new Dimension(button_size, 40))
                .getContext();

        nav_buttons.add(commands);
        nav_buttons.add(settings);

        center_buttons.add(Box.createVerticalStrut(30));
        center_buttons.add(host);
        center_buttons.add(Box.createVerticalStrut(30));

        host.setMaximumSize(new Dimension(button_size, host.getPreferredSize().height)); // Set the maximum width

        center_buttons.setBackground(Colours.getPanelsColour());
        center.setBackground(Colours.getPanelsColour());
        navigation.setBackground(Colours.getPanelsColour());
        nav_buttons.setBackground(Colours.getPanelsColour());

        center.add(center_buttons, BorderLayout.PAGE_END);
        navigation.add(nav_buttons, BorderLayout.CENTER);
        this.window.frame.add(navigation, nc);
        this.window.frame.add(center, cc);
    }
}
