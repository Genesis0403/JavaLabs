package by.bntu.fitr.util;

import java.util.Scanner;

public class Input {
    Scanner scanner = new Scanner(System.in);
    public char read_char() {
        System.out.print("Input char: ");
        String input = scanner.next();
        char ch = input.charAt(0);
        if (input.length() > 1) {
            System.err.println("This is string, not char. Try again!");
            ch = read_char();
        }
        return ch;
    }
    public int read_int(){
        //System.out.println("Input int: ");
        int input;
        if (scanner.hasNextInt()){
            input = scanner.nextInt();
        }
        else{
            System.out.println("This is not number!");
            scanner.next();
            input = read_int();
        }
        return input;
    }
    public double read_double(){
        double input;
        System.out.println("Input double: ");
        if (scanner.hasNextDouble()){
            input = scanner.nextDouble();
        }
        else{
            System.out.println("This is not number");
            scanner.next();
            input = read_double();
        }
        return input;
    }
}
