package by.bntu.fitr.minigame.domain;

public enum Weapon {
    AXE(400), BOW(327), SWORD(330), STAFF(315), DAGGER(320);

    private int damage;

    Weapon(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
}
