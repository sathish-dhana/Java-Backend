package com.masai.practice;

import com.sun.source.tree.SynchronizedTree;

public class MyThread extends Thread
{
    int total=0;
    public void run(){
        for(int i=0;i<=100;i++){
            total=total+1;
        }
    }
}

class Main3{
    public static void main(String[] args) throws InterruptedException {
        MyThread mt=new MyThread();
        mt.start();

        synchronized (mt) {

            System.out.println("main thread calls the wait method");

            mt.wait();

            System.out.println("main thread got the notification");

            System.out.println(mt.total);
        }

    }
}
