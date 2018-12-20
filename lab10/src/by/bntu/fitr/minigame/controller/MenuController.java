package by.bntu.fitr.minigame.controller;

import by.bntu.fitr.minigame.menu.MainMenu;
import by.bntu.fitr.minigame.menu.Menu;

public class MenuController {
    private Menu menu = new MainMenu();
    public void start() {
        menu.run();
    }
}
