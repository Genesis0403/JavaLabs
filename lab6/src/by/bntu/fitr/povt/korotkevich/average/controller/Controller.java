package by.bntu.fitr.povt.korotkevich.average.controller;

import by.bntu.fitr.povt.korotkevich.average.model.ArithmeticAverage;
import by.bntu.fitr.povt.korotkevich.average.model.GeometricAverage;
import by.bntu.fitr.povt.korotkevich.average.model.ReadableAverage;
import by.bntu.fitr.povt.korotkevich.average.view.OutputableAverage;

public class Controller {
    private OutputableAverage output = new OutputableAverage();
    private ReadableAverage read = new ReadableAverage();

    public void execute() {
        ArithmeticAverage arithmetic = read.arithmetic();
        GeometricAverage geometric = read.geometric();

        output.execute(arithmetic);
        output.execute(geometric);
    }
}
