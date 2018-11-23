package by.bntu.fitr.task_1.controller;

import  by.bntu.fitr.task_1.model.Dragon;
import  by.bntu.fitr.task_1.model.UserInput;
import  by.bntu.fitr.task_1.view.Output;

public class Controller {
    UserInput read = new UserInput();
    Output view = new Output();
    public void execute(){
        System.out.println("Enter dragon age:");
        Dragon dragon = read.execute();
        view.execute(dragon.dragonHeads(), dragon.dragonEyes());
    }

}
