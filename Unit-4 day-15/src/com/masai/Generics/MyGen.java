package com.masai.Generics;

public class MyGen<T> {
    T obj;

    public MyGen(T obj) {
        this.obj = obj;
    }
    public T get() {
        return obj;
    }
}
class NewMain{
    public static void main(String[] args) {

        MyGen<String> my = new MyGen<>("hai");
        System.out.println(my.get());
    }
}