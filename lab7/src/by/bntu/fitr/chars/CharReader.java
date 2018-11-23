package by.bntu.fitr.chars;

import java.util.Scanner;

public class CharReader {
    private Scanner sc = new Scanner(System.in);

    public char read() {
        System.out.print("Input char: ");
        String input = sc.next();
        char ch = input.charAt(0);
        if (input.length() > 1) {
            System.err.println("This is string, not char. Try again!");
            ch = read();
        }
        return ch;
    }
}
