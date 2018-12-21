package by.bntu.fitr.multiplication_table.view;

public class Printer {
    public void execute(int a, int b){
        System.out.printf("%d * %d = ", a, b);
    }
    public void result(int answer){
        System.out.println("Mark - " + answer);
    }
    public void prev(){
        System.out.println("*** Checking the knowledge of the multiplication table ***");
        System.out.println(" Input the answer after the example and press <Enter>.");
        System.out.print("Choose quantity of examples: ");
    }
}
