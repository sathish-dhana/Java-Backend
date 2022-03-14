package com.exam.question2;

import java.util.Scanner;

public class StringManipulator {

    public String removeVowels(String input) {
        StringBuilder str = new StringBuilder();
        if (input == "") {
            return null;
        } else {
            for (int i = 0; i < input.length(); i++) {
                if (check(input.charAt(i))) {
                    continue;
                } else {
                    str.append(input.charAt(i));
                }
            }
        }
        return str.toString();
    }
    public boolean check(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a valid string : ");
        String userString = scan.nextLine();

        StringManipulator obj1 = new StringManipulator();
        String ans = obj1.removeVowels(userString);

        if (ans == null) {
            System.out.println("Please enter a vaild string");
        } else {
            System.out.println("Modified string without vowel: ");
            System.out.println(ans);
        }
    }
}
