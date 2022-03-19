package com.masai.question2;

import com.masai.question1.Employee;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriceComparator pc = new PriceComparator();
        IdComparator ic = new IdComparator();
        NameComparator nc = new NameComparator();
        System.out.println("Enter (1 - price sort), (2 - product sort) (3 - id sort)");
        int choice = sc.nextInt();
        TreeSet<Product> treeSet;
        if (choice == 1) {
            treeSet = new TreeSet<>(pc);
        } else if (choice == 2) {
            treeSet = new TreeSet<>(nc);
        } else {
            treeSet = new TreeSet<>(ic);
        }

        boolean flag = true;

        while(flag) {
            System.out.println("Enter product id");
            int proid = sc.nextInt();

            System.out.println("Enter product name");
            String proName = sc.next();

            System.out.println("Enter product price");
            double price = sc.nextDouble();

            treeSet.add(new Product(proid, proName, price));

            System.out.println("do you want to continue? (y/n)");
            String check = sc.next();
            if (check.equalsIgnoreCase("n")) {
                flag = false;
            }
        }


        System.out.println(treeSet.size());
        for (Product x : treeSet) {
            System.out.println("Employee id : " + x.getProductId());
            System.out.println("Employee name : " + x.getProductName());
            System.out.println("Employee salary : " + x.getProductPrice());
            System.out.println("===============================");
        }
    }
}
