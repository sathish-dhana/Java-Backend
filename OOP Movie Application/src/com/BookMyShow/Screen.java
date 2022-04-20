package com.BookMyShow;

import java.util.HashMap;
import java.util.List;

public class Screen {
    String screenName;
    HashMap<Integer, Seats> seats;
    List<Movie> movie;

    public Screen(String screenName, HashMap<Integer, Seats> seats, List<Movie> movie) {
        this.screenName = screenName;
        this.seats = seats;
        this.movie = movie;
    }

    public Screen() {

    }

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    public HashMap<Integer, Seats> getSeats() {
        return seats;
    }

    public void setSeats(HashMap<Integer, Seats> seats) {
        this.seats = seats;
    }

    public List<Movie> getMovie() {
        return movie;
    }

    public void setMovie(List<Movie> movie) {
        this.movie = movie;
    }
}
