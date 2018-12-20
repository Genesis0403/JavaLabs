package by.bntu.fitr.minigame.domain;

abstract public class Creature implements Buff {
    private int health;
    private int strength;
    private int agility;
    private int intelligence;

    public Creature(int health, int strength, int agility, int intelligence) {
        this.health = health;
        this.strength = strength;
        this.agility = agility;
        this.intelligence = intelligence;
    }

    abstract protected int getWeaponDamage();

    public int dealDamage() {
        return buff() + getWeaponDamage();
    }

    public int getHealth() {
        return health;
    }

    public int getStrength() {
        return strength;
    }

    public int getAgility() {
        return agility;
    }

    public int getIntelligence() {
        return intelligence;
    }

    @Override
    public String toString() {
        return "health=" + health +
                ", strength=" + strength +
                ", agility=" + agility +
                ", intelligence=" + intelligence + ",";
    }
}
