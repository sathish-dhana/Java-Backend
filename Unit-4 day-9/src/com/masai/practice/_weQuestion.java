package com.masai.practice;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class _weQuestion {
    public static void main(String[] args) {
        System.out.println("Please enter DOB in dd-MM-yyyy format");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();


        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate ld = LocalDate.parse(str, df);
        LocalDate cd = LocalDate.now();
        Period pd = Period.between(ld, cd);
        System.out.println(pd.getYears());

        if (pd.getYears() > 18) {
            System.out.println("you are elligible");
        } else {
            System.out.println("please enter in valid pattern");
        }
    }
}
