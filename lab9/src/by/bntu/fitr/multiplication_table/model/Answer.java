package by.bntu.fitr.multiplication_table.model;

public class Answer {
    private Multiplication multiplication = new Multiplication();
    private int mistake = 0;
    public void equals_ans(int result, int a, int b){
        if(result != multiplication.multi(a, b)){
            mistake++;
        }
    }

    private int getMistake() {
        return mistake;
    }

    public int grade(int tasks){
        return (int)((double)(tasks - getMistake())/tasks * 10);
    }
}
