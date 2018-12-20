package by.bntu.fitr.minigame.menu;

import by.bntu.fitr.minigame.domain.Union;

import java.util.Scanner;

public class AddMenu implements SubMenu {
    private Class unit;
    private Union union;
    private InputChecker checker = new InputChecker();
    private Scanner sc = new Scanner(System.in);

    public AddMenu(Union union, Class unit) {
        this.unit = unit;
        this.union = union;
    }

    @Override
    public void run(Menu root) {
        boolean isDone = false;
        while (!isDone) {
            try {
                System.out.println("Input amount of units:");
                String userInput = sc.next();
                checker.notMinus(userInput);
                union.add(unit, Integer.parseInt(userInput));
                isDone = true;
            } catch (IllegalArgumentException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}


