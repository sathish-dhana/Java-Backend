package com.masai.practice;
import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {

        Predicate<Integer> p1 = i -> i > 0;

        System.out.println(p1.test(10));
    }
}
