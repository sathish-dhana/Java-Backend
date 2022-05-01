package com.masai.practice;

class ArrayList<T> {
    T obj;

    public void ArrayList(T obj) {
        this.obj = obj;
    }

    public T get() {
        return obj;
    }
}

public class Main {
    public static void main(String[] args) {

        ArrayList<String> ar = new ArrayList<>();
        ar.obj = "hai";
        System.out.println(ar.get());

        ArrayList<Integer> ar1 = new ArrayList<>();
        ar1.obj = 1;
        System.out.println(ar1.get());
    }
}
