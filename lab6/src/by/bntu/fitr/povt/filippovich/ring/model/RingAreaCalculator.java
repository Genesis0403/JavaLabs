package by.bntu.fitr.povt.filippovich.ring.model;

public class RingAreaCalculator {
   private double radius1;
   private double radius2;

    public RingAreaCalculator(double radius1, double radius2) {
        this.radius1 = radius1;
        this.radius2 = radius2;
    }

    private double circleArea(double r){
        return Math.PI * Math.pow(r,2);
    }
    public double area(){
        return circleArea(radius1) - circleArea(radius2);
    }
}
