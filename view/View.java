package view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class View {

    public void printNumberInfo(HashMap<String, ArrayList<Integer>> numberInfo) {
        System.out.println("============Result Analysis============");
        for (Map.Entry<String, ArrayList<Integer>> entry : numberInfo.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public void printCharacterInfo(HashMap<String, String> characterInfo) {
        for (Map.Entry<String, String> entry : characterInfo.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
