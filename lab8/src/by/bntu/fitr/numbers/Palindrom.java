package by.bntu.fitr.numbers;

public class Palindrom {

    public boolean isPalindrom(int number) {
        int copy = number;
        int temp = 0;
        while(number % 10 != 0) {
            temp = temp * 10 + number % 10;
            number /= 10;
        }
        return temp == copy;
    }
}
