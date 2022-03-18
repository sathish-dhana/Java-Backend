package com.masai.question2;

import com.masai.question1.Employee;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main  {
    public static void main(String[] args) {

        PriceComparator pc = new PriceComparator();
        TreeSet<Product> treeSet = new TreeSet<>(pc);

        treeSet.add(new Product(101, "table", 500.00));
        treeSet.add(new Product(102, "table1", 400.00));
        treeSet.add(new Product(103, "table2", 600.00));
        treeSet.add(new Product(104, "table3", 200.00));


//        boolean flag = true;
//        Scanner sc = new Scanner(System.in);
//        while(flag) {
//            System.out.println("Enter product id");
//            int proid = sc.nextInt();
//            System.out.println("Enter product name");
//            String proName = sc.next();
//            System.out.println("Enter product price");
//            double price = sc.nextDouble();
//
//            System.out.println(treeSet.add(new Product(proid, proName, price)));
//
//            System.out.println("do you want to continue? (y/n)");
//            String check = sc.next();
//            if (check.equalsIgnoreCase("n")) {
//                flag = false;
//            }
//        }


        System.out.println(treeSet.size());
        for (Product x : treeSet) {
            System.out.println("Employee id : " + x.getProductId());
            System.out.println("Employee name : " + x.getProductName());
            System.out.println("Employee salary : " + x.getProductPrice());
            System.out.println("===============================");
        }
    }
}
