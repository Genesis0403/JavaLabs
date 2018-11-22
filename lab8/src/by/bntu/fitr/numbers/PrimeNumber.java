package by.bntu.fitr.numbers;

public class PrimeNumber {

    public boolean isPrime(int number) {
        int divider = 2;
        boolean isPrime = true;
        if (number == 1) {
            return false;
        }
        while (divider * divider <= number) {
            if (number % divider == 0) {
                isPrime = false;
                break;
            }
            divider++;
        }
        return isPrime;
    }
}
