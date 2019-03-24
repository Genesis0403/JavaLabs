package by.bntu.fitr.model.entity;

public class Alcohol {
    private String name;
    private int price;
    private int degree;

    public Alcohol() {

    }

    public Alcohol(String name, int price, int degree) {
        this.name = name;
        this.price = price;
        this.degree = degree;
    }

    public Alcohol(Alcohol alcohol) {
        name = alcohol.name;
        price = alcohol.price;
        degree = alcohol.degree;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDegree() {
        return degree;
    }

    public void setDegree(int degree) {
        this.degree = degree;
    }

    @Override
    public String toString() {
        return "Alcohol{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", degree=" + degree +
                '}';
    }
}
