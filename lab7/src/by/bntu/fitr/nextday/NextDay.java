package by.bntu.fitr.nextday;

public class NextDay {
    private int day;
    private int month;
    private int year;

    public NextDay(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return "NextDay{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}
