package com.masai.practice;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class PathClass {

    public static void main(String[] args) throws IOException {

        Path p = Paths.get("/media/ubuntupc/New Volume/Java Backend Assignments/practiceFile/test.txt");

        String msg = "hai this is a new message";
        List<String> list= Arrays.asList("delhi","mumbai","kolkata","chennai");

        if(Files.exists(p)) {
//            Files.write(p, msg.getBytes());
//            Files.write(p, list, StandardOpenOption.APPEND);

            Stream<String> li = Files.lines(p);

            li.map(line -> {
                if(line.contains("this"))
                    return line.replace("this","Welcome this");
                else
                    return line;
            }).forEach( line -> System.out.println(line));
        } else {
//            Files.createDirectories(p);
            System.out.println("already exit");
        }
    }
}
