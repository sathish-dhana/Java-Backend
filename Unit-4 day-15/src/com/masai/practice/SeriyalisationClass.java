package com.masai.practice;

import java.io.*;

class SeriyalisationClass  {

    int a = 10;

    public void func1() {
        System.out.println("this is serialisable object");
    }
}

class Aclass extends SeriyalisationClass  implements Serializable {

    int child = 10;

    public void childFunc() {
        System.out.println("this is child class");
    }
}

class NewMain {
    public static void main(String[] args) throws IOException {

        Aclass obj = new Aclass();
        obj.a = 22;
        obj.child = 23;

        FileOutputStream fw = new FileOutputStream("/media/ubuntupc/New Volume/Java Backend Assignments/practiceFile/myflie.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fw);

        oos.writeObject(obj);

        oos.writeObject("Welcome");//String class object
        oos.writeObject(10); //autoboxing

        oos.close();
    }

}
