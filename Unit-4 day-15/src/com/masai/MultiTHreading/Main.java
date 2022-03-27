package com.masai.MultiTHreading;

class _1class {

    static int x = 1;
    _1class newC = new _1class();
    _1class nextC = new _1class();

    public static synchronized void run() {
        x++;
        System.out.println("i am " + x + "  " +Thread.currentThread().getName());
    }

    public void setX() {

        synchronized (_1class.class) {
            System.out.println("do some more thing1 " + Thread.currentThread().getName());
            x = 1;
        }
    }
}
class _use1 implements Runnable {
    _1class c;

    public _use1(_1class c) {
        this.c = c;
    }
    @Override
    public void run() {
        c.run();
        c.setX();
    }
}
class _use2 implements Runnable{
    _1class c;

    public _use2(_1class c) {
        this.c = c;
    }
    @Override
    public void run() {
        c.run();
        c.setX();
    }
}

public class Main {
    public static void main(String[] args) {

        _1class newC = new _1class();
        _1class nextC = new _1class();

        _use1 u1 = new _use1(newC);
        _use2 u2 = new _use2(nextC);

        Thread t = new Thread(u1);
        Thread t1 = new Thread(u2);

        t.start();
        t1.start();
    }
}