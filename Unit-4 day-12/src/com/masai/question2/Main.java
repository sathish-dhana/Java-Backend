package com.masai.question2;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();

        map.put("tamilNadu", "chennai");
        map.put("Delhi", "mumbai");
        map.put("karnataka", "bangalore");

        for(Map.Entry<String, String> entry:map.entrySet()) {
            System.out.println(entry.getKey() + " ----------> " + entry.getValue());
        }
    }
}
