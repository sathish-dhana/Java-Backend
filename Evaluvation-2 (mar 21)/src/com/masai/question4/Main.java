package com.masai.question4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        PlayList dhana = new PlayList();

        while (true) {
            System.out.println("enter song name");
            String name = sc.next();
            System.out.println("enter movie name");
            String movie = sc.next();

            Song song = new Song(name, movie);
            dhana.addSong(song);

            System.out.println("do you want to exit? (y/n)");
            String ans = sc.next();
            if (ans.equalsIgnoreCase("y")) {
                break;
            }
        }

        dhana.playSong();

    }
}
