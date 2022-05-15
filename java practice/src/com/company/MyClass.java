package com.company;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyClass{

    public static void main(String[] args) {

//        LocalDate date = LocalDate.now();
//        LocalDateTime dateTime = LocalDateTime.now();
//        System.out.println(date);
//        System.out.println(dateTime);
//
//        LocalDate date = LocalDate.of(1996, 6, 24);
//        System.out.println(date);


        DateTimeFormatter formatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDateTime date = LocalDateTime.now();

        String st = date.format(formatObj);
        System.out.println(st);
    }
}
