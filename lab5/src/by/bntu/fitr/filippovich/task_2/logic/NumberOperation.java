package by.bntu.fitr.filippovich.task_2.logic;

public class NumberOperation {
    private int N;
    public NumberOperation(int N){
        this.N = N;
    }
    public int sum(){
        int answer = N % 10 + N % 100 / 10 + N / 100 % 10 + N / 1000;
        return answer;
    }
}
