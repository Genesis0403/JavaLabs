package by.bntu.fitr.guesser.domain;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BinaryGuesser {
    private Scanner sc = new Scanner(System.in);

    public void guess(int leftBoundary, int rightBoundary) {
        int mid = (rightBoundary + leftBoundary) / 2;
        System.out.println("Is " + mid + " your boundary?(h -higher, l - lower, y - yes)");
        boolean isDone = false;
        while (!isDone) {
            try {
                String answer = sc.next();
                if (answer.equals("h")) {
                    leftBoundary = mid + 1;
                } else if (answer.equals("l")) {
                    rightBoundary = mid - 1;
                } else if (answer.equals("y")) {
                    System.out.println("Congratulation ME!!!!");
                    isDone = true;
                } else {
                    throw new InputMismatchException("Wrong input.");
                }
                mid = (rightBoundary + leftBoundary) / 2;
                System.out.println("Is " + mid + " your boundary?(h - higher, l - lower, y - yes)");
            } catch (InputMismatchException e) {
                e.printStackTrace();
            }
        }
    }
}
