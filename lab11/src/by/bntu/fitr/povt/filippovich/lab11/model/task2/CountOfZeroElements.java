package by.bntu.fitr.povt.filippovich.lab11.model.task2;

public class CountOfZeroElements {
    public static int count(double[] array){
        int counter = 0;
        for(double element : array){
            if(element == 0){
                ++counter;
            }
        }
        return counter;
    }
}
