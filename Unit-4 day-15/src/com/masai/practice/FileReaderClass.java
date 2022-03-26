package com.masai.practice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderClass {
    public static void main(String[] args) throws IOException {

        FileReader f = new FileReader("/media/ubuntupc/New Volume/Java Backend Assignments/practiceFile/abc.txt");

        int i = f.read();

        while (i != -1) {
            System.out.println((char) i);
            i = f.read();
        }
    }
}
