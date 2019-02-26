package by.bntu.fitr.minigame.domain.east;

import by.bntu.fitr.minigame.domain.Creature;
import by.bntu.fitr.minigame.domain.Role;
import by.bntu.fitr.minigame.domain.Weapon;

public class Dwarf extends Creature {
    private Weapon weapon = Weapon.AXE;
    private Role role = Role.TANK;

    public Dwarf(int health, int strength, int agility, int intelligence) {
        super(health, strength, agility, intelligence);
    }

    @Override
    protected int getWeaponDamage() {
        return weapon.getDamage();
    }

    @Override
    public int buff() {
        return role.getPercent() / 100 * getHealth();
    }

    @Override
    public String toString() {
        return "Dwarf{" + super.toString() +
                "weapon=" + weapon +
                ", role=" + role +
                '}';
    }
}
