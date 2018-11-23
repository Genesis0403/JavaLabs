package by.bntu.fitr.numbers;

public class Fibonacci {

    public int fibonacci(int n) { // 0 1 1 2 3
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
