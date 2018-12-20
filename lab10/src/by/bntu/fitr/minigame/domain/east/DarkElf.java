package by.bntu.fitr.minigame.domain.east;

import by.bntu.fitr.minigame.domain.Creature;
import by.bntu.fitr.minigame.domain.Role;
import by.bntu.fitr.minigame.domain.Weapon;

public class DarkElf extends Creature {
    private Weapon weapon = Weapon.STAFF;
    private Role role = Role.SORCERER;

    public DarkElf(int health, int strength, int agility, int intelligence) {
        super(health, strength, agility, intelligence);
    }

    @Override
    protected int getWeaponDamage() {
        return weapon.getDamage();
    }

    @Override
    public int buff() {
        return (role.getPercent() + weapon.getDamage()) / 100 * getIntelligence();
    }
}
