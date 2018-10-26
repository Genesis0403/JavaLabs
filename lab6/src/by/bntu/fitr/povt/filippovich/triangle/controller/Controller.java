package by.bntu.fitr.povt.filippovich.triangle.controller;

import by.bntu.fitr.povt.filippovich.triangle.view.Printer;
import by.bntu.fitr.povt.filippovich.triangle.model.Calculator;
import by.bntu.fitr.povt.filippovich.triangle.model.Input;

public class Controller {
    public void Execute() {
        Input input = new Input();
        Calculator calc = new Calculator();
        Printer pr = new Printer();
        double a = input.UserInput("Input a: ");
        double b = input.UserInput("Input b: ");
        double s = calc.CalculateArea(a, b);
        double p = calc.CalculatePerimeter(a, b);
        double c = calc.CalculateHypotenuse(a, b);

        pr.print("Triangle with a = " + a + " b = " + b + " :");
        pr.print("S = " + s);
        pr.print("P = " + p);
        pr.print("C = " + c);
    }
}
