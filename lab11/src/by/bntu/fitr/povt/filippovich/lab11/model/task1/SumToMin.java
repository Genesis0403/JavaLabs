package by.bntu.fitr.povt.filippovich.lab11.model.task1;

public class SumToMin {

    private static int min(double[] array){
        if (array == null) throw new IllegalStateException("Array is null");
        double min = array[0];
        int minIndex = 0;
        for(int i = 0; i< array.length;i++){
            if (min>array[i]){
                min = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static double count(double[] array){
        double sum = 0;
        for (int i = 0; i < min(array); i++){
            sum+=array[i];
        }
        return sum;
    }
}
