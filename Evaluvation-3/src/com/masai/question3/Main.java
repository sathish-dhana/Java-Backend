package com.masai.question3;

import java.util.*;

public class Main {

    public  Map<String,Employee> getSortedMapWithValue(Map<String,Employee> originalMap)
    {
        //sort the supplied map according to the value(Employee salary) and return the sorted Map.
        List<Map.Entry<String, Employee>> linkList = new LinkedList<>(originalMap.entrySet());

        Collections.sort(linkList, (a, b) -> {
            return a.getValue().getSalary() > b.getValue().getSalary() ? -1 : 1;
        });

        Map<String, Employee> sortedMap = new LinkedHashMap<>();

        linkList.forEach(x -> sortedMap.put(x.getKey(), x.getValue()));

        return sortedMap;
    }

    public static void main(String[] args) {

        Map<String, Employee> hm = new HashMap<>();

        hm.put("HR", new Employee("1", "dhana", 10000.00));
        hm.put("Sales", new Employee("2", "sekar", 9000.00));
        hm.put("Marketing", new Employee("3", "prem", 7000.00));
        hm.put("Sales", new Employee("4", "tahir", 6000.00));
        hm.put("Accounts", new Employee("5", "sathish", 8000.00));
        hm.put("HR", new Employee("6", "aman", 3000.00));

        Main main = new Main();

        Map<String, Employee> sorted = main.getSortedMapWithValue(hm);


        for(Map.Entry<String, Employee> emp : sorted.entrySet()) {
            System.out.println(emp.getKey());
            System.out.println(emp.getValue().toString());
        }

//        Set<Map.Entry<String, Employee>> sortedSet = sorted.entrySet();
//
//        sortedSet.forEach(emp -> System.out.println(emp));
    }
}
