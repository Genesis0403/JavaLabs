package by.bntu.fitr.povt.korotkevich.lab11.model.task1;

public class SumBetweenPositives {

    public static double count(double[] array) {
        if (array == null) throw new IllegalStateException("Array is null.");
        Node node = findPositives(array);
        double sum = 0;
        for (int i = node.firstIndex + 1; i < node.secondIndex; ++i) {
            sum += array[i];
        }
        return sum;
    }

    private static class Node {
        private int firstIndex;
        private int secondIndex;

        public Node(int firstIndex, int secondIndex) {
            this.firstIndex = firstIndex;
            this.secondIndex = secondIndex;
        }
    }

    private static Node findPositives(double[] array) {
        int first = 0, second = 0, count = 0;
        for (int i = 0; i < array.length && count < 2; i++) {
            if (array[i] > 0) {
                if (count == 0) first = i;
                else second = i;
                ++count;
            }
        }
        return new Node(first, second);
    }
}
