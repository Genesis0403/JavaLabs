package by.bntu.fitr.povt.korotkevich.distance.controller;

import by.bntu.fitr.povt.korotkevich.distance.model.DistanceCounter;
import by.bntu.fitr.povt.korotkevich.distance.model.ReadableConsole;
import by.bntu.fitr.povt.korotkevich.distance.view.OutputableDistance;

public class Controller {
    private ReadableConsole read = new ReadableConsole();
    private OutputableDistance output = new OutputableDistance();

    public void execute() {
        DistanceCounter counter = read.execute();
        output.execute(counter.execute());
    }
}
