package com.masai.List;

import java.util.ArrayList;

public class ArrayListClass {
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();

        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);

        al.forEach(x -> System.out.println(x));

        System.out.println(al.contains(3));

        Object[] ob = al.toArray();


    }
}
