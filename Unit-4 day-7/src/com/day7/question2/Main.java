package com.day7.question2;
import java.util.Scanner;

class Main{
        public static String reversString(String input){
            char arr[] = input.toCharArray();
            int l = 0;
            int r = input.length()-1;
            while (l < r) {
                char temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }
            return print(arr);
        }
        public static String print(char arr[]){
            StringBuilder str = new StringBuilder("");
            for (char s:arr) {
                str.append(s);
            }
            return str.toString();
        }

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a String to reverse");
            String originalString = sc.nextLine();

            String result = reversString(originalString);
            System.out.println("Original String is :"+ originalString);
            System.out.println("Reversed String is :"+ result);
        }
    }