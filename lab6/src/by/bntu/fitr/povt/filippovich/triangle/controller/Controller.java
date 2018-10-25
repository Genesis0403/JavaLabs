package by.bntu.fitr.povt.filippovich.triangle.controller;

import by.bntu.fitr.povt.filippovich.triangle.view.Printer;
import by.bntu.fitr.povt.filippovich.triangle.model.Calculator;
import by.bntu.fitr.povt.filippovich.triangle.model.Input;

public class Controller {
    public static void Execute() {
        double a = Input.UserInput("Input a: ");
        double b = Input.UserInput("Input b: ");
        double s = Calculator.CalculateArea(a, b);
        double p = Calculator.CalculatePerimeter(a, b);
        double c = Calculator.CalculateHypotenuse(a, b);

        Printer.print("Triangle with a = " + a + " b = " + b + " :");
        Printer.print("S = " + s);
        Printer.print("P = " + p);
        Printer.print("C = " + c);
    }
}
