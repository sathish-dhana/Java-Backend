package com.company;

import java.util.Scanner;

public class Main {
    int x;

    public Main(int x) {
        this.x = x;
        x = 10;
    }
    public Main() {
        this(5);
    }

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        String ss = "hellohello";

        for (int i = 0; i < ss.length(); i++)
            sb.append(ss.charAt(i));

        System.out.println(new String(sb));

        Scanner sc = new Scanner();
        sc.nextInt();
    }
}
