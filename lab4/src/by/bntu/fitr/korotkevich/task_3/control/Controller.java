package by.bntu.fitr.korotkevich.task_3.control;

import by.bntu.fitr.korotkevich.task_3.logic.Numbers;
import by.bntu.fitr.korotkevich.task_3.logic.UserInput;
import by.bntu.fitr.korotkevich.task_3.view.OutputResult;

public class Controller {
    private UserInput read = new UserInput();
    private OutputResult view = new OutputResult();
    public void execute(){
        Numbers result = read.execute();
        view.execute(result.solve());
    }
}
