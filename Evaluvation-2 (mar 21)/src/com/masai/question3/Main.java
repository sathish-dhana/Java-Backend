package com.masai.question3;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Employee> tree = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Enter employee id, name, address, salary");
            int id = sc.nextInt();
            String Name = sc.next();
            String address = sc.next();
            double sal = sc.nextDouble();

            Employee emp = new Employee(id, Name, address, sal);
            tree.add(emp);

            System.out.println("do you want to continue? (y/n)");

            String check = sc.next();
            if (check.equalsIgnoreCase("n")) {
                break;
            }
        }

        for (Employee x : tree) {
            System.out.println(x.toString());
        }
    }
}
