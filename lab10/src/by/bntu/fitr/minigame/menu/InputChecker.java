package by.bntu.fitr.minigame.menu;

public class InputChecker {
    public void checkChoice(int size, String choice) {
        int userChoice = Integer.parseInt(choice);
        if (userChoice < 0 || userChoice > size) {
            throw new IllegalArgumentException("Wrong input.");
        }
    }

    public void notMinus(String input) {
        if (Integer.parseInt(input) <= 0) {
            throw new IllegalArgumentException("Wrong input.");
        }
    }
}
