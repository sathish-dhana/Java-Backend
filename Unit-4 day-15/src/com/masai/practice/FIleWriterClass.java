package com.masai.practice;

import java.io.File;
import java.io.FileWriter;

public class FIleWriterClass {
    public static void main(String[] args) throws Exception {

        FileWriter fw = new FileWriter("/media/ubuntupc/New Volume/Java Backend Assignments/practiceFile/abc.txt");

        fw.write("hai iam dhanaseakr");
        fw.append("\n hello dhanasekar");
        fw.flush();
        fw.close();
    }
}
