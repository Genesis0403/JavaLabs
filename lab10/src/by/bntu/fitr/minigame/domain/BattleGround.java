package by.bntu.fitr.minigame.domain;

import java.util.Map;
import java.util.Random;

public class BattleGround {
    private Random random = new Random();

    public void fight(Map.Entry<Creature, Integer> east, Map.Entry<Creature, Integer> west) {
        if (east.getValue() == 0 || west.getValue() == 0) {
            throw new IllegalStateException("Empty units.");
        }

        int step = random.nextInt(2);
        int damage, finalUnitAmount;
        if (step == 0) {
            System.out.println("EAST ATTACK WEST!\n");
            damage = east.getKey().dealDamage();
            finalUnitAmount = west.getValue() - (damage / west.getKey().getHealth()) < 0
                              ? 0
                              : west.getValue() - (damage / west.getKey().getHealth());
            west.setValue(finalUnitAmount);
        } else {
            System.out.println("\nWEST ATTACK EAST!\n");
            damage = west.getKey().dealDamage();
            finalUnitAmount = east.getValue() - (damage / east.getKey().getHealth()) < 0
                              ? 0
                              : east.getValue() - (damage / east.getKey().getHealth());
            east.setValue(finalUnitAmount);
        }
    }
}
