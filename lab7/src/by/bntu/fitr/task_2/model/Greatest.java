package by.bntu.fitr.task_2.model;

public class Greatest {
    private int a, b, c;

    public Greatest(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int greatestNumber(){
        int greatest;
        if(a >= b && a >= c ) {
            greatest = a;
        }
        else if(b > a && b >= c){
            greatest = b;
        }
        else {
            greatest = c;
        }
        return  greatest;
    }
}
