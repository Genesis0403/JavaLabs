package by.bntu.fitr.heads_or_tails.controller;

import  by.bntu.fitr.heads_or_tails.model.Throw_coin;
import by.bntu.fitr.heads_or_tails.view.Printer;

public class Controller {
    private Throw_coin throwCoin = new Throw_coin();
    private Printer view = new Printer();
    public void execute(){
        throwCoin.counter();
        view.execute(throwCoin.getCount_heads(),throwCoin.getCount_tails());
    }
}
