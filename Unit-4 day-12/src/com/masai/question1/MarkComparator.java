package com.masai.question1;

import java.util.Comparator;
import java.util.Map;

public class MarkComparator<E> implements Comparator<Map.Entry<String, Student>> {
     @Override
    public int compare(Map.Entry<String, Student> s1, Map.Entry<String, Student> s2) {
        if (s1.getValue().getMarks() < s2.getValue().getMarks())
            return -1;
        else if (s1.getValue().getMarks() > s2.getValue().getMarks())
            return 1;
        else
            return s1.getValue().getName().compareTo(s2.getValue().getName());
    }
}
