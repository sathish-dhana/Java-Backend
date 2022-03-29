package com.masai.question2;

import java.security.spec.ECField;

class Access {
    int count = 0;

    public void add() {
        for (int i = 0; i < 5; i++) {
            count++;
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        System.out.println(count);
    }
    public void detuct() {
        for (int i = 0; i < 5; i++) {
            count--;
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }

        }
        System.out.println(count);
    }
}

class ThreadA extends Thread {
    Access access;

    public ThreadA(Access access) {
        this.access = access;
    }

    @Override
    public void run() {
        access.add();
    }
}

class ThreadB extends Thread {
    Access access;

    public ThreadB(Access access) {
        this.access = access;
    }

    @Override
    public void run() {
        access.detuct();
    }
}



public class Main {
    public static void main(String[] args) throws InterruptedException {

        Access ac = new Access();

        ThreadA th1 = new ThreadA(ac);
        ThreadB th2 = new ThreadB(ac);

        th1.start();
        th2.start();

    }
}
