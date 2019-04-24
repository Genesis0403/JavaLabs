package by.bntu.fitr.model;

import by.bntu.fitr.model.entity.Alcohol;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class BarmanTest {

    @Test
    public void add() {
        Barman barman = new Barman();
        barman.add(new Alcohol());
        assertEquals(1, barman.size());
    }

    @Test
    public void remove() {
        Barman barman = new Barman();
        barman.add(new Alcohol());
        barman.add(new Alcohol());
        barman.remove(1);
        assertEquals(1, barman.size());
    }

    @Test
    public void remove1() {
        Barman barman = new Barman();
    }

    @Test
    public void get() {
        Barman barman = new Barman();
        barman.add(new Alcohol());
        barman.add(new Alcohol());
        assertEquals(new Alcohol(), barman.get(1));
    }

    @Test
    public void addAll() {
        Barman barman = new Barman();
        barman.add(new Alcohol());
        barman.add(new Alcohol());
        List<Alcohol> barman1 = new LinkedList<Alcohol>();
        barman1.add(new Alcohol());
        barman.addAll(barman1);
        assertEquals(3, barman.size());
    }

    @Test
    public void size() {
        Barman barman = new Barman();
        barman.add(new Alcohol());
        barman.add(new Alcohol());
        barman.add(new Alcohol());
        barman.add(new Alcohol());
        barman.add(new Alcohol());
        assertEquals(5, barman.size());
    }
}