package by.bntu.fitr.nextday;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ReadDate {
    private Scanner sc = new Scanner(System.in);

    public LocalDate read() {
        System.out.print("Input date(dd.MM.yyyy): ");
        String input = sc.next();
        LocalDate date;
        try {
            date = LocalDate.parse(input, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        } catch (DateTimeException e) {
            System.err.println("Wrong format. Try again!");
            date = this.read();
        }
        return date;
    }
}
