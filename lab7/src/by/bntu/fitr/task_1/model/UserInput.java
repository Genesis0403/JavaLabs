package by.bntu.fitr.task_1.model;

import  java.util.Scanner;

public class UserInput {
    private Scanner scanner = new Scanner(System.in);
    public Dragon execute()
    {
        while (!scanner.hasNextInt()) {
            System.out.println("That not a number!");
            scanner.next();
        }
        int age =  scanner.nextInt();
        return new Dragon(age);
    }
}
