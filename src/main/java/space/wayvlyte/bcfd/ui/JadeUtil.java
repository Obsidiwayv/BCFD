package space.wayvlyte.bcfd.ui;

import java.awt.*;

public class JadeUtil {
    public static void setAA(Graphics2D graphics) {
        graphics.addRenderingHints(new RenderingHints(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON
        ));
    }
}
