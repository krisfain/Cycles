package com.company;

public class Main {

    public static void main (String[] args) {
//        Driver driver1 = new Driver(1, "Kris");
//        Driver driver2 = new Driver(2, "Ruslan");

//        driver1.printDriver();
//        driver2.printDriver();

//        Loop.method1();
//        Loop.method2();

        Customer customer1 = new Customer(1, "John", 100);
        Customer customer2 = new Customer(2, "Nina", 200);
        Customer customer3 = new Customer(3, "Michael", 350.10);

//        customer1.printCustomer();
//        customer1.charge();
//        customer1.printCustomer();

        customer1.printCustomer();
        customer1.charge();
        customer1.printCustomer();
        customer2.printCustomer();
        customer2.charge();
        customer2.printCustomer();
        customer3.printCustomer();
        customer3.charge();
        customer3.printCustomer();




    }
}