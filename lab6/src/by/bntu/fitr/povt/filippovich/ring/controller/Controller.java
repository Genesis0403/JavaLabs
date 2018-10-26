package by.bntu.fitr.povt.filippovich.ring.controller;

import by.bntu.fitr.povt.filippovich.ring.view.Printer;
import by.bntu.fitr.povt.filippovich.ring.model.Calculator;
import by.bntu.fitr.povt.filippovich.ring.model.Input;

public class Controller {
    public void Execute(){
        Input input = new Input();
        Calculator calc = new Calculator();
        Printer pr = new Printer();
        double r1 = input.UserInput("Input R1: ");
        double r2 = input.UserInput("Input R2: ");
        double area = calc.RingArea(r1, r2);
        pr.print("Ring area = " + area);
    }
}
