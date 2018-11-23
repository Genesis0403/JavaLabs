package by.bntu.fitr.controller;

import java.util.ArrayList;
import java.util.List;

public class Controller implements Executable {
    private List<Executable> controllers = new ArrayList<>();
    {
        controllers.add(new DiceController());
        controllers.add(new VowelController());
        controllers.add(new NextDayController());
    }

    @Override
    public void execute() {
        for (Executable task : controllers) {
            task.execute();
        }
    }
}
