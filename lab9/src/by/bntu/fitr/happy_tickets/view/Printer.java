package by.bntu.fitr.happy_tickets.view;

public class Printer {
    public void execute(int counterDigit){
        System.out.println("Count of happy tickets: " + counterDigit);
    }
    public void prev(){
        System.out.println("*** Counting Happy Tickets *** ");
        System.out.print("Input count of digit in bus ticket number: ");
    }
}
