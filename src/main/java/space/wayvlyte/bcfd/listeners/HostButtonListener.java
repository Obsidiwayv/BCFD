package space.wayvlyte.bcfd.listeners;

import space.wayvlyte.bcfd.ProgramEntry;

public class HostButtonListener {
    public static void wasClicked() {
        ProgramEntry.console.log("Host button was clicked! attempting to start bot...");
    }
}
