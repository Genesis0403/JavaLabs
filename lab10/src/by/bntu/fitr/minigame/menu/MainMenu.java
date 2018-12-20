package by.bntu.fitr.minigame.menu;

import by.bntu.fitr.minigame.menu.elements.MainSubMenus;
import by.bntu.fitr.minigame.view.ElementsPrinter;

import java.util.List;
import java.util.Scanner;

public class MainMenu implements Menu {
    private MainSubMenus menus = new MainSubMenus();
    private ElementsPrinter printer = new ElementsPrinter();
    private InputChecker checker = new InputChecker();
    private Scanner sc = new Scanner(System.in);

    @Override
    public void run() {
        List<String> options = menus.getKeys();
        printer.print(options);

        boolean isDone = false;
        while (!isDone) {
            try {
                System.out.println("Your choice:");
                String userInput = sc.next();
                checker.checkChoice(menus.getKeys().size(), userInput);
                menus.getValue(Integer.parseInt(userInput)).run(this);
                isDone = true;
            } catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
