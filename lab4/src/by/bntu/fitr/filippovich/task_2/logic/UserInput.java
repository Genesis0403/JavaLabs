package by.bntu.fitr.filippovich.task_2.logic;

import java.util.Scanner;

public class UserInput {
    private  Scanner scan = new Scanner(System.in);

    public Numbers execute(){
        return new Numbers(scan.nextDouble(), scan.nextDouble(), scan.nextDouble());
    }
}
