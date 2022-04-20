package com.BookMyShow;

public class Movie {
    private String movieName;
    private ShowType showType;

    public Movie(String movieName, ShowType showType) {
        this.movieName = movieName;
        this.showType = showType;
    }

    public ShowType getShowType() {
        return showType;
    }

    public void setShowType(ShowType showType) {
        this.showType = showType;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
}
