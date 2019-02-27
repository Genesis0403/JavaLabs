package by.bntu.fitr.povt.filippovich.lab11.model.task2;

public class ElementsSumAfterMin {
    private static int min(double[] array) {
        if (array == null) throw new IllegalStateException("Array is null");
        double min = array[0];
        int minIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static double sum(double[] array){
        double sum = 0;
        int indexMin = min(array);
        for(int i = indexMin + 1; i< array.length; i++){
            sum+=array[i];
        }
        return sum;
    }
}
