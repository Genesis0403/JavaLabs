package by.bntu.fitr.povt.filippovich.ring.model;

public class Calculator {
    private static double CircleArea(double r){
        double area = Math.PI * Math.pow(r,2);
        return area;
    }
    public double RingArea(double r1, double r2){
        double areaRing = CircleArea(r1) - CircleArea(r2);
        return areaRing;
    }
}
