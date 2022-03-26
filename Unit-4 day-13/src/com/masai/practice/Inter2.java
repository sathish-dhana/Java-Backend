package com.masai.practice;

public interface Inter2 {
    void sayHai(String name);
}

class NewMain {

    public static void fun1(String s){
        System.out.println("Using static Method reference Welcome " + s);
    }

    public void fun12(String num){
        System.out.println("Using non-static Method reference Welcome "+num);
    }

    public static void main(String[] args) {
        Inter2 inter = NewMain::fun1;

        inter.sayHai("dhana");

        Inter2 inter1 = new NewMain()::fun12;
        inter1.sayHai("dhana23");
    }
}