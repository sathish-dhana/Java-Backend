package com.masai.practice;

import java.time.LocalDate;
import java.time.Period;

public class _date {
    public static void main(String[] args) {
        LocalDate cd = LocalDate.now();
        LocalDate dob = LocalDate.of(1996, 07, 24);
        Period diff = Period.between(cd, dob);
        System.out.println(diff);
    }
}
