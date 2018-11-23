package by.bntu.fitr.filippovich.task_1;

import  by.bntu.fitr.filippovich.task_1.control.Controller;

public class Main {
    public static void main(String[] args) {
        Controller control = new Controller();
        System.out.println("Enter Numbers:");
        control.execute();
    }
}
