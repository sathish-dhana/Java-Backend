package com.masai.practice;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        File f = new File("/media/ubuntupc/New Volume/Java Backend Assignments/practiceFile/");
        f.createNewFile();
        System.out.println(f.exists());
        File f2 = new File("/media/ubuntupc/New Volume/Java Backend Assignments/practiceFile/newDir");
        System.out.println(f2.exists());

        File f3 = new File(f, "myflie.txt");
        System.out.println(f3.createNewFile());
    }
}
