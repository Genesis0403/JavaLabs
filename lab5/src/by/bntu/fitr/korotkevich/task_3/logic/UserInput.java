package by.bntu.fitr.korotkevich.task_3.logic;

import by.bntu.fitr.korotkevich.task_3.logic.NumberOperation;

import java.util.Scanner;

public class UserInput {
    Scanner scan = new Scanner(System.in);
    public NumberOperation execute(){
        return new NumberOperation(scan.nextInt());
    }
}
