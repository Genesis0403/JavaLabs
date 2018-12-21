package by.bntu.fitr.season.controller;

import by.bntu.fitr.season.model.Season;
import by.bntu.fitr.util.Input;
import by.bntu.fitr.season.view.Printer;

public class Controller {
    private Printer printer = new Printer();
    private Season season = new Season();
    private Input input = new Input();

    public void execute(){
        printer.prev();
        int number_month = input.read_int();
        printer.execute(season.execute(number_month));
    }
}
