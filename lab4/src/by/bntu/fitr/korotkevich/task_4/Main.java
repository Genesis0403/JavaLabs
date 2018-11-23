package by.bntu.fitr.korotkevich.task_4;

import by.bntu.fitr.korotkevich.task_4.control.Controller;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter number:");
        Controller control = new Controller();
        control.execute();
    }
}
