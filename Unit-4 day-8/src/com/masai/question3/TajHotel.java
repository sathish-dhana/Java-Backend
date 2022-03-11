package com.masai.question3;

public class TajHotel implements Hotel{
    @Override
    public void chickenBiryani() {
        System.out.println("Biryani from Taj Hotel");
    }

    @Override
    public void masalaDosa() {
        System.out.println("MasalaDosa from Taj Hotel");
    }

    public void welcomeDrink() {
        System.out.println("Welcome Drink from the TajHotel");
    }
}
