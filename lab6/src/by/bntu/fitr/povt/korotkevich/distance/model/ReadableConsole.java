package by.bntu.fitr.povt.korotkevich.distance.model;

import java.util.Scanner;

public class ReadableConsole {
    private Scanner sc = new Scanner(System.in);

    public DistanceCounter execute() {
        System.out.println("Input V1, V2, time, begin distance(km/h): ");
        return new DistanceCounter(sc.nextInt(), sc.nextInt(),
                sc.nextDouble(), sc.nextDouble());
    }
}
