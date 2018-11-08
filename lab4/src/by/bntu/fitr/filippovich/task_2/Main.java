package by.bntu.fitr.filippovich.task_2;

import by.bntu.fitr.filippovich.task_2.control.Controller;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter numbers:");
        Controller control = new Controller();
        control.execute();
    }
}
