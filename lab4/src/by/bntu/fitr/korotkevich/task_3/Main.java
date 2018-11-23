package by.bntu.fitr.korotkevich.task_3;

import by.bntu.fitr.korotkevich.task_3.control.Controller;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter numbers:");
        Controller control = new Controller();
        control.execute();
    }
}
