package com.company.Player;

import com.company.Media.Mp3;
import com.company.Media.Videoclip;

public class Winamp {
    public static void main(String[] args) {
    Winamp winamp = new Winamp(Integer.parseInt(args[0]));
    winamp.adding(new Mp3("Daft Punk", "Homework", "Around the world", 430));
    winamp.adding(new Mp3("Fatboy Slim","You've Come a Long Way, Baby", "Right here, right now", 347));
    winamp.adding(new Mp3("Crystal Castles", "Crystal Castles (II)", "Not in love", 226));
    winamp.adding(new Videoclip("Linkin Park", "Hybrid Theory", "In the end", 217, 1080, 720));

    System.out.println("The average length is: " + winamp.avgLength(winamp.songs) + " seconds.");
    winamp.songList(winamp.songs);
    }

    private Mp3[] songs;
    private int songsLength;
    private int counter = 0;

    public Winamp(int songsLength) {
        this.songs = new Mp3[songsLength];
    }

    public int getSongsLength() {
        return songsLength;
    }

    public void adding(Mp3 song){
        if (counter < songs.length){
            songs[counter] = song;
            counter++;
        }else {
            System.out.println("You already reach the playlist limit.");
        }
    }
    public Mp3 query(int i){
        return songs[i];
    }
    public void info(Mp3 song){
        System.out.println(song);
    }

    public float avgLength(Mp3[] songs) {
        float sum = 0;
        for(int i = 0; i < songs.length; i++) {
            sum += query(i).getSongLength();
        }
        return sum / songs.length;
    }
    public void songList(Mp3[] songs) {
        for(int i = 0; i < songs.length; i++) {
            info(query(i));
        }
    }
}
