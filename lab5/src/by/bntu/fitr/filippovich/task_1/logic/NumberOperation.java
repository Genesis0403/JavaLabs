package by.bntu.fitr.filippovich.task_1.logic;

public class NumberOperation {
    private int N;
    public NumberOperation(int N){
        this.N = N;
    }
    public int reverse(){
        int answer = N % 10 *1000 + N % 100 / 10 * 100 + N / 100 % 10 * 10 + N / 1000;
        return answer;
    }
}
