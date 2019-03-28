package by.bntu.fitr.model.entity;

public class Alcohol {
    private static final String DEFAULT_NAME = "XXXX";
    private static final int DEFAULT_PRICE = 0;
    private static final int DEFAULT_DEGREE = 0;

    private String name;
    private int price;
    private int degree;
    private TypeOfAlcoholEnum typeOfAlcohol;

    public Alcohol() {
        name = DEFAULT_NAME;
        price = DEFAULT_PRICE;
        degree = DEFAULT_DEGREE;
        typeOfAlcohol = TypeOfAlcoholEnum.WINE;
    }

    public Alcohol(String name, int price, int degree, TypeOfAlcoholEnum type) {
        this.name = name;
        this.price = price;
        this.degree = degree;
        typeOfAlcohol = type;
    }

    public Alcohol(Alcohol alcohol) {
        name = alcohol.name;
        price = alcohol.price;
        degree = alcohol.degree;
        typeOfAlcohol = alcohol.typeOfAlcohol;
    }

    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    public final int getPrice() {
        return price;
    }

    public final void setPrice(int price) {
        if (price > 0) {
            this.price = price;
        }
    }

    public final int getDegree() {
        return degree;
    }

    public final TypeOfAlcoholEnum getTypeOfAlcohol() {
        return typeOfAlcohol;
    }

    public final void setTypeOfAlcohol(TypeOfAlcoholEnum typeOfAlcohol) {
        this.typeOfAlcohol = typeOfAlcohol;
    }

    public final void setDegree(int degree) {
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
                ", typeOfAlcohol=" + typeOfAlcohol +
                '}';
    }
}
