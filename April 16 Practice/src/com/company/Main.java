package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Map<Integer, String> hm = new TreeMap<>();
    
        hm.put(1, null);
        hm.put(1, "dhana");
        hm.put(2, "dhana1");
        hm.put(3, "dhana2");
        hm.put(4, null);
        hm.put(1, null);

        for (Map.Entry<Integer, String> x : hm.entrySet()) {
            System.out.println(x);
        }
    }
}
