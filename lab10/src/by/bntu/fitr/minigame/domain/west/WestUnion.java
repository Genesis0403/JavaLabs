package by.bntu.fitr.minigame.domain.west;

import by.bntu.fitr.minigame.domain.Creature;
import by.bntu.fitr.minigame.domain.Union;
import by.bntu.fitr.minigame.domain.west.Beast;
import by.bntu.fitr.minigame.domain.west.DarkElf;
import by.bntu.fitr.minigame.domain.west.Vampire;

import java.util.HashMap;
import java.util.Map;

public class WestUnion implements Union {
    private static WestUnion instance;
    private Map<Creature, Integer> union = new HashMap<>();
    {
        union.put(new DarkElf(100, 5, 5, 60), 30);
        union.put(new Vampire(150, 15, 30, 10), 30);
        union.put(new Beast(200, 40, 5, 5), 30);
    }

    private WestUnion(){}

    public static WestUnion getInstance() {
        if (instance == null) {
            instance = new WestUnion();
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
