package by.bntu.fitr.task_2.model;

import java.util.Scanner;

public class UserInput {
    private Scanner scanner = new Scanner(System.in);
    public Greatest execute()
    {
        int number1 = inputInt();
        int number2 = inputInt();
        int number3 = inputInt();
        return new Greatest(number1,number2,number3);
    }
    private int inputInt(){
        int number;
        if(scanner.hasNextInt()){
            number = scanner.nextInt();
        }
        else{
            System.out.println("This is not number!");
            scanner.next();
            number = inputInt();
        }
        return number;
    }
}
