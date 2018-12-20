package by.bntu.fitr.minigame.menu.elements;

import by.bntu.fitr.minigame.menu.*;

public class MainSubMenus extends AbstractElements<SubMenu> {
    {
        elem.put("Battle menu", new BattleMenu());
        elem.put("Add units", new RaiseUnitsMenu());
        elem.put("Output unions", new OutputMenu());
        elem.put("Exit", new ExitMenu());
    }
}
