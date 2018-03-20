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
