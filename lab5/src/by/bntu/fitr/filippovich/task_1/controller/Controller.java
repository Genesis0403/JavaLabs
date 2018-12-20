package by.bntu.fitr.filippovich.task_1.controller;

import by.bntu.fitr.filippovich.task_1.logic.NumberOperation;
import by.bntu.fitr.filippovich.task_1.logic.UserInput;
import by.bntu.fitr.filippovich.task_1.view.Output;

public class Controller {
    private UserInput read = new UserInput();
    private Output view = new Output();
    public void execute(){
        NumberOperation result = read.execute();
        view.execute(result.reverse());
    }
}
