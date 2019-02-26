package by.bntu.fitr.minigame.domain.east;

import by.bntu.fitr.minigame.domain.Creature;
import by.bntu.fitr.minigame.domain.Role;
import by.bntu.fitr.minigame.domain.Weapon;

public class Human extends Creature {
    private Weapon weapon = Weapon.SWORD;
    private Role role = Role.WARRIOR;

    public Human(int health, int strength, int agility, int intelligence) {
        super(health, strength, agility, intelligence);
    }

    @Override
    protected int getWeaponDamage() {
        return weapon.getDamage();
    }

    @Override
    public int buff() {
        return role.getPercent() / 100 * getStrength() + role.getPercent() / 100 * getHealth();
    }

    @Override
    public String toString() {
        return "Human{" + super.toString() +
                "weapon=" + weapon +
                ", role=" + role +
                '}';
    }
}
