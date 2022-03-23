package com.masai.question1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Student> li = new ArrayList<>();

        li.add(new Student(1, "dhana", 990));
        li.add(new Student(2, "student2", 890));
        li.add(new Student(3, "student3", 790));
        li.add(new Student(4, "student4", 650));
        li.add(new Student(5, "student5", 930));
        li.add(new Student(6, "student6", 200));

        List<Student> stuList = li.stream().filter(s -> s.getMarks() < 800).collect(Collectors.toList());

        stuList.forEach(s -> System.out.println(s.toString()));

    }
}
