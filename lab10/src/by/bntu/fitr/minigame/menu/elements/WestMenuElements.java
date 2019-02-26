package by.bntu.fitr.minigame.menu.elements;

import by.bntu.fitr.minigame.domain.east.Dwarf;
import by.bntu.fitr.minigame.domain.east.EastUnion;
import by.bntu.fitr.minigame.domain.east.ForestElf;
import by.bntu.fitr.minigame.domain.east.Human;
import by.bntu.fitr.minigame.menu.AddMenu;
import by.bntu.fitr.minigame.menu.SubMenu;

public class WestMenuElements extends AbstractElements<SubMenu> {
    {
        elem.put("Add humans", new AddMenu(EastUnion.getInstance(), Human.class));
        elem.put("Add forest elfes", new AddMenu(EastUnion.getInstance(), ForestElf.class));
        elem.put("Add dwarfs", new AddMenu(EastUnion.getInstance(), Dwarf.class));
    }
}
