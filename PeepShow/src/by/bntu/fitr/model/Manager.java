package by.bntu.fitr.model;

import by.bntu.fitr.model.entity.Dancer;

import java.util.ArrayList;
import java.util.List;

public class Manager {
    private List<Dancer> listOfDancers = new ArrayList<Dancer>();

    public void addDancer(Dancer dancer) {
        listOfDancers.add(dancer);
    }

    public void remove(String name, String sex, int age, int price) {
        for (Dancer dancer : listOfDancers)
            if (dancer.getAge() == age && dancer.getName().equals(name) && dancer.getPrice() == price
                    && dancer.getSex().equals(sex))
                listOfDancers.remove(dancer.getAge());
    }


    @Override
    public String toString() {
        return "Manager{" +
                "listOfDancers=" + listOfDancers +
                '}';
    }
}
