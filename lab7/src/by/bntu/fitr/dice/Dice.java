package by.bntu.fitr.dice;

import java.util.Random;

public class Dice {
    private Random dice = new Random();
    private int number = 1;

    public Dice roll() {
        number = dice.nextInt(6) + 1;
        return this;
    }

    public int number() {
        return number;
    }

    @Override
    public String toString() {
        return "Dice{" +
                "number=" + number +
                '}';
    }
}
