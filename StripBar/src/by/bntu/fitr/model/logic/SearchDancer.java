package by.bntu.fitr.model.logic;

import by.bntu.fitr.model.entity.Dancer;
import by.bntu.fitr.model.entity.NullDancer;
import by.bntu.fitr.model.entity.SexEnum;

import java.util.Collection;

public class SearchDancer {

    private SearchDancer(){}

    public static Dancer findDancer(Collection<? extends Dancer> list, String name, int age, int price, SexEnum sex) {
        Dancer result = new NullDancer();
        for (Dancer dancer : list) {
            if (dancer.getName().equals(name) && dancer.getAge() == age && dancer.getPrice() == price
                    && dancer.getSex() == sex) {
                result = dancer;
            }
        }
        return result;
    }

    public static Dancer findDancer(Collection<? extends Dancer> list, String name) {
        Dancer result = new NullDancer();
        for (Dancer dancer : list) {
            if (dancer.getName().equals(name)) {
                result = dancer;
            }
        }
        return result;
    }

    public static Dancer findDancer(Collection<? extends Dancer> list, String name, int age) {
        Dancer result = new NullDancer();
        for (Dancer dancer : list) {
            if (dancer.getName().equals(name) && dancer.getAge() == age) {
                result = dancer;
            }
        }
        return result;
    }

    public static Dancer findDancer(Collection<? extends Dancer> list, String name, int age, SexEnum sex) {
        Dancer result = new NullDancer();
        for (Dancer dancer : list) {
            if (dancer.getName().equals(name) && dancer.getAge() == age && dancer.getSex() == sex) {
                result = dancer;
            }
        }
        return result;
    }
}