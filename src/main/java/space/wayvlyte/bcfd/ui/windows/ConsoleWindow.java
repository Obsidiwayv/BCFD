package space.wayvlyte.bcfd.ui.windows;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Shows a console when in debug mode.
 */
public class ConsoleWindow {
    public final JFrame consoleFrame;
    private final JPanel consolePanel;
    private final ArrayList<String> text;

    public ConsoleWindow() {
        text = new ArrayList<>();
        consoleFrame = new JFrame("Bot Commander Debug");
        consoleFrame.setPreferredSize(new Dimension(800, 400));
        consoleFrame.setMinimumSize(new Dimension(400, 400));

        consolePanel = new JPanel();
        consolePanel.setBackground(Color.BLACK);
        consolePanel.setLayout(new SpringLayout());

        JScrollPane scrollPane = new JScrollPane(consolePanel);
        consoleFrame.getContentPane().add(scrollPane);

        consoleFrame.pack();
        consoleFrame.setVisible(true);
    }

    public void log(String message) {
        text.add(message);
        JLabel label = new JLabel(message);
        label.setForeground(Color.WHITE);
        consolePanel.add(label);

        SpringLayout layout = (SpringLayout) consolePanel.getLayout();
        int index = text.size() - 1;
        if (index == 0) { // First label
            layout.putConstraint(SpringLayout.NORTH, label, 5, SpringLayout.NORTH, consolePanel);
        } else { // Subsequent labels
            JLabel previousLabel = (JLabel) consolePanel.getComponent(index - 1);
            layout.putConstraint(SpringLayout.NORTH, label, 5, SpringLayout.SOUTH, previousLabel);
        }

        layout.putConstraint(SpringLayout.WEST, label, 5, SpringLayout.WEST, consolePanel);

        consoleFrame.revalidate();
        consoleFrame.repaint();
    }

}
