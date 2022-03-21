package com.masai.question1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.zip.DataFormatException;

public class Main {

    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your DOB in dd/MM/yyyy");
        String udob = sc.next();

        try {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            LocalDate cur = LocalDate.now();

            LocalDate fDate = LocalDate.parse(udob, dtf);

            Period p = Period.between(fDate, cur);
            if (p.getYears() < 0) {
                System.out.println("Date of birth should not be in future");
            } else {
                System.out.println("You are " + p.getYears() + " old now");
            }
        } catch (Exception se) {
            System.out.println("please pass the date in the proper format");
        }


    }
}
