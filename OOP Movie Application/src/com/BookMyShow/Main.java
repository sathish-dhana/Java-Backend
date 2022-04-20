package com.BookMyShow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        //my movie app//
        BookMyShowApp bookMyShowApp = new BookMyShowApp();

        //theater 1 - phoenix//
        Theater phoenix = new Theater();

        HashMap<Integer, Seats> screen_1_seats = new HashMap<>();
        for (int i = 1; i <= 10; i++) {
            screen_1_seats.put(i, new Seats(100, false));
        }
        Movie KGF = new Movie("KGF", ShowType.MORNING);
        Movie PK = new Movie("PK", ShowType.NOON);
        Movie titanic = new Movie("Titanic", ShowType.NIGHT);

        ArrayList<Movie> screen_1_movies = new ArrayList<>();
        screen_1_movies.add(KGF);
        screen_1_movies.add(KGF);
        screen_1_movies.add(KGF);

        //Theater 1 - screen 1//
        Screen screen1 = new Screen("phoenix_screen_A", screen_1_seats, screen_1_movies);
    }
}
