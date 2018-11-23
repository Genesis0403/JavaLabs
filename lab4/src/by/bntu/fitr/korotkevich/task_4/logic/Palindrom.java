package by.bntu.fitr.korotkevich.task_4.logic;

public class Palindrom {
    private int n;

    public Palindrom(int n){
        this.n = n;
    }

    public boolean execute(){
        boolean answer = n / 1000 == n % 10 && n / 100 % 10 == n % 100 / 10;
        return  answer;
    }
}
