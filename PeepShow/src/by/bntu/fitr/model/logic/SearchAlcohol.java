package by.bntu.fitr.model.logic;

import by.bntu.fitr.model.entity.Alcohol;

import java.util.Collection;

public class SearchAlcohol {
    public static Alcohol findAlcohol(Collection<? extends Alcohol> list, String name, int degree, int price) {
        Alcohol result = new Alcohol();
        for (Alcohol alcohol : list) {
            if (alcohol.getName().equals(name) && alcohol.getPrice() == price && alcohol.getDegree() == degree) {
                result = alcohol;
            }
        }
        return result;
    }

    public static Alcohol findAlcohol(Collection<? extends Alcohol> list, String name) {
        Alcohol result = new Alcohol();
        for (Alcohol alcohol : list) {
            if (alcohol.getName().equals(name)) {
                result = alcohol;
            }
        }
        return result;
    }

    public static Alcohol findAlcohol(Collection<? extends Alcohol> list, String name, int price) {
        Alcohol result = new Alcohol();
        for (Alcohol alcohol : list) {
            if (alcohol.getName().equals(name) && alcohol.getPrice() == price) {
                result = alcohol;
            }
        }
        return result;
    }
}