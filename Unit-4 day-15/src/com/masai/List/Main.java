package com.masai.List;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<Student> st = new TreeSet<>((a, b) -> a.getMarks() < b.getMarks() ? 1 : -1);

        Student st1 = new Student(1, "dhana", 100);
        Student st3 = new Student(1, "dhana1", 100);
        Student st2 = new Student(1, "dhana", 200);

        st.add(st1);
        st.add(st2);
        st.add(st3);

        System.out.println(st);
    }
}
