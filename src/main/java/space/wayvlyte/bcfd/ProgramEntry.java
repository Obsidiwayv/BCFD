package space.wayvlyte.bcfd;

import space.wayvlyte.bcfd.constants.OperatingSystem;
import space.wayvlyte.bcfd.ui.MainWindow;

import javax.swing.*;

public class ProgramEntry {
    public static Window window;

    public static void main(String[] args) {
        window = new Window();
        MainWindow.build(window);
    }

    private static void isSupportedOS() {
       // if (!OperatingSystem.isWindows()) {
            // TODO: make windows that shows the user is not using windows.
       // }
    }
}
