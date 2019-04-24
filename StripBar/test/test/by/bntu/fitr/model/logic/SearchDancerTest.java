package test.by.bntu.fitr.model.logic;

import by.bntu.fitr.model.Manager;
import by.bntu.fitr.model.entity.Dancer;
import by.bntu.fitr.model.entity.NullDancer;
import by.bntu.fitr.model.entity.SexEnum;
import by.bntu.fitr.model.logic.SearchDancer;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SearchDancerTest {

    @Test
    public void findDancer() {
        Manager manager = new Manager();
        Dancer dancer1 = new Dancer("Vlad",19,new ArrayList<>(),1,SexEnum.MALE);
        Dancer dancer2 = new Dancer("Ilona", 21, new ArrayList<>(), 100,SexEnum.FEMALE);
        Dancer dancer3 = new Dancer("Olya", 21, new ArrayList<>(), 300,SexEnum.FEMALE);
        manager.add(dancer1);
        manager.add(dancer2);
        manager.add(dancer3);
        assertEquals(dancer1, SearchDancer.findDancer(manager,"Vlad"));
    }

    @Test
    public void findDancer1() {
        Manager manager = new Manager();
        Dancer dancer1 = new Dancer("Vlad",19,new ArrayList<>(),1,SexEnum.MALE);
        Dancer dancer2 = new Dancer("Ilona", 21, new ArrayList<>(), 100,SexEnum.FEMALE);
        Dancer dancer3 = new Dancer("Olya", 21, new ArrayList<>(), 300,SexEnum.FEMALE);
        manager.add(dancer1);
        manager.add(dancer2);
        manager.add(dancer3);
        assertEquals(new NullDancer(), SearchDancer.findDancer(manager,"Zhenya"));
    }

    @Test
    public void findDancer2() {
        Manager manager = new Manager();
        Dancer dancer1 = new Dancer("Vlad",19,new ArrayList<>(),1,SexEnum.MALE);
        Dancer dancer2 = new Dancer("Ilona", 21, new ArrayList<>(), 100,SexEnum.FEMALE);
        Dancer dancer3 = new Dancer("Olya", 21, new ArrayList<>(), 300,SexEnum.FEMALE);
        manager.add(dancer1);
        manager.add(dancer2);
        manager.add(dancer3);
        assertEquals(dancer2, SearchDancer.findDancer(manager,"Ilona",21));
    }

    @Test
    public void findDancer3() {
        Manager manager = new Manager();
        Dancer dancer1 = new Dancer("Vlad",19,new ArrayList<>(),1,SexEnum.MALE);
        Dancer dancer2 = new Dancer("Ilona", 21, new ArrayList<>(), 100,SexEnum.FEMALE);
        Dancer dancer3 = new Dancer("Olya", 21, new ArrayList<>(), 300,SexEnum.FEMALE);
        manager.add(dancer1);
        manager.add(dancer2);
        manager.add(dancer3);
        assertEquals(dancer3, SearchDancer.findDancer(manager,"Olya", 21, SexEnum.FEMALE));
    }

    @Test
    public void findDancer4(){
        Manager manager = new Manager();
        Dancer dancer1 = new Dancer("Vlad",19,new ArrayList<>(),1,SexEnum.MALE);
        Dancer dancer2 = new Dancer("Ilona", 21, new ArrayList<>(), 100,SexEnum.FEMALE);
        Dancer dancer3 = new Dancer("Olya", 21, new ArrayList<>(), 300,SexEnum.FEMALE);
        manager.add(dancer1);
        manager.add(dancer2);
        manager.add(dancer3);
        assertEquals(new NullDancer(), SearchDancer.findDancer(manager,"Vlad", 19, SexEnum.FEMALE));
    }
}