package by.bntu.fitr.calculator.controller;

import by.bntu.fitr.calculator.model.Choice;
import by.bntu.fitr.calculator.view.Printer;
import by.bntu.fitr.util.Input;

import java.util.Scanner;

public class Controller {
    private Choice choice = new Choice();
    private Printer view = new Printer();
    private Input input = new Input();
    private Scanner scanner = new Scanner(System.in);
    public void execute(){
        view.view_char();
        char sign = input.read_char();
        view.view_numbers();
        double a = input.read_double();
        double b = input.read_double();
        view.execute(sign, a, b, choice.execute(sign, a, b));
    }
}
