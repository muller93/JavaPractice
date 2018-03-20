package com.company.Player;

import com.company.Media.Mp3;

import java.util.ArrayList;

public class Winamp {
    public static void main(String[] args) {
        Winamp winamp = new Winamp(Integer.parseInt(args[0]));
    winamp.adding(new Mp3("Daft Punk", "Homework", "Around the world", 430));
    winamp.adding(new Mp3("Fatboy Slim","You've Come a Long Way, Baby", "Right here, right now", 347));
    winamp.adding(new Mp3());
    Mp3 mp = new Mp3("Bódi Guszti", "Albumka", "Fekete Vonat", 240);
    }

    public Winamp(int songsLength) {
        this.songs = new Mp3[songsLength];
    }

    private Mp3[] songs;
    private int songsLength;
    private int counter = 0;


    public void adding(Mp3 song){
        if (counter < songsLength){
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

}
/*Hozz létre pár mp3 és mp4 objektumot és rakd bele a Winamp objektum tömbjébe őket
      a hozzaad() metódus segítségével. A tömbben lévő összes objektumra hívd meg az
       info() metódust. Továbbá számítsd ki a tömbben lévő file-ok átlag hosszúságát!

*/