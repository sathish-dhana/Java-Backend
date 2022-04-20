package com.StrategyP9attern;

public class Main {
    public static void main(String[] args) {

        Travel trip1 = new Travel(new Bike());
        trip1.startTrip();
        Travel trip2 = new Travel(new Car());
        trip2.startTrip();
    }
}
