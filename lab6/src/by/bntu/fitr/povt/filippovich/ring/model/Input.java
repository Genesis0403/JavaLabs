package by.bntu.fitr.povt.filippovich.ring.model;

import java.util.Scanner;

public class Input {
    public double UserInput(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.println(msg);
        double value = sc.nextDouble();
        return value;
    }
}
