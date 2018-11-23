package by.bntu.fitr.numbers;

public class InnerNumberEquals {

    public boolean equals(int number) {
        int inner = number % 10;
        while ((number /= 10) % 10 != 0) {
            if (number % 10 != inner) {
                return false;
            }
        }
        return true;
    }
}
