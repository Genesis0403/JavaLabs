package by.bntu.fitr.minigame.view;

import by.bntu.fitr.minigame.domain.Creature;

import java.util.Map;

public class GroupView {
    public void show(Map.Entry<Creature, Integer> group) {
        System.out.println(group.getKey() + ",\t\tunits: " + group.getValue());
    }
}
