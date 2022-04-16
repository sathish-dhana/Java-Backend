package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Set<Student> hs = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return 0;
            }
        });

        hs.add(new Student(1, "dhana", 500));
        hs.add(new Student(1, "dhana", 500));
        hs.add(new Student(2, "raj", 5000));

        System.out.println(hs);
    }
}
