package com.masai.question1;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Employee> treeSet = new TreeSet<>();
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        while(flag) {
            System.out.println("Enter employee id");
            int empid = sc.nextInt();
            System.out.println("Enter employee name");
            String empName = sc.next();
            System.out.println("Enter employee salary");
            double sal = sc.nextDouble();

            Employee emp = new Employee(empid, empName, sal);
            treeSet.add(emp);

            System.out.println("do you want to continue? (y/n)");
            String check = sc.next();
            if (check.equalsIgnoreCase("n")) {
                flag = false;
            }
        }

        for (Employee x : treeSet) {
            System.out.println("Employee id : " + x.getEmpId());
            System.out.println("Employee name : " + x.getEmpName());
            System.out.println("Employee salary : " + x.getSalary());
            System.out.println("===============================");
        }
    }
}
