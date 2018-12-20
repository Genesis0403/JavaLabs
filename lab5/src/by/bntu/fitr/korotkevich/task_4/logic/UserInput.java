package by.bntu.fitr.korotkevich.task_4.logic;

import java.util.Scanner;

public class UserInput {
    Scanner scan = new Scanner(System.in);
    public NumberOperation execute(){
        return new NumberOperation(scan.nextInt());
    }
}
