package by.bntu.fitr.happy_tickets.controller;

import by.bntu.fitr.happy_tickets.model.LuckyTickets;
import by.bntu.fitr.happy_tickets.view.Printer;
import by.bntu.fitr.util.Input;

public class Controller {
    private Printer view = new Printer();
    private Input input = new Input();
    private LuckyTickets tickets = new LuckyTickets();

    public void execute(){
        view.prev();
        int countDigit = input.read_int();
        view.execute(tickets.countTicket(countDigit));
    }
}
