package com.masai.question4;

import java.util.ArrayList;
import java.util.List;

public class PlayList {
    public List<Song> songlist = new ArrayList<>();

    public boolean check(Song song) {
        for(Song s: songlist) {
            if (s.equals(song))
                return false;
        }
        return true;
    }

    public void addSong(Song song) {
        if (check(song) || songlist.isEmpty()) {
            songlist.add(song);

            for(Song s : songlist) {
                System.out.println(s.getSongName());
            }

            System.out.println("Song added to the playlist successfully.");
        } else {
            System.out.println("Song is already added in the playlist.");
        }
    }

    public void playSong() {
        for(Song s : songlist) {
            s.play();
        }
    }

}
