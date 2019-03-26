package by.bntu.fitr.model.entity;

public class Alcohol {
    private static final String DEFAULT_NAME = "XXXX";
    private static final int DEFAULT_PRICE = 0;
    private static final int DEFAULT_DEGREE = 0;

    private String name;
    private int price;
    private int degree;

    public Alcohol() {
        name = DEFAULT_NAME;
        price = DEFAULT_PRICE;
        degree = DEFAULT_DEGREE;
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
        if (name != null) {
            this.name = name;
        }
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price > 0) {
            this.price = price;
        }
    }

    public int getDegree() {
        return degree;
    }

    public void setDegree(int degree) {
        if (degree > 0) {
            this.degree = degree;
        }
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
