package com.company;

public class Driver {
    private int id;
    private String name;

    public Driver(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void printDriver() {
        System.out.println(this.id + " " + this.name);
    }
}
