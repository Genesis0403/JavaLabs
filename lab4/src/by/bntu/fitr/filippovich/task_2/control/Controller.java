package by.bntu.fitr.filippovich.task_2.control;

import by.bntu.fitr.filippovich.task_2.logic.Numbers;
import  by.bntu.fitr.filippovich.task_2.logic.UserInput;
import by.bntu.fitr.filippovich.task_2.view.OutputResult;

public class Controller {
    private UserInput read = new UserInput();
    private OutputResult view = new OutputResult();
    public void execute(){
        Numbers result = read.execute();
        view.execute(result.solve());
    }
}
