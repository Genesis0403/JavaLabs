package by.bntu.fitr.minigame.domain;

public enum Role {
    WARRIOR(150), SORCERER(300), THIEF(150), TANK(300),
    HUNTER(150);

    private int percent;

    Role(int percent) {
        this.percent = percent;
    }

    public int getPercent() {
        return percent;
    }
}
