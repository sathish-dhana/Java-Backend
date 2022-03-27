package com.masai.InterFaceClass;

public interface Intr {
    public int sayHello(int a, int b);
}

class Main1 {
    public static void mul(Intr i) {
        System.out.println(i.sayHello(10, 5));
    }

    public static void main(String[] args) {

        Intr plus = (a, b) -> a+b;
        Intr minus = (a, b) -> a-b;
        System.out.println(plus.sayHello(10, 20));
        System.out.println(minus.sayHello(30, 20));

        mul((a, b) -> a*b);
    }
}
