package test.by.bntu.fitr.model.logic;

import by.bntu.fitr.model.Barman;
import by.bntu.fitr.model.entity.alcohol.Alcohol;
import by.bntu.fitr.model.entity.alcohol.NullAlcohol;
import by.bntu.fitr.model.entity.TypeOfAlcoholEnum;
import by.bntu.fitr.model.logic.SearchAlcohol;
import org.junit.Test;

import static org.junit.Assert.*;

public class SearchAlcoholTest {

    @Test
    public void findAlcohol() {
        Barman barman = new Barman();
        Alcohol alcohol1 = new Alcohol("vodka", 25, 40, TypeOfAlcoholEnum.VODKA);
        Alcohol alcohol2 = new Alcohol("alc", 32, 41, TypeOfAlcoholEnum.BEER);
        Alcohol alcohol3 = new Alcohol("sos", 12, 21, TypeOfAlcoholEnum.CHAMPANGE);
        barman.add(alcohol1);
        barman.add(alcohol2);
        barman.add(alcohol3);
        assertEquals(alcohol1, SearchAlcohol.findAlcohol(barman, "vodka"));
    }

    @Test
    public void findAlcohol1() {
        Barman barman = new Barman();
        Alcohol alcohol1 = new Alcohol("vodka", 25, 40, TypeOfAlcoholEnum.VODKA);
        Alcohol alcohol2 = new Alcohol("alc", 32, 41, TypeOfAlcoholEnum.BEER);
        Alcohol alcohol3 = new Alcohol("sos", 12, 21, TypeOfAlcoholEnum.CHAMPANGE);
        barman.add(alcohol1);
        barman.add(alcohol2);
        barman.add(alcohol3);
        assertEquals(new NullAlcohol(), SearchAlcohol.findAlcohol(barman, "beer"));
    }

    @Test
    public void findAlcohol2() {
        Barman barman = new Barman();
        Alcohol alcohol1 = new Alcohol("vodka", 25, 40, TypeOfAlcoholEnum.VODKA);
        Alcohol alcohol2 = new Alcohol("alc", 32, 41, TypeOfAlcoholEnum.BEER);
        Alcohol alcohol3 = new Alcohol("sos", 12, 21, TypeOfAlcoholEnum.CHAMPANGE);
        barman.add(alcohol1);
        barman.add(alcohol2);
        barman.add(alcohol3);
        assertEquals(alcohol2, SearchAlcohol.findAlcohol(barman, "alc", 41,32));
    }

    @Test
    public void findAlcohol3(){
        Barman barman = new Barman();
        Alcohol alcohol1 = new Alcohol("vodka", 25, 40, TypeOfAlcoholEnum.VODKA);
        Alcohol alcohol2 = new Alcohol("alc", 32, 41, TypeOfAlcoholEnum.BEER);
        Alcohol alcohol3 = new Alcohol("sos", 12, 21, TypeOfAlcoholEnum.CHAMPANGE);
        barman.add(alcohol1);
        barman.add(alcohol2);
        barman.add(alcohol3);
        assertEquals(alcohol2, SearchAlcohol.findAlcohol(barman, "alc", 32));
    }
}