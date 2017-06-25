package com.company;
import java.util.Scanner;

/**
 * Created by Andrew on 23/06/2017.

 * All ticket classes in same file for ease
 */

/**
 * Ticket(Base)Class. Implements the ticket interface
 */
public class Ticket implements ITicket {
    private double price ;
    private double totalPrice =0;
    private int numTickets=0;

    protected Ticket(double price) {
        this.price = price;
        new Calender();
        }

/**
 * Standard Ticket Class
 */
public class StandardTicket extends Ticket {
    public StandardTicket() {
        super(8.00);
        System.out.println("ONE Standard Adult Ticket @ £" +
                this.getPrice()+ " has been added to your basket" + "\n");
    }

    public double getPrice() {
        return super.getPrice();
    }
}

/**
 * OAP Ticket Class
 */

public class OapTicket extends Ticket {
    public OapTicket(){
        super(6.00);
        System.out.println("ONE OAP Ticket @ £" +
                this.getPrice()+ " has been added to your basket" + "\n");
    }
    @Override
    public double getPrice() {
        return super.getPrice();
    }
}
/**
 * Student Ticket Class
 */
public class StudentTicket extends Ticket {
    public StudentTicket(){
        super(6.00);
        System.out.println("ONE Student Ticket @ £" +
                this.getPrice()+ " has been added to your basket" + "\n");
    }
    @Override
    public double getPrice() {
        return super.getPrice();
    }
}
/**
 * Child Ticket Class
 */
public class ChildTicket extends Ticket {
    public ChildTicket(){
        super(4.00);
        System.out.println("ONE Standard Child Ticket @ £" +
                this.getPrice()+ " has been added to your basket" + "\n");
    }
    @Override
    public double getPrice() {
        return super.getPrice();
    }
}

    /**
     * Simple interface. Asks users for input then scans for user input.
     */
    @Override
    public void TicketSelection() {
        int noTickets = 0;

        System.out.println("Please enter the number of tickets you would like to book ...");
        Scanner scan = new Scanner(System.in);
        int noOfTickets = scan.nextInt();
        System.out.println("****************************************************"+ "\n" +
                            "Please browse the ticket menu below..." + "\n" +
                            "Enter 1 for a Standard Ticket : £8.00"+"\n" +
                            "Enter 2 for a Student Ticket : £6.00" + "\n" +
                            "Enter 3 for a OAP Ticket : £6.00" +"\n" +
                            "Enter 4 for a Child Ticket : £4.00" +"\n"+
                            "****************************************************");


        /**
         * Switch statement iterates through until case statement matches user input.
         * When case met ticket issued, price printed, ticket counter incremented and price added to total price.
         * Once all tickets selected Transaction method called
         */
        do {
        System.out.println("Please select the number that corresponds with your ticket of choice...");
        Scanner scanner = new Scanner(System.in);
        int ticketNo = scanner.nextInt();
            noTickets++;

            switch (ticketNo) {
                case 1:
                    totalPrice+= new StandardTicket().getPrice();
                    numTickets ++;
                    continue;
                case 2:
                    totalPrice+= new StudentTicket().getPrice();
                    numTickets ++;
                    continue;
                case 3:
                    totalPrice+= new OapTicket().getPrice();
                    numTickets ++;
                    continue;
                case 4:
                    totalPrice+= new ChildTicket().getPrice();
                    numTickets ++;
            }

        } while (noTickets < noOfTickets);
        new Transaction(totalPrice,numTickets);

    }
    public double getPrice(){
        return price;
    }
}
