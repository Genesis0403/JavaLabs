package by.bntu.fitr.model;

import by.bntu.fitr.model.entity.Alcohol;

import java.util.ArrayList;
import java.util.List;

public class Barman {
    private List<Alcohol> listOfAlcohol = new ArrayList<Alcohol>();

    public void add(Alcohol alcohol){
        listOfAlcohol.add(alcohol);
    }

    public void remove(String name, int degree, int price){
        for (Alcohol alcohol: listOfAlcohol){
            if(alcohol.getDegree() == degree && alcohol.getPrice() == price && alcohol.getName().equals(name))
                listOfAlcohol.remove(alcohol);
        }
    }

    @Override
    public String toString() {
        return "Barman{" +
                "listOfAlcohol=" + listOfAlcohol +
                '}';
    }
}
