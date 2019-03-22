package by.bntu.fitr.model.entity;

import java.util.Arrays;

public class Dancer {
    private String name;
    private int age;
    private String[] service;
    private int price;
    private String sex;

    public Dancer(String name, int age, String[] service, int price) {
        this.name = name;
        this.age = age;
        this.service = service;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 18)
            this.age = age;
    }

    public String[] getService() {
        return service;
    }

    public void setService(String[] service) {
        this.service = service;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price >= 0)
            this.price = price;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Dancer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", service=" + (service == null ? null : Arrays.asList(service)) +
                ", price=" + price +
                ", sex='" + sex + '\'' +
                '}';
    }
}
