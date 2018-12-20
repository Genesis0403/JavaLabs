package by.bntu.fitr.korotkevich.task_4.controller;

import by.bntu.fitr.korotkevich.task_4.logic.NumberOperation;
import by.bntu.fitr.korotkevich.task_4.logic.UserInput;
import by.bntu.fitr.korotkevich.task_4.view.Output;

public class Controller {
    private UserInput read = new UserInput();
    private Output view = new Output();
    public void execute(){
        NumberOperation result = read.execute();
        view.execute(result.composition());
    }
}
