package com.masai.question1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Student> hm = new HashMap<String, Student>();

        hm.put("delhi", new Student(101, "dhana", 96));
        hm.put("chennai", new Student(102, "dhana1", 99));
        hm.put("pune", new Student(103, "dhana2", 76));
        hm.put("mumbai", new Student(104, "dhana3", 79));

        List<Map.Entry<String, Student>> list = new LinkedList<>(hm.entrySet());

        Collections.sort(list, new MarkComparator<Map.Entry<String, Student>>());

        for (Map.Entry<String, Student> entry : list)
        {
            System.out.println(entry.getKey() + "--------" + entry.getValue());
        }
    }

}
