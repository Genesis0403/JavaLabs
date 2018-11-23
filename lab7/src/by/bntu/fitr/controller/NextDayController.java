package by.bntu.fitr.controller;

import by.bntu.fitr.nextday.NextDaySolver;
import by.bntu.fitr.nextday.ReadDate;

public class NextDayController implements Executable {
    private ReadDate date = new ReadDate();
    private NextDaySolver solver = new NextDaySolver();

    @Override
    public void execute() {
        System.out.println("Next day solver.");
        System.out.println(solver.solve(date.read()));
    }
}
