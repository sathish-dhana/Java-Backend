package com.masai.practice;

import com.masai.question1.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortUsingLambda {
    public static void main(String[] args) {

        List<Student> li = new ArrayList<>();

        li.add(new Student(1, "dhana", 990));
        li.add(new Student(2, "student2", 890));
        li.add(new Student(3, "student3", 790));
        li.add(new Student(4, "student4", 650));
        li.add(new Student(5, "student5", 930));
        li.add(new Student(6, "student6", 200));

        Collections.sort(li, (a, b) -> a.getMarks() > b.getMarks() ? +1 : -1);

        li.forEach(s -> System.out.println(s.toString()));
    }
}
