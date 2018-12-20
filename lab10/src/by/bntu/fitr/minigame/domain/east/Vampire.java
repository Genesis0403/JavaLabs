package by.bntu.fitr.minigame.domain.east;

import by.bntu.fitr.minigame.domain.Creature;
import by.bntu.fitr.minigame.domain.Role;
import by.bntu.fitr.minigame.domain.Weapon;

public class Vampire extends Creature {
    private Weapon weapon = Weapon.DAGGER;
    private Role role = Role.THIEF;


    public Vampire(int health, int strength, int agility, int intelligence) {
        super(health, strength, agility, intelligence);
    }

    @Override
    protected int getWeaponDamage() {
        return weapon.getDamage();
    }

    @Override
    public int buff() {
        return (weapon.getDamage() + role.getPercent()) / 100 * getAgility() ;
    }
}
