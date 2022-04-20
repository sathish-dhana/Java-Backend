package com.BookMyShow;

import java.util.List;

public class BookMyShowApp {
    List<Theater> theaters;

    public BookMyShowApp() {
    }

    public BookMyShowApp(List<Theater> theaters) {
        this.theaters = theaters;
    }

    public List<Theater> getTheaters() {
        return theaters;
    }

    public void setTheaters(List<Theater> theaters) {
        this.theaters = theaters;
    }
}
