package com.masai.Map;

import com.masai.List.Student;

import java.util.*;

public class HashMapClass {
    public static void main(String[] args) {

        TreeMap<Integer, Student> hm = new TreeMap<Integer, Student>();

        Student st1 = new Student(1, "dhana", 100);
        Student st3 = new Student(1, "dhana1", 300);
        Student st2 = new Student(1, "dhana", 200);

        hm.put(1, st1);
        hm.put(2, st3);
        hm.put(3, st2);

        ArrayList<Map.Entry<Integer, Student>> list = new ArrayList<>(hm.entrySet());

        Collections.sort(list, (a, b) -> {
           return a.getValue().getMarks() > b.getValue().getMarks() ? 1 : -1;
        });

        list.forEach(x -> System.out.println(x));
    }
}
