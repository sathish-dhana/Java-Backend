package com.masai;

class CreateThread extends Thread{
    @Override
    public void run() {
        for(int i = 0; i < 5; i++) {
            System.out.println("hai " + Thread.currentThread().getName());
        }
    }
}

public class Practice {

    void print() {
        for(int i = 0; i < 5; i++)
        System.out.println("i printed this");
    }

    public static void main(String[] args) {

        Thread t = new Thread(new CreateThread());
        t.setName("dhana");


        Thread t1 = new Thread(new CreateThread());
        t1.setName("sekar");

        t.start();
        t1.start();

        for(int i = 0; i < 5; i++)
            System.out.println("i printed this");
    }
}
