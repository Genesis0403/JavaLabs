package by.bntu.fitr.multiplication_table.controller;

import by.bntu.fitr.multiplication_table.view.Printer;

import by.bntu.fitr.multiplication_table.model.Answer;
import by.bntu.fitr.util.Input;

import java.util.Random;

public class Controller {
    private Input input = new Input();
    private Printer printer = new Printer();
    private Answer answer = new Answer();
    private Random random = new Random();
    public void execute(){
        printer.prev();
        int tasks = input.read_int();
        int result;
        for(int i = 0; i < tasks; i++){
            int a =random.nextInt(10);
            int b = random.nextInt(10);
            printer.execute(a, b);
            result = input.read_int();
            answer.equals_ans(result, a, b);
        }
        printer.result(answer.grade(tasks));
    }
}
