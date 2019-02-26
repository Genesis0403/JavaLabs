package by.bntu.fitr.minigame.domain.east;

import by.bntu.fitr.minigame.domain.Creature;
import by.bntu.fitr.minigame.domain.Union;

import java.util.HashMap;
import java.util.Map;

public class EastUnion implements Union {
    private static EastUnion instance;
    private Map<Creature, Integer> union = new HashMap<>();
    {
        union.put(new ForestElf(150, 10, 30,10), 30);
        union.put(new Human(100, 30, 15,10), 30);
        union.put(new Dwarf(200, 40, 5, 5), 30);
    }

    private EastUnion(){}

    public static EastUnion getInstance() {
        if (instance == null) {
            instance = new EastUnion();
        }
        return instance;
    }

    @Override
    public void add(Class creature, int amount) {
        for (Map.Entry<Creature, Integer> mob : union.entrySet()) {
            if (mob.getKey().getClass() == creature) {
                union.compute(mob.getKey(), (key, value) -> value += amount);
            }
        }
        //union.forEach((k,v) -> System.out.println(k + " " + v));
    }

    @Override
    public Map.Entry<Creature, Integer> get(int choice) {
        int i = 0;
        for (Map.Entry<Creature, Integer> mob : union.entrySet()) {
            if (i == choice) {
                return mob;
            }
            i++;
        }
        throw new IllegalArgumentException("Element not found.");
    }

    @Override
    public int getArmySize() {
        return union.size();
    }

    public Map<Creature, Integer> getUnion() {
        return union;
    }
}
