package by.bntu.fitr.guesser.domain;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class RandomGuesser {
    private Scanner sc = new Scanner(System.in);
    private Random  random = new Random();

    public void guees(int leftBoundary, int rightBoundary) {
        String answer;
        boolean isDone = false;
        while (!isDone) {
            try {
                System.out.println("Is " + (random.nextInt(rightBoundary) + leftBoundary) + " your number?(y/n)");
                answer = sc.next();
                if (answer.equals("y")) {
                    System.out.println("Congratulations!!!!");
                    isDone = true;
                } else if (!answer.equals("n")){
                    throw new InputMismatchException("Wrong input.");
                }
            } catch (InputMismatchException e) {
                e.printStackTrace();
            }
        }
    }
}
