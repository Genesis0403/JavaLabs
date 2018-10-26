package by.bntu.fitr.povt.korotkevich.average.model;

public class GeometricAverage extends Average {

    public GeometricAverage(double a, double b) {
        super(a, b);
    }

    @Override
    public double execute() {
        return Math.sqrt(getA() * getB());
    }

    @Override
    protected String info() {
        return GeometricAverage.class.getSimpleName();
    }
}
