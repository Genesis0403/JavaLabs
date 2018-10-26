package by.bntu.fitr.povt.korotkevich.average.model;

public class ArithmeticAverage extends Average {

    public ArithmeticAverage(double a, double b) {
        super(a, b);
    }

    @Override
    public double execute() {
        return (getA() + getB()) / 2;
    }

    @Override
    protected String info() {
        return ArithmeticAverage.class.getSimpleName();
    }
}
