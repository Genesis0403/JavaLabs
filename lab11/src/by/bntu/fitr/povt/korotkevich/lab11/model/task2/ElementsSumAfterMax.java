package by.bntu.fitr.povt.korotkevich.lab11.model.task2;

public class ElementsSumAfterMax {

    public static double count(double[] array) {
        int index = max(array);
        double sum = 0;
        for (int i = index + 1; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    private static int max(double[] array) {
        if (array == null) throw new IllegalStateException("Array is null.");
        double max = array[0];
        int maxIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (Double.compare(max, array[i]) < 0) {
                max = array[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
