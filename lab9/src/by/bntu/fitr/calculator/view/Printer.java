package by.bntu.fitr.calculator.view;

public class Printer {
    public void execute(char sign, double a, double b, double result){
        System.out.println(a + " " + sign + " " + b + " = " + result);
    }
    public void view_char(){
        System.out.println("Input sign:");
    }
    public void view_numbers(){
        System.out.println("Input numbers");
    }
}
