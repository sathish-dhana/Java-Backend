package com.masai.question1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {

        Students students = new Students(101, "dhana", new Address("TN", "chennai", "600012"), "abc@gmail.com", "password");

        try{
            FileOutputStream fos = new FileOutputStream("/media/ubuntupc/New Volume/Java Backend Assignments/Unit-4 day-16/src/com/masai/question1/newTxt.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(students);
            oos.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        try{
            FileInputStream fos = new FileInputStream("/media/ubuntupc/New Volume/Java Backend Assignments/Unit-4 day-16/src/com/masai/question1/newTxt.txt");
            ObjectInputStream oos = new ObjectInputStream(fos);

            Students stu1 = (Students) oos.readObject();
            System.out.println(stu1.toString());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
