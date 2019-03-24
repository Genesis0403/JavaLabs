package by.bntu.fitr.model;

import by.bntu.fitr.model.entity.Alcohol;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Barman {
    private List<Alcohol> listOfAlcohol;

    public Barman() {
        listOfAlcohol = new ArrayList<>();
    }

    public Barman(List<Alcohol> listOfAlcohol) {
        this.listOfAlcohol = listOfAlcohol;
    }

    public Barman(Barman barman) {
        listOfAlcohol = barman.listOfAlcohol;
    }

    public void add(Alcohol alcohol) {
        listOfAlcohol.add(alcohol);
    }

    public void remove(String name, int degree, int price) {
        for (Alcohol alcohol : listOfAlcohol) {
            if (alcohol.getDegree() == degree && alcohol.getPrice() == price && alcohol.getName().equals(name))
                listOfAlcohol.remove(alcohol);
        }
    }

    public void addAll(Collection<? extends Alcohol> subListOfAlcohol) {
        listOfAlcohol.addAll(subListOfAlcohol);
    }

    public int size() {
        return listOfAlcohol.size();
    }

    @Override
    public String toString() {
        return "Barman{" +
                "listOfAlcohol=" + listOfAlcohol +
                '}';
    }
}
