package com.masai.question1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("start of main..");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter num1");
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        String message = null;
        try {
            num1 = sc.nextInt();
            try {
                System.out.println("Enter num2");
                num2 = sc.nextInt();
                try {
                    num3 = num1 / num2;
                    try{
                        if(num3 > 10){
                            message = "Welcome to Exception Handling ";
                        }
                        System.out.println("Message is :"+message.toUpperCase());
                    } catch (Exception ee) {
                        System.out.println("String value is null");
                    }
                } catch (ArithmeticException ae) {
                    System.out.println("num2 should not be 0");
                }
            } catch (InputMismatchException ie) {
                System.out.println("Please enter valid number");
            }
        } catch (InputMismatchException ie) {
            System.out.println("Please enter valid number");
        }

        System.out.println("end of main");
    }
}
