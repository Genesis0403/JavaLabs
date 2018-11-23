package by.bntu.fitr.controller;

import by.bntu.fitr.numbers.*;

public class Controller {
    private InnerAscendingSequence ascending = new InnerAscendingSequence();
    private InnerNumberEquals equals = new InnerNumberEquals();
    private InnerMaxNumber max = new InnerMaxNumber();
    private InnerNumberAmount amount = new InnerNumberAmount();
    private InnerNumberOdd odd = new InnerNumberOdd();
    private NodAndNok nodNok = new NodAndNok();
    private Palindrom palindrom = new Palindrom();
    private PrimeNumber prime = new PrimeNumber();
    private Fibonacci fib = new Fibonacci();

    public void execute() {
        int a = 55;

        System.out.println("Is ascending " + a + ":" + ascending.isAscending(a));
        System.out.println("Is inner number equals:" + equals.equals(a));
        System.out.println("Inner numbers amount:" + amount.count(a));
        a = 12321;
        System.out.println("Is palindrom(" + a + "): " + palindrom.isPalindrom(a));
        System.out.println("Max inner number(" + a + "): " + max.max(a));
        System.out.println("Is odd(" + a + "): " + odd.isOdd(a));
        System.out.println("Is prime(" + a + "): " + prime.isPrime(a));
        int b = 12;
        a = 4;
        System.out.println("Nod(" + a + ", " + b + "): " + nodNok.Nod(a,b) + " Nok:" + nodNok.Nok(a, b));
        System.out.println("Fibonacci(" + a + "): " + fib.fibonacci(a));
    }
}
