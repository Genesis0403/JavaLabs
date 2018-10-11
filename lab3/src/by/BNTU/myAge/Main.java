package by.BNTU.myAge;

public class Main {

    public static void main(String[] args) {
        ReadableConsole readableConsole = new ReadableConsole();
        Human student = readableConsole.input();
        TimeDifference difference = new TimeDifference(student.getBirth());
        TimeInterval interval = new TimeInterval(difference.inYears(), difference.inMonths(),
                difference.inDays(), difference.inHours(), difference.inMinutes(), difference.inSeconds());
        System.out.println(interval);
    }
}
