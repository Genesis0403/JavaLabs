package by.bntu.fitr.guesser.controller;

import by.bntu.fitr.guesser.domain.BinaryGuesser;
import by.bntu.fitr.guesser.domain.RandomGuesser;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Controller {
    private BinaryGuesser binary = new BinaryGuesser();
    private RandomGuesser random = new RandomGuesser();
    private Scanner sc = new Scanner(System.in);

    public void start() {
        try {
            System.out.println("Input left and right boundary.");
            int left = sc.nextInt();
            int right = sc.nextInt();
            checkBoundaries(left, right);
            boolean isDone = false;
            while (!isDone) {
                System.out.println("Choose guesser.\n1 - Binary\n2 - Random\n3 - Exit");
                switch (sc.nextInt()) {
                    case 1:
                        binary.guess(left, right);
                        break;
                    case 2:
                        random.guees(left, right);
                        break;
                    case 3:
                        isDone = true;
                        break;
                    default:
                        System.out.println("Choose from 1-3");
                }
            }
        } catch(InputMismatchException e){
            e.printStackTrace();
        }
    }

    private void checkBoundaries(int left, int right) {
        if (left >= right) {
            throw new InputMismatchException();
        }
    }
}
