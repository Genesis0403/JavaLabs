package by.bntu.fitr.model.logic;

import by.bntu.fitr.model.Barman;
import by.bntu.fitr.model.entity.alcohol.Alcohol;
import by.bntu.fitr.model.entity.alcohol.NullAlcohol;

public class SearchAlcohol {

    private SearchAlcohol(){}

    public static Alcohol findAlcohol(Barman list, String name, int degree, int price) {
        Alcohol result = new NullAlcohol();
        for (Alcohol alcohol : list) {
            if (alcohol.getName().equals(name) && alcohol.getPrice() == price && alcohol.getDegree() == degree) {
                result = alcohol;
            }
        }
        return result;
    }

    public static Alcohol findAlcohol(Barman list, String name) {
        Alcohol result = new NullAlcohol();
        for (Alcohol alcohol : list) {
            if (alcohol.getName().equals(name)) {
                result = alcohol;
            }
        }
        return result;
    }

    public static Alcohol findAlcohol(Barman list, String name, int price) {
        Alcohol result = new NullAlcohol();
        for (Alcohol alcohol : list) {
            if (alcohol.getName().equals(name) && alcohol.getPrice() == price) {
                result = alcohol;
            }
        }
        return result;
    }
}