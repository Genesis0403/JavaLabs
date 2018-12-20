package by.bntu.fitr.minigame.domain;

import java.util.Map;

public interface Union {
    void add(Class creature, int amount);
    Map.Entry<Creature, Integer> get(int choice);
    int getArmySize();
}
