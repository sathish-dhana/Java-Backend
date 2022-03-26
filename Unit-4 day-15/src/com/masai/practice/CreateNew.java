package com.masai.practice;

import java.io.File;
import java.io.IOException;

public class CreateNew {
    public static void main(String[] args) throws IOException {

        File f = new File("/media/ubuntupc/New Volume/Java Backend Assignments/practiceFile/");


        File newFile = new File(f, "abc.txt");

        if (newFile.createNewFile()) {
            System.out.println("created");
        } else {
            System.out.println("file already exit");
        }
    }
}
