package by.bntu.fitr.model;

import by.bntu.fitr.model.entity.Dancer;

import java.util.*;

public class Manager implements Iterable<Dancer> {
    private List<Dancer> listOfDancers;
    private int modCount;

    public Manager() {
        listOfDancers = new ArrayList<>();
    }

    public Manager(List<Dancer> listOfDancers) {
        this.listOfDancers = listOfDancers;
    }

    public Manager(Manager manager) {
        listOfDancers = new ArrayList<>(manager.listOfDancers);
    }

    public void add(Dancer dancer) {
        if (dancer == null)
            throw new IllegalArgumentException();
        modCount++;
        listOfDancers.add(dancer);
    }

    public void remove(String name, String sex, int age, int price) {
        modCount++;
        for (Dancer dancer : listOfDancers)
            if (dancer.getAge() == age && dancer.getName().equals(name) && dancer.getPrice() == price
                    && dancer.getSex().equals(sex))
                listOfDancers.remove(dancer);
    }

    public void remove(int index) {
        if (index > 0 && index < size()) {
            modCount++;
            listOfDancers.remove(index);
        }
    }

    public Dancer get(int index) {
        if (index < 0 || index > size())
            throw new IndexOutOfBoundsException();
        return listOfDancers.get(index);
    }

    public void addAll(Collection<? extends Dancer> sublist) {

        modCount++;
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

    @Override
    public Iterator<Dancer> iterator() {
        return new Iterator<Dancer>() {
            int index;
            int expectedModCount = modCount;
            int lastRet = -1;

            @Override
            public boolean hasNext() {
                return index != size();
            }

            @Override
            public Dancer next() {
                checkForComodification();
                int i = index;
                if (i >= size())
                    throw new ConcurrentModificationException();
                index = i + 1;
                return listOfDancers.get(lastRet = i);
            }

            @Override
            public void remove() {
                if (lastRet < 0)
                    throw new IllegalStateException();
                checkForComodification();

                try {
                    Manager.this.remove(lastRet);
                    index = lastRet;
                    lastRet = -1;
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
