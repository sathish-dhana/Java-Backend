package com.masai.MultiTHreading;

class Practice1 implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("i am class 1" + Thread.currentThread().getName());
    }
}

class Practice2 implements Runnable {

    @Override
    public void run() {
        System.out.println("i am class 2" + Thread.currentThread().getName());
    }
}

public class Amain {

    public static void main(String[] args) throws InterruptedException {



        Practice1 p = new Practice1();
        Practice2 p2 = new Practice2();

        Thread t = new Thread(p);
        Thread t1 = new Thread(p2);

        t.start();
        t.join();
        t1.start();
        t1.join();

        System.out.println("hai");
    }
}