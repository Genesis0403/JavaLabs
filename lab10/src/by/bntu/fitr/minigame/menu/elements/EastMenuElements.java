package by.bntu.fitr.minigame.menu.elements;

import by.bntu.fitr.minigame.domain.west.Beast;
import by.bntu.fitr.minigame.domain.west.DarkElf;
import by.bntu.fitr.minigame.domain.west.Vampire;
import by.bntu.fitr.minigame.domain.west.WestUnion;
import by.bntu.fitr.minigame.menu.AddMenu;
import by.bntu.fitr.minigame.menu.SubMenu;

public class EastMenuElements extends AbstractElements<SubMenu> {
    {
        elem.put("Add beasts", new AddMenu(WestUnion.getInstance(), Beast.class));
        elem.put("Add dark elfes", new AddMenu(WestUnion.getInstance(), DarkElf.class));
        elem.put("Add vampires", new AddMenu(WestUnion.getInstance(), Vampire.class));
    }
}
