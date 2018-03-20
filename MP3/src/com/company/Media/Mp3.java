package com.company.Media;

public class Mp3 {
    private String performer;
    private String album;
    private String songTitle;
    private int songLength;
    private int arrayLength;

    public Mp3(String performer, String album, String songTitle, int songLength) {
        this.performer = performer;
        this.album = album;
        this.songTitle = songTitle;
        this.songLength = songLength;
    }

    public String getPerformer() {
        return performer;
    }

    public void setPerformer(String performer) {
        this.performer = performer;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public void setSongTitle(String songTitle) {
        this.songTitle = songTitle;
    }

    public int getSongLength() {
        return songLength;
    }

    public void setSongLength(int songLength) {
        this.songLength = songLength;
    }

    public int getArrayLength() {
        return arrayLength;
    }

    public void setArrayLength(int arrayLength) {
        this.arrayLength = arrayLength;
    }

    @Override
    public String toString() {
        return "This song from " + performer + ", which name is " + songTitle
                + " it's on the " + album + "title album, the length: " + songLength;
    }
}
/*Készíts egy Mp3 nevű osztályt és helyezd a media csomagba. Az osztály rendelkezzen
a következő attribútumokkal: előadó, album, szám címe, dal hossz.
 Írj az osztályhoz konstruktort, ami a kapott paramétereknek megfelelően beállítja az adattagokat!
Valósítsd meg minden attribútumhoz a getter() és setter() metódust!
Továbbá definiált felül a toString() metódust, mely a következő stringel tér vissza:
„Ez a szám XY előadótól a XYXY című szám, ami az XYXY albumon található, hossza pedig X”
*/