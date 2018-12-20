package by.bntu.fitr.korotkevich.task_4.logic;

public class NumberOperation {
    private int N;
    public NumberOperation(int N){
        this.N = N;
    }
    public int composition(){
        int answer = (N % 10) * (N % 100 / 10) * (N / 100 % 10) * (N / 1000);
        return answer;
    }
}
