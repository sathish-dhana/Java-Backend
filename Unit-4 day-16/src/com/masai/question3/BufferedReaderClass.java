package com.masai.question3;

import java.io.*;

public class BufferedReaderClass {
    public static void main(String[] args) throws IOException {


        FileWriter fw = new FileWriter("/media/ubuntupc/New Volume/Java Backend Assignments/Unit-4 day-16/src/com/masai/question3/demo.txt");
        BufferedWriter bf = new BufferedWriter(fw);

        bf.write("hello hai");
        bf.flush();
        bf.close();

        FileReader fr = new FileReader("/media/ubuntupc/New Volume/Java Backend Assignments/Unit-4 day-16/src/com/masai/question3/demo.txt");
        BufferedReader br = new BufferedReader(fr);

        String str = (String) br.readLine();
        System.out.println(str);
    }
}
