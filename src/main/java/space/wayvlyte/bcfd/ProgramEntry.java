package space.wayvlyte.bcfd;

import space.wayvlyte.bcfd.constants.OperatingSystem;
import space.wayvlyte.bcfd.ui.windows.ConsoleWindow;
import space.wayvlyte.bcfd.ui.windows.MainWindow;
import space.wayvlyte.bcfd.ui.windows.NotificationWindow;
import space.wayvlyte.bcfd.ui.windows.Window;

import javax.swing.*;
import java.awt.*;

public class ProgramEntry {
    public static Window window;
    public static ConsoleWindow console = new ConsoleWindow();

    public static void main(String[] args) {
        window = new Window();
        window.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.frame.setPreferredSize(new Dimension(1200, 600));
        window.frame.setMinimumSize(new Dimension(400, 300));
        window.frame.pack();
        window.frame.setVisible(true);
        window.frame.setLayout(new GridBagLayout());
        window.frame.getContentPane().setBackground(Colours.getBackgroundColour());
        isSupportedOS();
        MainWindow.build(window);
    }

    private static void isSupportedOS() {
        if (!OperatingSystem.isWindows()) {
            new NotificationWindow("Other platforms are not supported yet.", null, () -> {
                System.exit(0);
            });
        }
    }
}
