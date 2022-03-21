package com.masai.question4;

public class Song{
    private String movieName;
    private String songName;

    public Song() {
    }

    public Song(String movieName, String songName) {
        this.movieName = movieName;
        this.songName = songName;
    }

    @Override
    public boolean equals(Object ob) {
        Song s1 = (Song) ob;
        return movieName == s1.getMovieName() && songName == s1.getSongName();
    }

    @Override
    public int hashCode() {
        return movieName.hashCode() + songName.hashCode();
    }

    public void play() {
        System.out.println(songName + " of " + movieName + " is playing...");
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }


}
