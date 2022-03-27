package com.masai.Generics;

import com.masai.List.Student;

public class MyMethod {

    public static <E> void print(E[] arr) {
        for (E x : arr) {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        Integer arr1[] = {1, 2, 3, 4};
        Character arr2[] = {'a', 'b', 'c', 'd'};
        Student arr3[] = {new Student(1, "dhana", 100), new Student(1, "dhana1", 100),
                            new Student(1, "dhana", 200)};

        print(arr1);
        print(arr2);
        print(arr3);
    }
}
