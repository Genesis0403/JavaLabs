package by.bntu.fitr.numbers;

public class InnerAscendingSequence {

    public boolean isAscending(int number) {

        if (number / 10 == 0) {
            return false;
        }
        while (number / 10 != 0) {
            if (number % 10 != (number / 10) % 10 + 1) {
                return false;
            }
            number /= 10;
        }
        return true;
    }
}
