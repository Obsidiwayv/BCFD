package space.wayvlyte.bcfd.ui.windows;

import space.wayvlyte.bcfd.Colours;
import space.wayvlyte.bcfd.ui.components.UiButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NotificationWindow {

    public NotificationWindow(String message, Icon icon, Runnable listener) {
        // Create the JFrame for the notification
        JDialog notification = new JDialog();
        notification.setPreferredSize(new Dimension(600, 300));
        notification.setMinimumSize(new Dimension(600, 300));
        notification.setLayout(new BorderLayout());
        notification.setModalityType(Dialog.ModalityType.APPLICATION_MODAL); // Set modality to block input to other windows

        JPanel contentPanel = getjPanel(message, icon);

        // Add the content panel to the notification window
        contentPanel.setBackground(Colours.getBackgroundColour());
        notification.add(contentPanel, BorderLayout.CENTER);

        JButton okButton = UiButton.create("OK", 5f)
                .hw(new Dimension(200, 40))
                .getContext();

        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                notification.dispose(); // Close the notification window
                if (listener != null) {
                    listener.run(); // Call the listener function if provided
                    notification.dispose();
                }
            }
        });

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.add(okButton);
        notification.add(buttonPanel, BorderLayout.SOUTH);

        buttonPanel.setBackground(Colours.getBackgroundColour());
        // Set the window to appear in the center of the screen
        notification.setLocationRelativeTo(null);
        notification.setAlwaysOnTop(true);

        // Show the notification window
        notification.setVisible(true);
    }

    private static JPanel getjPanel(String message, Icon icon) {
        JPanel contentPanel = new JPanel(new BorderLayout());

        // Create a JLabel to display the message
        JLabel messageLabel = new JLabel(message);
        messageLabel.setForeground(Colours.getFontColour());
        messageLabel.setHorizontalAlignment(SwingConstants.CENTER); // Center the text horizontally
        contentPanel.add(messageLabel, BorderLayout.CENTER);

        // Add an optional icon if provided
        if (icon != null) {
            JLabel iconLabel = new JLabel(icon);
            iconLabel.setHorizontalAlignment(SwingConstants.CENTER); // Center the icon horizontally
            contentPanel.add(iconLabel, BorderLayout.NORTH);
        }
        return contentPanel;
    }
}
