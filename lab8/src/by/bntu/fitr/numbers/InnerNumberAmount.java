package by.bntu.fitr.numbers;

public class InnerNumberAmount {

    public int count(int number) {
        int counter = 0;
        while ((number /= 10) % 10 != 0) {
            counter++;
        }
        return counter;
    }
}
