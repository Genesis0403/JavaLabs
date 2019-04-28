package by.bntu.fitr.model.entity.service;

public enum Intimacy {
    SEX("Sex", 700),;

    private String name;
    private int price;

    Intimacy(String name, int price) {
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
        return "Intimacy{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
