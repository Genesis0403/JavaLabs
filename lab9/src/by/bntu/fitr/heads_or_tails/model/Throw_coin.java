package by.bntu.fitr.heads_or_tails.model;

import java.util.Random;

public class Throw_coin {
    private final int count = 1000;
    private int count_heads = 0;
    private int count_tails = 0;

    private Random rand = new Random();
    public void counter(){
        for(int i = 0; i < count; i++){
            if (rand.nextBoolean()){
                count_heads++;
            }
            else{
                count_tails++;
            }
        }
    }

    public int getCount_heads() {
        return count_heads;
    }

    public int getCount_tails() {
        return count_tails;
    }
}
