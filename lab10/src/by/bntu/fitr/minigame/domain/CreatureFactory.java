package by.bntu.fitr.minigame.domain;

import by.bntu.fitr.minigame.domain.east.Beast;
import by.bntu.fitr.minigame.domain.east.DarkElf;
import by.bntu.fitr.minigame.domain.east.Vampire;
import by.bntu.fitr.minigame.domain.west.Dwarf;
import by.bntu.fitr.minigame.domain.west.ForestElf;
import by.bntu.fitr.minigame.domain.west.Human;

import java.util.HashMap;
import java.util.Map;

public class CreatureFactory {
    private static Map<String, Creature> creatures = new HashMap<>();
    {
        creatures.put("ForestElf", new ForestElf(150, 10, 30,10));
        creatures.put("Human", new Human(100, 30, 15,10));
        creatures.put("Dwarf", new Dwarf(200, 40, 5, 5));
        creatures.put("DarkElf", new DarkElf(100, 5, 5, 60));
        creatures.put("Vampire", new Vampire(150, 15, 30, 10));
        creatures.put("Beast", new Beast(200, 40, 5, 5));
    }

    private CreatureFactory() {}

    public static Creature getCreature(String name) {
        return creatures.get(name);
    }
}
