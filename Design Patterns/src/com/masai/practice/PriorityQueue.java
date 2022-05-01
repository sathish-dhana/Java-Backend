package com.masai.practice;

import java.util.Queue;

public class PriorityQueue {
    public static void main(String[] args) {

        Queue<String> testStringsPQ = new java.util.PriorityQueue<>();

        testStringsPQ.add("abcd");
        testStringsPQ.add("1234");
        testStringsPQ.add("1");
        testStringsPQ.add("23bc");
        testStringsPQ.add("zzxx");
        testStringsPQ.add("abxy");

        for (String s : testStringsPQ) {
            System.out.println(s);
        }
    }
}
