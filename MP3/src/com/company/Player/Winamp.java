package com.company.Player;

import com.company.Media.Mp3;

import java.util.ArrayList;

public class Winamp {
    public static void main(String[] args) {
        Winamp winamp = new Winamp(Integer.parseInt(args[0]));
    winamp.adding(new Mp3("Daft Punk", "Homework", "Around the world", 430));
    winamp.adding(new Mp3("Fatboy Slim","You've Come a Long Way, Baby", "Right here, right now", 347));
    winamp.adding(new Mp3("Crystal Castles", "Crystal Castles (II)", "Not in love", 226));

        System.out.println("The average length of the songs is: " + winamp.avgLength(winamp.songs) + " seconds.");
        winamp.songList(winamp.songs);

    }

    private Mp3[] songs;
    private int songsLength;
    private int counter = 0;

    public Winamp(int songsLength) {
        this.songs = new Mp3[songsLength];
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
/*Hozz létre pár mp3 és mp4 objektumot és rakd bele a Winamp objektum tömbjébe őket
      a hozzaad() metódus segítségével. A tömbben lévő összes objektumra hívd meg az
       info() metódust. Továbbá számítsd ki a tömbben lévő file-ok átlag hosszúságát!

*/