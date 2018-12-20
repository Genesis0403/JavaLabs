package by.bntu.fitr.filippovich.task_2.logic;

import java.util.Scanner;

public class UserInput {
    Scanner scan = new Scanner(System.in);
    public NumberOperation execute(){
        return new NumberOperation(scan.nextInt());
    }
}
