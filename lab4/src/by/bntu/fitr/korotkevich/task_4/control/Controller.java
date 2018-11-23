package by.bntu.fitr.korotkevich.task_4.control;

import  by.bntu.fitr.korotkevich.task_4.view.OutputResult;
import by.bntu.fitr.korotkevich.task_4.logic.Palindrom;
import by.bntu.fitr.korotkevich.task_4.logic.UserInput;

public class Controller {
    private UserInput read = new UserInput();
    private OutputResult result = new OutputResult();
    public void execute(){
        Palindrom palindrom = read.execute();
        result.execute(palindrom.execute());
    }
}
