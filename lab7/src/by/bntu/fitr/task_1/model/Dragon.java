package by.bntu.fitr.task_1.model;

public class Dragon {
    private static final int FIRST_PERIOD = 200;
    private  static final int SECOND_PERIOD = 300;
    private int age;

    public Dragon(int age){
        this.age = age;
    }

    public int dragonHeads(){
        int heads;
        if(age>0 && age<FIRST_PERIOD){
            heads = 3 + age*3;
        }
        else if(age<SECOND_PERIOD){
            heads = 3 + FIRST_PERIOD * 3 - FIRST_PERIOD * 2 + age * 2;
        }
        else{
            heads = 3 + FIRST_PERIOD * 3 + (SECOND_PERIOD - FIRST_PERIOD) * 2 + age;
        }
        return heads;
    }

    public int dragonEyes(){
        return dragonHeads() * 2;
    }
}
