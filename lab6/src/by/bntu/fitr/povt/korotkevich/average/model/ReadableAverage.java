package by.bntu.fitr.povt.korotkevich.average.model;

import java.util.Scanner;

public class ReadableAverage {
    private Scanner sc = new Scanner(System.in);

    public ArithmeticAverage arithmetic() {
        System.out.println("Input a, b:");
        return new ArithmeticAverage(sc.nextDouble(), sc.nextDouble());
    }

    public GeometricAverage geometric() {
        System.out.println("Input a, b:");
        return new GeometricAverage(sc.nextDouble(), sc.nextDouble());
    }
}
