package com.masai.Func;

import com.masai.List.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PredicateClass {
    public static void main(String[] args) {

//        String s = "1 2 3 4";
//
//        String[] arr = s.split(" ");
//
//        Arrays.stream(arr).map(x -> Integer.parseInt(x));

        ArrayList<Student> st = new ArrayList<>();

        st.add(new Student(1, "n1", 100));
        st.add(new Student(1, "n1", 200));
        st.add(new Student(1, "n1", 600));
        st.add(new Student(1, "n1", 400));
        st.add(new Student(1, "n1", 500));

        int x = st.stream().collect(Collectors.summingInt(s->s.getMarks()));
        System.out.println(x);
    }
}
