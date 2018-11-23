package by.bntu.fitr.nextday;

import java.time.LocalDate;

public class NextDaySolver {

    public NextDay solve(LocalDate date) {
        int day = date.getDayOfMonth();
        int month = date.getMonthValue();
        int year = date.getYear();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            if (month == 2) {
                day = ++day % 30;
            } else if (month % 2 == 0) {
                day = ++day % 31;
            } else {
                day = ++day % 32;
            }
        } else {
            if (month == 2) {
                day = ++day % 29;
            } else if (month % 2 == 0) {
                day = ++day % 31;
            } else {
                day = ++day % 32;
            }
        }

        day = (day == 0 ? ++day : day);

        if (day == 1) {
            month = ++month % 12;
            month = (month == 0 ? ++month : month);

            if (month == 1) {
                year++;
            }
        }
        return new NextDay(day, month, year);
    }
}
