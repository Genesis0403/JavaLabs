package by.bntu.fitr.povt.korotkevich.average.model;

public abstract class Average implements Executer {
    private double a;
    private double b;

    protected abstract String info();

    public Average(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    @Override
    public String toString() {
        return info();
    }
}
