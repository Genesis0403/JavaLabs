package by.bntu.fitr.numbers;

public class InnerAscendingSequance {

    public boolean isAscending(int number) {

        while (number / 10 != 0) {
            if (number % 10 != number % 100 + 1) {
                return false;
            }
            number /= 10;
        }
        return true;
    }
}
