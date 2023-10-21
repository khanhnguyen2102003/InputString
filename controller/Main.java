package controller;

import java.util.Scanner;
import model.Input;
import view.View;

public class Main {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        boolean continueRunning;
        do {
            System.out.println("========Analysis String Program========");
            System.out.print("Enter a string: ");
            String inputString = in.nextLine();

            Input model = new Input();
            View view = new View();
            manager controller = new manager(model, view);

            controller.processNumberInfo(inputString);
            controller.processCharacterInfo(inputString);

            String continueChoice;
            do {
                System.out.print("Do you want to continue (yes/no)? ");
                continueChoice = in.nextLine().toLowerCase();
                if (!continueChoice.equals("yes") && !continueChoice.equals("no")) {
                    System.out.println("Please enter 'yes' or 'no'.");
                }
            } while (!continueChoice.equals("yes") && !continueChoice.equals("no"));

            continueRunning = continueChoice.equals("yes");
        } while (continueRunning);
    }
}



