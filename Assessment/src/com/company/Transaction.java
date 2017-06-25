package com.company;
/**
 * Created by Andrew on 23/06/2017.
 */
public class Transaction {
    private double totalPrice;
    private double wednesdayDiscount = 2.00;
    private double moneySaved;
    private int numtickets;
    /**
     * Calls Calender() to check if day is Wednesday for valid discount.
     * If Calender() returns true then calculates discount and money saved.
     * Prints out Message for appropriate sale, which includes money saved, discount, total amd number of tickets bought
     */
    protected Transaction(double totalPrice, int numTickets) {
        this.totalPrice = totalPrice;
        this.numtickets = numTickets;

        if (new Calender().CheckDiscountValid()){
            moneySaved = wednesdayDiscount * numTickets;
        setTotalPrice(this.totalPrice -= moneySaved);
        System.out.println("You have qualified for the Wednesday discount, saving £" + wednesdayDiscount +
                " on each ticket you selected. You selected " + numTickets + " ticket(s), at a total cost of £"
                + this.getTotalPrice() + " You saved £ " + moneySaved + " \n");
        }else {
            System.out.println("Ticket selection complete, you have selected " + numTickets + " tickets, at a total cost of £" + this.getTotalPrice() + " \n");
        }
    }


    private double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

}
