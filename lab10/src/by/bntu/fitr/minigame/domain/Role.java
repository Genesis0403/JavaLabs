package by.bntu.fitr.minigame.domain;

public enum Role {
    WARRIOR(30), SORCERER(60), HUNTER(40), TANK(50), THIEF(25);

    private int percent;

    Role(int percent) {
        this.percent = percent;
    }

    public int getPercent() {
        return percent;
    }
}
