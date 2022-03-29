package com.masai.question3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderClass {
    public static void main(String[] args) throws IOException {

        FileReader fr=new FileReader("/media/ubuntupc/New Volume/Java Backend Assignments/Unit-4 day-16/src/com/masai/question3/demo.txt");
        int i=fr.read();

        while( i != -1) {
            System.out.print((char) i);
            i = fr.read();
        }
    }
}
