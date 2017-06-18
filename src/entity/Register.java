package entity;

import java.util.LinkedList;
import java.util.Queue;


public class Register implements Runnable {

    private final Cashier cashier;
    private final OutOfLengthRegistersString outOfLengthRegistersString;
    private final Queue<Customer> queue = new LinkedList<>();

    public Register(Cashier cashier, OutOfLengthRegistersString outOfLengthRegistersString) {
        this.cashier = cashier;
        this.outOfLengthRegistersString = outOfLengthRegistersString;
    }



    public void newCustomer(Customer customer) {
        queue.add(customer);

    }

    public void run() {
        Customer customer;

        int totalTime = 0;
        int numberOfCustomers = 0;
        int numberOfincedence = 0;
        int lengthOfString = 5;
        int lengthOfRegistersString = lengthOfString;
        while ((customer = queue.poll()) != null) {

            totalTime += cashier.buySellOperation ();
            totalTime += customer.buySellOperation ();
            numberOfCustomers++;
            lengthOfRegistersString--;
            if(lengthOfRegistersString == 0){
                totalTime += outOfLengthRegistersString.buySellOperation ();
                System.out.println ("Cashier sad: \"oops... out of length registers string! I need some time to change it...\"");
                lengthOfRegistersString = lengthOfString;
                numberOfincedence++;
            }
        }
        System.out.println ("It was " + numberOfCustomers + " customres" + " and it tooks " + totalTime + " seconds." + " Number of incedent is " + numberOfincedence + ".");
    }


}