package com.StrategyP9attern;

public class Travel {
    final Vehicle vehicle;

    public Travel(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void startTrip() {
        vehicle.Drive();
    }
}
