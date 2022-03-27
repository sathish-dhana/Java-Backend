package com.masai.InterFaceClass;

public interface Intr2 {
    void sayHello();
}

class Main3 {
    public static void sayNo() {
        System.out.println("you can also access me");
    }

    public static void main(String[] args) {

        Intr2 i1 = Main3::sayNo;
        i1.sayHello();
    }
}