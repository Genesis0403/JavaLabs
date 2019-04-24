package by.bntu.fitr.model;

import by.bntu.fitr.model.entity.Dancer;
import org.junit.Test;

import java.awt.*;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class ManagerTest {

    @Test
    public void add() {
        Manager manager = new Manager();
        manager.add(new Dancer());
        assertEquals(1, manager.size());
    }

    @Test
    public void remove() {
        Manager manager = new Manager();
        manager.add(new Dancer());
        manager.add(new Dancer());
        manager.add(new Dancer());
        manager.remove(1);
        assertEquals(2, manager.size());
    }

    @Test
    public void remove1() {
    }

    @Test
    public void get() {
        Manager manager = new Manager();
        manager.add(new Dancer());
        manager.add(new Dancer());
        assertEquals(new Dancer(), manager.get(0));

    }

    @Test
    public void addAll() {
        Manager manager = new Manager();
        manager.add(new Dancer());
        manager.add(new Dancer());
        Set<Dancer> set = new HashSet<Dancer>();
        set.add(new Dancer());
        manager.addAll(set);
        assertEquals(3, manager.size());
    }

    @Test
    public void size() {
        Manager manager = new Manager();
        manager.add(new Dancer());
        manager.add(new Dancer());
        assertEquals(2, manager.size());
    }

    @Test
    public void size1() {
        Manager manager = new Manager();
        assertEquals(0, manager.size());
    }
}