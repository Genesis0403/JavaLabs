package by.bntu.fitr.minigame.domain.west;

import by.bntu.fitr.minigame.domain.Creature;
import by.bntu.fitr.minigame.domain.Role;
import by.bntu.fitr.minigame.domain.Weapon;

public class ForestElf extends Creature {
    private Weapon weapon = Weapon.BOW;
    private Role role = Role.HUNTER;

    public ForestElf(int health, int strength, int agility, int intelligence) {
        super(health, strength, agility, intelligence);
    }

    @Override
    protected int getWeaponDamage() {
        return weapon.getDamage();
    }

    @Override
    public int buff() {
        return role.getPercent() / 100 * getAgility();
    }

    @Override
    public String toString() {
        return "ForestElf{" + super.toString() +
                "weapon=" + weapon +
                ", role=" + role +
                '}';
    }
}
