package by.bntu.fitr.numbers;

public class InnerNumberOdd {

    public boolean isOdd(int number) {
        boolean isOdd = number % 10 % 2 != 0;
        if (!isOdd) {
            return false;
        }
        while ((number /= 10) % 10 != 0) {
            if (number % 10 % 2 == 0) {
                isOdd = false;
                break;
            }
        }
        return isOdd;
    }
}
