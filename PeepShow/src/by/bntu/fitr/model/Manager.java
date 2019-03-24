package by.bntu.fitr.model;

import by.bntu.fitr.model.entity.Dancer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Manager {
    private List<Dancer> listOfDancers;

    public Manager() {
        listOfDancers = new ArrayList<>();
    }

    public Manager(List<Dancer> listOfDancers) {
        this.listOfDancers = listOfDancers;
    }

    public Manager(Manager manager) {
        listOfDancers = manager.listOfDancers;
    }

    public void add(Dancer dancer) {
        listOfDancers.add(dancer);
    }

    public void remove(String name, String sex, int age, int price) {
        for (Dancer dancer : listOfDancers)
            if (dancer.getAge() == age && dancer.getName().equals(name) && dancer.getPrice() == price
                    && dancer.getSex().equals(sex))
                listOfDancers.remove(dancer.getAge());
    }

    public void addAll(Collection<? extends Dancer> sublist) {
        listOfDancers.addAll(sublist);
    }

    public int size() {
        return listOfDancers.size();
    }

    @Override
    public String toString() {
        return "Manager{" +
                "listOfDancers=" + listOfDancers +
                '}';
    }
}
