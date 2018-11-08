package by.bntu.fitr.korotkevich.task_3.logic;

import java.util.Scanner;

public class UserInput {
    private  Scanner scan = new Scanner(System.in);

    public Numbers execute(){
        return new Numbers(scan.nextDouble(), scan.nextDouble(), scan.nextDouble());
    }
}
