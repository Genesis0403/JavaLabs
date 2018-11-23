package by.bntu.fitr.numbers;

public class InnerMaxNumber {

    public int max(int number) {
        int max = number % 10;
        while ((number /= 10) % 10 != 0) {
            if (number % 10 > max) {
                max = number % 10;
            }
        }
        return max;
    }
}
