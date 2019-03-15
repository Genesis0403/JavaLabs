package by.bntu.fitr.minigame.menu;

import by.bntu.fitr.minigame.domain.Creature;
import by.bntu.fitr.minigame.domain.east.WestUnion;
import by.bntu.fitr.minigame.domain.west.EastUnion;

public class OutputMenu implements SubMenu {

    @Override
    public void run(Menu root) {
        System.out.println("EAST UNION:");
        EastUnion.getInstance().getUnion().forEach((k, v) -> System.out.print(groupString(k,v)));
        System.out.println("\nWEST UNION:");
        WestUnion.getInstance().getUnion().forEach((k, v) -> System.out.print(groupString(k,v)));
        root.run();
    }

    private String groupString(Creature cr, int amount) {
        return String.format("%s, %10s %s%n",cr, "units:", amount);
    }
}
