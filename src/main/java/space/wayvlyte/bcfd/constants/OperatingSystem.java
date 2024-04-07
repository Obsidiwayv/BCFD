package space.wayvlyte.bcfd.constants;

public class OperatingSystem {
    public static String windows = "Windows";

    public static boolean isWindows() {
        return System.getProperty("os.name").startsWith(windows);
    }
}
