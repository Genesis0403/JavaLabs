package by.bntu.fitr.dop.model;

import java.util.Random;

public class RowGenerator {
    private Random random = new Random();

    public int generate(int left, int right){
        return random.nextInt(right) + left;
    }

}