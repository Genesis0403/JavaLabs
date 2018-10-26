package by.bntu.fitr.povt.filippovich.ring.model;

import java.util.Scanner;

public class Input {
    Scanner sc = new Scanner(System.in);

    public RingAreaCalculator execute(){
        System.out.println("Input radius1, radius2:");
        return new RingAreaCalculator(sc.nextDouble(), sc.nextDouble());
    }
}
