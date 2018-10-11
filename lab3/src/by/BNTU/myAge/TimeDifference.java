package by.BNTU.myAge;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

/**
 *  This class calculates time difference between now
 *  and birth day of a human.
 *
 * @author Vlad Korotkevich
 * @author Evgeniy Filippovich
 * @version 1.0
 */

public class TimeDifference {
    private LocalDateTime birth;
    private LocalDateTime now = LocalDateTime.now();

    public TimeDifference(Date birth) {
        this.birth = LocalDateTime.ofInstant(birth.toInstant(), ZoneId.systemDefault());
    }

    public int inYears() {
        return Period.between(birth.toLocalDate(), now.toLocalDate()).getYears();
    }

    public int inMonths() {
        return Period.between(birth.toLocalDate(), now.toLocalDate()).getMonths();
    }

    public int inDays() {
        return Period.between(birth.toLocalDate(), now.toLocalDate()).getDays();
    }

    //can return negative number, but its okay, use Math.abs()
    public int inHours() {
        LocalDateTime birth = LocalDateTime.from(this.birth);
        birth = birth.plusYears(inYears()).plusMonths(inMonths()).plusDays(inDays());
        return (int)Duration.between(birth, now).toHours();
    }

    public int inMinutes() {
        LocalDateTime birth = LocalDateTime.from(this.birth);
        birth = birth.plusYears(inYears()).plusMonths(inMonths()).plusDays(inDays()).
                plusHours(inHours());
        return (int)Duration.between(birth, now).toMinutes();
    }

    public int inSeconds() {
        LocalDateTime birth = LocalDateTime.from(this.birth);
        birth = birth.plusYears(inYears()).plusMonths(inMonths()).plusDays(inDays()).
                plusHours(inHours()).plusMinutes(inMinutes());
        return (int)Duration.between(birth, now).getSeconds();
    }
}
