package by.bntu.fitr.task_3.controller;

import by.bntu.fitr.task_3.view.Output;
import by.bntu.fitr.task_3.model.Mood;

public class Controller {
    private  Output output = new Output();

    public  void execute(){
        Mood mood = new Mood();
        output.execute(mood.execute());
    }
}
