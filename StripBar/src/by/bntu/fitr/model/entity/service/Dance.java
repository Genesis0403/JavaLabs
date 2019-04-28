package by.bntu.fitr.model.entity.service;

public enum Dance {
    BELLYDANCE("Belly dance", 100),
    EASTDANCE("East dance", 200),
    LAPDANCE("Lap dance", 300),
    STRIPTEASE("Striptease", 500),
    DANCEWITHACHAIR("Dance with a chair", 200),;

    private String name;
    private int price;

    Dance(String name, int price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Dance{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
