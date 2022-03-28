package com.masai.MultiTHreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class PrintJob implements Runnable{
    String name;
    PrintJob(String name){
        this.name=name;
    }
    public void run(){
        System.out.println(name +" job started by Thread :"+Thread.currentThread().getName());
        try{
            Thread.sleep(5000);
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println(name +"..job completed by Thread :"+Thread.currentThread().getName());
    }
}
class Main1{
    public static void main(String[] args){

        PrintJob[] jobs = {
                new PrintJob("hai"),
                new PrintJob("dhana"),
                new PrintJob("sekar"),
                new PrintJob("sathish"),
                new PrintJob("prem"),
                new PrintJob("sql")
        };

        ExecutorService service = Executors.newFixedThreadPool(3);
        for(PrintJob job:jobs){
            service.submit(job);
        }
        service.shutdown();//to shutdown the executorService.
    }
}
