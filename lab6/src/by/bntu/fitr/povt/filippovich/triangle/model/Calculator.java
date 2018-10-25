package by.bntu.fitr.povt.filippovich.triangle.model;

public class Calculator {
    public static double CalculateArea(double a, double b){
        double area = (a * b) / 2;
        return area;
    }

    public static double CalculateHypotenuse(double a, double b){
        double c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        return c;
    }

    public static  double CalculatePerimeter(double a, double b){
        double perimeter = a + b + CalculateHypotenuse(a, b);
        return perimeter;
    }
}
