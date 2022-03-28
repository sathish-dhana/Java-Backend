package com.masai.MultiTHreading;

class MyThread1 extends Thread{
    int num=0;
    @Override
    public void run() {
        synchronized (this) {
            System.out.println("child thread performing calculation");
            for(int i=0;i<=100;i++){
                num=num+i;
            }
            System.out.println("child thread giving the notification");
            this.notify();
        }
    }
}
class Test1{
    public static void main(String[] args)throws Exception {
        MyThread1 mt=new MyThread1();
        mt.start();
        synchronized (mt) { //getting the lock of mt object
            System.out.println("main thread calls the wait method");
            mt.wait();
            System.out.println("main thread got the notification");
            System.out.println(mt.num);
        }
    }
}
