package by.bntu.fitr.minigame.menu;

import by.bntu.fitr.minigame.domain.west.WestUnion;
import by.bntu.fitr.minigame.domain.east.EastUnion;

public class OutputMenu implements SubMenu {

    @Override
    public void run(Menu root) {
        System.out.println("EAST UNION:\n");
        EastUnion.getInstance().getUnion().forEach((k, v) -> System.out.println(k + ",\t\t units:" + v));
        System.out.println("\nWEST UNION:\n");
        WestUnion.getInstance().getUnion().forEach((k, v) -> System.out.println(k + ",\t\t units:" + v));
        root.run();
    }
}
