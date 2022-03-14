package com.exam.question3;

import java.util.Scanner;

public class RangeNumber {
    public void print(int start, int end, int incrementValue) {
        System.out.println("Range Number : ");

        for (int i = start; i <= end; i=i+incrementValue) {
            System.out.print(i + " ");
        }

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a start value : ");
        int start = scan.nextInt();

        System.out.println("Enter a end value : ");
        int end = scan.nextInt();

        System.out.println("Enter a increment value : ");
        int incrementValue = scan.nextInt();

        if (start < end && incrementValue > 0) {
            new RangeNumber().print(start, end, incrementValue);
        } else {
            System.out.println("Error");
        }
    }
}
