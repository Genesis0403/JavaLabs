package by.bntu.fitr.minigame.menu.elements;

import by.bntu.fitr.minigame.menu.AddEastUnitsMenu;
import by.bntu.fitr.minigame.menu.AddWestUnitsMenu;
import by.bntu.fitr.minigame.menu.SubMenu;

public class AddMenuElements extends AbstractElements<SubMenu> {
    {
        elem.put("Add to East", new AddEastUnitsMenu());
        elem.put("Add to West", new AddWestUnitsMenu());
    }
}
