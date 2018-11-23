package by.bntu.fitr.task_2.controller;

import by.bntu.fitr.task_2.model.Greatest;
import  by.bntu.fitr.task_2.model.UserInput;
import by.bntu.fitr.task_2.view.Output;

public class Controller {
    private Output view = new Output();
    private UserInput read = new UserInput();
    public void execute(){
        System.out.println("Enter numbers:");
        Greatest number = read.execute();
        view.execute(number.greatestNumber());
    }
}
