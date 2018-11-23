package by.bntu.fitr.numbers;

public class NodAndNok {

    public int Nod(int a, int b) {
        while (a != 0 || b != 0) {
            if (a > b) {
                a %= b;
            } else {
                b %= a;
            }
        }
        return a + b;
    }

    public int Nok(int a, int b) {
        return a * b / Nod(a, b);
    }
}
