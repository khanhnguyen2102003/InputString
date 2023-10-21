package controller;
import java.util.ArrayList;
import java.util.HashMap;
import model.Input;
import view.View;

public class manager {

    private Input model;
    private View view;

    public manager(Input model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processNumberInfo(String inputString) {
        HashMap<String, ArrayList<Integer>> numberInfo = model.getNumberInfo(inputString);
        view.printNumberInfo(numberInfo);
    }

    public void processCharacterInfo(String inputString) {
        HashMap<String, String> characterInfo = model.getCharacterInfo(inputString);
        view.printCharacterInfo(characterInfo);
    }
}
