package by.bntu.fitr.minigame.menu;

import by.bntu.fitr.minigame.domain.BattleGround;
import by.bntu.fitr.minigame.domain.Creature;
import by.bntu.fitr.minigame.domain.Union;
import by.bntu.fitr.minigame.domain.east.WestUnion;
import by.bntu.fitr.minigame.domain.west.EastUnion;
import by.bntu.fitr.minigame.view.GroupView;

import java.util.Map;
import java.util.Random;

public class BattleMenu implements SubMenu {
    private BattleGround battleGround = new BattleGround();
    private Random random = new Random();
    private Union east = EastUnion.getInstance();
    private Union west = WestUnion.getInstance();
    private GroupView view = new GroupView();

    @Override
    public void run(Menu root) {
        int attackersDice = random.nextInt(east.getArmySize());
        int defendersDice = random.nextInt(west.getArmySize());
        Map.Entry<Creature, Integer> eastUnit = east.get(attackersDice);
        Map.Entry<Creature, Integer> westUnit = west.get(defendersDice);

        System.out.println("Units before battle:\n");
        view.show(eastUnit);
        view.show(westUnit);

        try {
            battleGround.fight(eastUnit, westUnit);
        } catch (IllegalStateException e) {
            System.err.println(e.getMessage());
        }

        System.out.println("\nUnits after battle:\n");
        view.show(eastUnit);
        view.show(westUnit);
        root.run();
    }
}
