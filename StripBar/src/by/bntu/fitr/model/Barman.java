package by.bntu.fitr.model;

import by.bntu.fitr.model.entity.alcohol.Alcohol;
import by.bntu.fitr.model.entity.alcohol.NullAlcohol;

import java.util.*;

public class Barman implements Iterable<Alcohol> {
    private List<Alcohol> listOfAlcohol;
    private int modCount;

    public Barman() {
        listOfAlcohol = new ArrayList<>();
    }

    public Barman(List<Alcohol> listOfAlcohol) {
        this.listOfAlcohol = listOfAlcohol;
    }

    public Barman(Barman barman) {
        listOfAlcohol = new ArrayList<>(barman.listOfAlcohol);
    }

    public void add(Alcohol alcohol) {
        if (alcohol == null)
            throw new IllegalArgumentException();
        modCount++;
        listOfAlcohol.add(alcohol);

    }

    public Alcohol get(int index) {
        if (index > size() || index < 0)
            throw new IndexOutOfBoundsException();
        return listOfAlcohol.get(index);
    }

    public void remove(String name, int degree, int price) {
        modCount++;
        for (Alcohol alcohol : listOfAlcohol) {
            if (alcohol.getDegree() == degree && alcohol.getPrice() == price && alcohol.getName().equals(name))
                listOfAlcohol.remove(alcohol);
        }
    }

    public void remove(int index) {
        if (index > 0 && index < size()) {
            modCount++;
            listOfAlcohol.remove(index);
        }
    }

    public void addAll(Collection<? extends Alcohol> subListOfAlcohol) {
        modCount++;
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

    @Override
    public Iterator<Alcohol> iterator() {
        return new Iterator<Alcohol>() {
            int index;
            int expectedModCount = modCount;
            int listRet = -1;

            @Override
            public boolean hasNext() {
                return index != size();
            }

            @Override
            public Alcohol next() {
                checkForComodification();
                int i = index;
                if (i >= size())
                    throw new ConcurrentModificationException();
                index = i + 1;
                return listOfAlcohol.get(listRet = i);
            }

            @Override
            public void remove() {
                if (listRet < 0)
                    throw new IllegalStateException();
                checkForComodification();
                try {
                    Barman.this.remove(listRet);
                    index = listRet;
                    listRet = -1;
                    expectedModCount = modCount;
                } catch (IndexOutOfBoundsException ex) {
                    throw new ConcurrentModificationException();
                }
            }

            final void checkForComodification() {
                if (modCount != expectedModCount)
                    throw new ConcurrentModificationException();
            }
        };
    }
}
