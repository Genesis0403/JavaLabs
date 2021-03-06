package by.bntu.fitr.povt.filippovich.ring.controller;

import by.bntu.fitr.povt.filippovich.ring.view.Printer;
import by.bntu.fitr.povt.filippovich.ring.model.RingAreaCalculator;
import by.bntu.fitr.povt.filippovich.ring.model.Input;

public class Controller {
    private Printer printer = new Printer();
    private Input input = new Input();

    public void execute(){
        RingAreaCalculator calc = input.execute();
        printer.print("Ring area = " + calc.area());
    }
}
