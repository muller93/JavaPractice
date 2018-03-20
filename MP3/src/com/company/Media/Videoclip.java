package com.company.Media;

public class Videoclip extends Mp3 {
    private int pictureWidth;
    private int pictureLength;

    public Videoclip(String performer, String album, String songTitle, int songLength, int pictureWidth, int pictureLength) {
        super(performer, album, songTitle, songLength);
        this.pictureWidth = pictureWidth;
        this.pictureLength = pictureLength;
    }

    public int getPictureWidth() {
        return pictureWidth;
    }

    public void setPictureWidth(int pictureWidth) {
        this.pictureWidth = pictureWidth;
    }

    public int getPictureLength() {
        return pictureLength;
    }

    public void setPictureLength(int pictureLength) {
        this.pictureLength = pictureLength;
    }

    @Override
    public String toString() {
        return super.toString() + ", picture size is " + pictureLength + ":" + pictureWidth;
    }
}
/*Készíts VideoClip osztályt a media csomagon belül, mely származik az MP3 osztályból.
 Az MP3 jellemzőin felül az osztály rendelkezzen a videó kép szélességével és hosszúságával!
  Készíts paraméteres konstruktort, ami inicializálja az őstől örökölt adattagokat is az ős
  konstruktor meghívásával. A szélesség és hosszúság attribútumokhoz is valósítsd meg a getter()
   és setter() metódusokat. Írj toString() metódust az osztálynak, mely az ős osztály toString()
    metódusát is meghívja, továbbá hozzáilleszti a „ , képmérete pedig XY : XY” szöveget
    a visszaadott stringhez.
*/