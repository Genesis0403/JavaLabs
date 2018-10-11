package by.BNTU.myAge;

import java.util.Date;

public class Human {
    private Date birth;

    public Human(Date birth) {
        this.birth = birth;
    }

    public Date getBirth() {
        return birth;
    }

    @Override
    public String toString() {
        return "Human{" +
                "birth=" + birth +
                '}';
    }
}
