package com.exam.question1;

public class Main {
    public static void main(String[] args) {
        InterfaceThree inter3 = new ClassTwo();
        System.out.println(inter3);

        inter3.methodOne();
        inter3.methodTwo();
        inter3.methodThree();

        InterfaceOne inter1 = new ClassTwo();
        inter1.methodOne();

        ClassTwo objOfClassTwo = (ClassTwo)inter1;
        objOfClassTwo.methodTwo();
        objOfClassTwo.methodThree();

    }
}
