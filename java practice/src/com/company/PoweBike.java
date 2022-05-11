package com.company;

public class PoweBike extends Bike {


    public void Run1() {
        System.out.println("SuperBike");
    }
    public void Run1(int x) {
        System.out.println("SuperBike");
    }

    public static void main(String[] args) {

        Vehicle v = new Vehicle();
        Bike b = (Bike) v;
    }
}
