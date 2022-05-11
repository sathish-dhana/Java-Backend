package com.company;

public class Bike extends Vehicle{
    @Override
    public int Run() {
        System.out.println("Bike");
        return 1;
    }
    public void park() {
        System.out.println("park");
    }


}
