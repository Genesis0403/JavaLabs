package by.bntu.fitr.povt.korotkevich.lab11.model.task1;

public class MaximumFinder {

    public static double max(double[] array) {
        if (array == null) throw new IllegalStateException("Array is null");
        double max = array[0];
        for (double el : array) {
            if (Double.compare(max, el) < 0) max = el;
        }
        return max;
    }
}
