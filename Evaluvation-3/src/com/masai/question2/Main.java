package com.masai.question2;

import java.io.*;

public class Main {
    public static void main(String[] args)  {

        Employee myEmp1 = new Employee("101", "dhanasekar", new Address("TN", "chennai", "600012"), "abc@gamil.com", "password");

        try {
            FileOutputStream fos = new FileOutputStream("/media/ubuntupc/New Volume/Java Backend Assignments/Evaluvation-3/src/com/masai/question2/emp.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(myEmp1);
            oos.close();

        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            FileInputStream fos = new FileInputStream("/media/ubuntupc/New Volume/Java Backend Assignments/Evaluvation-3/src/com/masai/question2/emp.txt");
            ObjectInputStream oos = new ObjectInputStream(fos);

            Object empObject = oos.readObject();
            Employee myemp = (Employee) empObject;

            System.out.println(myemp.toString());

        } catch (Exception e) {
            System.out.println(e);
        }


    }
}
