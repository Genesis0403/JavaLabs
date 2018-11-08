package by.bntu.fitr.korotkevich.task_4.logic;

import java.util.Scanner;

public class UserInput {
    private Scanner scan = new Scanner(System.in);
    public Palindrom execute(){
        return new Palindrom(scan.nextInt());
    }
}
