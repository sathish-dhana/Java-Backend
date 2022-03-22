package com.masai.practice;

class MyGen<T> {
    T obj;
    void add(T obj){
        this.obj=obj;
    }
    T get(){
        return obj;
    }
}

public class Main1{

    public static <E> E add(E ob1, E ob2) {
        return ob1;
    }

    public static void main(String[] args) {
        MyGen<String> gen1 = new MyGen();
        gen1.add("Hello");
        System.out.println(gen1.get());
        System.out.println(Main1.add(1, 2));
    }
}