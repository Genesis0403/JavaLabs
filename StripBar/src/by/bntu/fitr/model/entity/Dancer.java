package by.bntu.fitr.model.entity;

import java.util.ArrayList;
import java.util.List;

public class Dancer {
    private static final String DEFAULT_NAME = "XXXX";
    private static final int DEFAULT_AGE = 18;
    private static final int DEFAULT_PRICE = 0;
    private static final SexEnum DEFAULT_SEX = SexEnum.MALE;


    private String name;
    private int age;
    private List<String> service;
    private int price;
    private SexEnum sex;

    public Dancer() {
        name = DEFAULT_NAME;
        age = DEFAULT_AGE;
        price = DEFAULT_PRICE;
        sex = DEFAULT_SEX;
        service = new ArrayList<>();
    }

    public Dancer(String name, int age, List<String> service, int price, SexEnum sex) {
        this.name = name;
        this.age = age;
        this.service = service;
        this.price = price;
        this.sex = sex;
    }

    public Dancer(Dancer dancer) {
        age = dancer.age;
        price = dancer.price;
        name = new String(dancer.name);
        sex = dancer.sex;
        service = new ArrayList<>(dancer.service);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 18)
            this.age = age;
    }

    public List<String> getService() {
        return service;
    }

    public void setService(List<String> service) {
        if (service != null) {
            this.service = service;
        }
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price >= 0)
            this.price = price;
    }

    public SexEnum getSex() {
        return sex;
    }

    public void setSex(SexEnum sex) {
        if (sex != null) {
            this.sex = sex;
        }
    }

    @Override
    public String toString() {
        return "Dancer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", service=" + service +
                ", price=" + price +
                ", sex=" + sex +
                '}';
    }
}
