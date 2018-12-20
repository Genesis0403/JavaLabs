package by.bntu.fitr.calculator.model;

public class Choice {
    private final char sign_of_plus = '+';
    private final char sign_of_minus = '-';
    private final char sign_of_division = '/';
    private final char sign_of_multiplication = '*';
    private final char sign_of_division_ost = '%';
    public double execute(char sign, double a, double b){
        double result;
        switch(sign){
            case sign_of_plus: result = Calculator.add(a, b); break;
            case sign_of_minus: result = Calculator.sub(a, b); break;
            case sign_of_multiplication: result = Calculator.mul(a, b); break;
            case sign_of_division: result = Calculator.div(a, b); break;
            case sign_of_division_ost: result = Calculator.div_ost(a, b); break;
            default:
                result = 0; break;
        }
        return result;
    }
}
