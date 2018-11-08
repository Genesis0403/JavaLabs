package by.bntu.fitr.korotkevich.task_3.logic;

public class Numbers {
    private double a, b, c;

    public Numbers(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean solve(){
        boolean answerPositive = a > 0 || b > 0 || c > 0;
        boolean answerNegative = a < 0 || b < 0 || c < 0;
        boolean answer = answerNegative && answerPositive;
        return answer;
    }
}
