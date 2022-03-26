package com.masai.practice;

import java.io.*;

public class BufferedWriterClass {

    public static void main(String[] args) throws IOException {

        FileReader f = new FileReader("/media/ubuntupc/New Volume/Java Backend Assignments/practiceFile/abc.txt");

//        BufferedWriter bw = new BufferedWriter(f);
//
//        bw.write("hai hello");
//        bw.newLine();
//        bw.write("iam goig to make a new line");
//        bw.flush();
//        bw.close();

        BufferedReader br = new BufferedReader(f);

        String line = br.readLine();

        while(line != null) {
            System.out.println(line);
            line = br.readLine();
        }
    }
}
