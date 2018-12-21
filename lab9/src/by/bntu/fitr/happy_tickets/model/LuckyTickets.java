package by.bntu.fitr.happy_tickets.model;

public class LuckyTickets {
    private int getSum(int num){
        int innerSum = 0;
        while (num % 10 != 0){
            innerSum += num % 10;
            num/=10;
        }
        return innerSum;
    }

    public int countTicket(int countDigit){
        int counter = 0;
        int x = countDigit/2;
        for (int i = 0; i< Math.pow(10, countDigit);i++){
            int part1 = i % (int)Math.pow(10, x);
            int part2 = i / (int)Math.pow(10, x);
            if (getSum(part1) == getSum(part2)){
                counter++;
            }
        }
        return counter;
    }
}
