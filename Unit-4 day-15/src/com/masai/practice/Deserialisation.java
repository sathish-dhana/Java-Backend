package com.masai.practice;

import java.io.*;

public class Deserialisation {
    public static void main(String[] args) throws Exception {

        FileInputStream fw = new FileInputStream("/media/ubuntupc/New Volume/Java Backend Assignments/practiceFile/myflie.txt");
        ObjectInputStream oos = new ObjectInputStream(fw);

        Object obs = oos.readObject();

        Aclass a = (Aclass) obs;

        a.func1();
        a.childFunc();
        System.out.println(a.child);
        System.out.println(a.a);

    }
}
