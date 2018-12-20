package by.bntu.fitr.multiplication_table.view;

public class Printer {
    public void execute(int a, int b){
        System.out.printf("%d * %d = ", a, b);
    }
    public void result(int answer){
        System.out.println("Mark - " + answer);
    }
}
