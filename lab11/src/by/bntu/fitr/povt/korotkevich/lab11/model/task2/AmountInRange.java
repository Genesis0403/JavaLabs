package by.bntu.fitr.povt.korotkevich.lab11.model.task2;

public class AmountInRange {

    public static int count(double[] array, double first, double second) {
        if (array == null) throw new IllegalStateException("Array is null");
        if (second < first) throw new IllegalArgumentException("Range is negative.");
        int count = 0;
        for (double el : array) {
            if (Double.compare(el, second) > 0 && Double.compare(el, second) < 0) ++count;
        }
        return count;
    }
}
