package com.masai.question2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> li = new ArrayList<>();

        li.add("chennai");
        li.add("Bangalore");
        li.add("pune");
        li.add("delhi");
        li.add("goa");

        List<String> x = li.stream().sorted(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2) < 1 ? 1 : -1;
            }
        }).collect(Collectors.toList());

        System.out.println(x);
    }
}
