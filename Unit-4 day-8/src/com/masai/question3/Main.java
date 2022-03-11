package com.masai.question3;

import java.util.Scanner;

public class Main {
    public Hotel provideFood(int amount) {
        if (amount > 1000) {
            Hotel tajFood = new TajHotel();
            return tajFood;
        } else if (amount >= 200 && amount <= 1000) {
            Hotel RoadSideFood = new RoadSideHotel();
            return RoadSideFood;
        } else {
            return null;
        }
    }
    public static void main(String[] args) {
        Main m1 = new Main();
        Scanner scan = new Scanner(System.in);
        System.out.println("Please provide money :");
        int userMoney = scan.nextInt();
        Hotel food = m1.provideFood(userMoney);
       
        if (food instanceof RoadSideHotel) {
            Hotel RoadSideFood = new RoadSideHotel();
            RoadSideFood.chickenBiryani();
            RoadSideFood.masalaDosa();
        } else if (food instanceof TajHotel) {
            Hotel tajFood = new TajHotel();
            ((TajHotel) tajFood).welcomeDrink();
            tajFood.chickenBiryani();
            tajFood.masalaDosa();
        } else {
            System.out.println("Please Enter a valid amount.");
        }
    }
}
