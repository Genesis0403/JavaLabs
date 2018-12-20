package by.bntu.fitr.minigame.domain;

public enum Weapon {
    AXE(40), BOW(27), SWORD(30), STAFF(15), DAGGER(20);

    private int damage;

    Weapon(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
}
