package com.masai.practice;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterClass {
    public static void main(String[] args) throws FileNotFoundException {

        PrintWriter pw = new PrintWriter("/media/ubuntupc/New Volume/Java Backend Assignments/practiceFile/abc.txt");

        pw.println("this is system.out.print");
        pw.println(100);
        pw.flush();
        pw.close();
    }
}
