package by.bntu.fitr.povt.korotkevich.average.view;

import by.bntu.fitr.povt.korotkevich.average.model.Average;
import by.bntu.fitr.povt.korotkevich.average.model.Executer;

public class OutputableAverage {

    public void execute(Average average) {
        System.out.println(average + " = " + average.execute());
    }

}
