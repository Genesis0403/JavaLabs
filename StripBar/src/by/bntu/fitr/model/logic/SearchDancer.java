package by.bntu.fitr.model.logic;

import by.bntu.fitr.model.Manager;
import by.bntu.fitr.model.entity.dancer.Dancer;
import by.bntu.fitr.model.entity.dancer.NullDancer;
import by.bntu.fitr.model.entity.SexEnum;

import java.util.Collection;

public class SearchDancer {

    private SearchDancer(){}

    public static Dancer findDancer(Manager list, String name, int age, int price, SexEnum sex) {
        Dancer result = new NullDancer();
        for (Dancer dancer : list) {
            if (dancer.getName().equals(name) && dancer.getAge() == age && dancer.getPrice() == price
                    && dancer.getSex() == sex) {
                result = dancer;
            }
        }
        return result;
    }

    public static Dancer findDancer(Manager list, String name) {
        Dancer result = new NullDancer();
        for (Dancer dancer : list) {
            if (dancer.getName().equals(name)) {
                result = dancer;
            }
        }
        return result;
    }

    public static Dancer findDancer(Manager list, String name, int age) {
        Dancer result = new NullDancer();
        for (Dancer dancer : list) {
            if (dancer.getName().equals(name) && dancer.getAge() == age) {
                result = dancer;
            }
        }
        return result;
    }

    public static Dancer findDancer(Manager list, String name, int age, SexEnum sex) {
        Dancer result = new NullDancer();
        for (Dancer dancer : list) {
            if (dancer.getName().equals(name) && dancer.getAge() == age && dancer.getSex() == sex) {
                result = dancer;
            }
        }
        return result;
    }
}
