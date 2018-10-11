package by.BNTU.myAge;

public class TimeInterval {
    private int years;
    private int months;
    private int days;
    private int hours;
    private int minutes;
    private int seconds;

    public TimeInterval(int years, int months, int days, int hours, int minutes, int seconds) {
        this.years = years;
        this.months = months;
        this.days = days;
        this.hours = Math.abs(hours);
        this.minutes = Math.abs(minutes);
        this.seconds = Math.abs(seconds);
    }

    @Override
    public String toString() {
        return "TimeInterval{" +
                "years=" + years +
                ", months=" + months +
                ", days=" + days +
                ", hours=" + hours +
                ", minutes=" + minutes +
                ", seconds=" + seconds +
                '}';
    }
}
