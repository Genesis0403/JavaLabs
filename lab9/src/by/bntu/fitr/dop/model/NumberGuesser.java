package by.bntu.fitr.dop.model;

import by.bntu.fitr.util.Input;

public class NumberGuesser {
    private Input input = new Input();

    public void guess(int number) {
        boolean flag = false;
        while (!flag) {

            System.out.println("Input number:");
            int answer = input.read_int();
            if (answer < number) {
                System.out.println("Higher");
            } else if (answer > number) {
                System.out.println("Lower");
            }else{
                flag = true;
                System.out.println("Congratulations!!!!");
            }

        }

    }

}
