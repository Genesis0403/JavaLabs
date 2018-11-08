package by.bntu.fitr.filippovich.task_1.logic;

public class NumberDifferent {
    private double a, b ,c;
    public NumberDifferent(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public boolean solve(){
        boolean answer = a != b && b != c && c != a;
        return answer;
    }
}
