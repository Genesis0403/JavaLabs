package by.bntu.fitr.korotkevich.task_3.logic;

public class NumberOperation {
    private int N;
    public NumberOperation(int N){
        this.N = N;
    }
    public double arifm(){
        double answer = (N % 10 + N % 100 / 10 + N / 100 % 10 + N / 1000)/4.0;
        return answer;
    }
    public double geom(){
        double answer = Math.pow((N % 10) * (N % 100 / 10) * (N / 100 % 10) * (N / 1000), 0.25);
        return answer;
    }
}
