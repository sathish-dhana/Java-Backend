package com.masai.practice;

import java.util.List;

public class Mathod {

    public <E> void print(E[] arr) {

        for (E element : arr) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {

        Integer[] intArray = { 10, 20, 30, 40, 50 };
        Character[] charArray = { 'M', 'A', 'S', 'A', 'I'};

        new Mathod().print(intArray);
        new Mathod().print(charArray);
    }
}
