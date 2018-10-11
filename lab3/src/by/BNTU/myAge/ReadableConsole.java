package by.BNTU.myAge;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class ReadableConsole {
    private Scanner sc = new Scanner(System.in);

    public Human input() {
        System.out.print("Input your birthday(dd.MM.yyyy HH:mm:ss): ");
        try {
            return new Human(new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").parse(sc.next()));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
