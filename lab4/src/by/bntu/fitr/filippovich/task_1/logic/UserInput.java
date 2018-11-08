package by.bntu.fitr.filippovich.task_1.logic;

import java.util.Scanner;

public class UserInput {
    private Scanner scan = new Scanner(System.in);

    public NumberDifferent execute(){
        return new NumberDifferent(scan.nextDouble(),scan.nextDouble(),scan.nextDouble());
    }
}
