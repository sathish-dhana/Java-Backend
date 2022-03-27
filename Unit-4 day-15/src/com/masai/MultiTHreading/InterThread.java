package com.masai.MultiTHreading;


class Q {
    int num;
    boolean flag = false;

    public synchronized void put(int num) {

        while(flag){
            try{ wait();} catch (Exception e) {
                System.out.println(e);
            }
        }

        System.out.println("put " + num);
        this.num = num;
        flag = true;
        notify();
    }

    public synchronized void get() {

        while(!flag){
            try{ wait();} catch (Exception e) {
                System.out.println(e);
            }
        }

        System.out.println("get " + num);
        flag = false;
        notify();
    }

}

class Producer implements Runnable {
    Q q;

    public Producer(Q q) {
        this.q = q;
        Thread t = new Thread(this, "producer");
        t.start();
    }

    @Override
    public void run() {
        int i = 0;

        while(true) {
            q.put(i++);
            try { Thread.sleep(500); } catch (Exception e) {
                System.out.println(e);
            }
        }

    }
}

class Consumer implements Runnable {
    Q q;

    public Consumer(Q q) {
        this.q = q;
        Thread t1 = new Thread(this, "consumer");
        t1.start();
    }

    @Override
    public void run() {
        q.get();
        try { Thread.sleep(1000); } catch (Exception e) {
            System.out.println(e);
        }
    }
}


public class InterThread {
    public static void main(String[] args) {

        Q qq = new Q();
        new Producer(qq);
        new Consumer(qq);
    }
}
