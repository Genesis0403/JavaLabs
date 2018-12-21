package by.bntu.fitr.dop.controller;

import by.bntu.fitr.dop.model.NumberGuesser;
import by.bntu.fitr.dop.model.RowGenerator;
import by.bntu.fitr.util.Input;

public class Controller {
    private RowGenerator rowGenerator = new RowGenerator();
    private NumberGuesser numberGuesser = new NumberGuesser();
    private Input input = new Input();

    public void execute() {
        System.out.println("Input left and right:");
        int left = input.read_int();
        int right = input.read_int();
        numberGuesser.guess(rowGenerator.generate(left, right));
    }
}
