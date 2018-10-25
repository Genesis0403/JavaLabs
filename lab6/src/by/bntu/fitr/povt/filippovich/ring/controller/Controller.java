package by.bntu.fitr.povt.filippovich.ring.controller;

import by.bntu.fitr.povt.filippovich.ring.view.Printer;
import by.bntu.fitr.povt.filippovich.ring.model.Calculator;
import by.bntu.fitr.povt.filippovich.ring.model.Input;

public class Controller {
    public static void Execute(){
        double r1 = Input.UserInput("Input R1: ");
        double r2 = Input.UserInput("Input R2: ");
        double area = Calculator.RingArea(r1, r2);
        Printer.print("Ring area = " + area);
    }
}
