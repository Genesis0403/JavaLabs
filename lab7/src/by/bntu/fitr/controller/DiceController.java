package by.bntu.fitr.controller;

import by.bntu.fitr.dice.Dice;

public class DiceController implements Executable {
    private Dice dice1 = new Dice();
    private Dice dice2 = new Dice();

    @Override
    public void execute() {
        System.out.printf("***Dice simulator***\n%s\n%s\nSum: %d\n", dice1.roll(), dice2.roll(),
                (dice1.number() + dice2.number()));
    }
}
