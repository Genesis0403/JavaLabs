package by.bntu.fitr.filippovich.task_2.controller;

import by.bntu.fitr.filippovich.task_2.logic.NumberOperation;
import by.bntu.fitr.filippovich.task_2.logic.UserInput;
import by.bntu.fitr.filippovich.task_2.view.Output;

public class Controller {
    private UserInput read = new UserInput();
    private Output view = new Output();
    public void execute(){
        NumberOperation result = read.execute();
        view.execute(result.sum());
    }
}
