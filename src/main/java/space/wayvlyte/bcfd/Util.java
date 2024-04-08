package space.wayvlyte.bcfd;

import com.google.gson.Gson;

import java.util.HashMap;

public class Util {

    // Just wrapping it
    public static String toJSON(HashMap<String, String> list) {
        return new Gson().toJson(list);
    }
}
