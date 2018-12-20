package by.bntu.fitr.minigame.menu;

import by.bntu.fitr.minigame.menu.elements.AddMenuElements;
import by.bntu.fitr.minigame.menu.elements.WestMenuElements;
import by.bntu.fitr.minigame.view.ElementsPrinter;

import java.util.List;
import java.util.Scanner;

public class AddWestUnitsMenu implements SubMenu {
    private WestMenuElements menus = new WestMenuElements();
    private ElementsPrinter printer = new ElementsPrinter();
    private InputChecker checker = new InputChecker();
    private Scanner sc = new Scanner(System.in);

    @Override
    public void run(Menu root) {
        List<String> options = menus.getKeys();
        printer.print(options);

        boolean isDone = false;
        while (!isDone) {
            try {
                System.out.println("Your choice:");
                String userInput = sc.next();
                checker.checkChoice(menus.getKeys().size(), userInput);
                menus.getValue(Integer.parseInt(userInput)).run(root);
                isDone = true;
            } catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
