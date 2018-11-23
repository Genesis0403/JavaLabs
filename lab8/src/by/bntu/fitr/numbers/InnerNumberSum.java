package by.bntu.fitr.numbers;

public class InnerNumberSum {

    public int count(int number) {
        int sum = number % 10;
        while ((number /= 10) % 10 != 0) {
            sum += number % 10;
        }
        return sum;
    }
}
