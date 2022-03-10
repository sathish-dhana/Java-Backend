package com.day7.question3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter RollNumber : ");
        String rollNum = scan.next();

        System.out.println("Enter Student name : ");
        String name = scan.next();

        System.out.println("Enter marks : ");
        int marks = scan.nextInt();

        Student student = new Student(rollNum, name, marks);

        String printDetail = "\n*** Student Details ***\n" + "Roll Number : " + student.getRollNumber() + "\n"
                + "Student Name: " + student.getStudentName() + "\n"
                + "Roll Number : " + student.getMarks() + "\n" + "***********************";

        System.out.println(printDetail);
    }
}
