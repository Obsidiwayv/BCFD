package space.wayvlyte.bcfd.ui.windows;

public class BaseWindow {
    public Window window;

    public void start() {
        try {
            this.render();
        } catch (Exception ignored) {}
    }

    public static void build(Window win) {}

    public void render() {}
}
