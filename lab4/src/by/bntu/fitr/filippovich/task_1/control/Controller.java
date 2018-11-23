package by.bntu.fitr.filippovich.task_1.control;

import by.bntu.fitr.filippovich.task_1.logic.NumberDifferent;
import  by.bntu.fitr.filippovich.task_1.logic.UserInput;
import by.bntu.fitr.filippovich.task_1.view.OutputResult;

public class Controller {
    private UserInput read = new UserInput();
    private OutputResult view = new OutputResult();
    public void execute(){
        NumberDifferent numbers = read.execute();
        view.execute(numbers.solve());
    }
}
