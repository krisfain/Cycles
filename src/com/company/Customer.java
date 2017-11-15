package com.company;

public class Customer {
    public int id;
    public String name;
    public double amount;

    public Customer (int id, String name, double amount) {
        this.id = id;
        this.name = name;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getAmount() {
        return amount;
    }

    public void charge() {
        double rideAmount = 170;
        this.amount = this.amount - rideAmount;

    }
    if (this.amount =<double rideAmount) {
        System.out.println();
    }

    public void printCustomer() {
        System.out.println(this.id + " " + this.name + " " + this.amount);
        System.out.println("Charge" );

    }
}