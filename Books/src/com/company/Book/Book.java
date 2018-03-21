package com.company.Book;

public class Book {
    private String title;
    private String writer;
    private String publisher;
    private int releaseDate;

    public Book(String title, String writer, String publisher, int releaseDate) {
        this.title = title;
        this.writer = writer;
        this.publisher = publisher;
        this.releaseDate = releaseDate;
    }
    public Book(){
        this.title = "Objektumorientált Tervezés és Programozás";
        this.writer = "Angster Erzsébet";
        this.publisher = "Kiskapu";
        this.releaseDate = 2001;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "The title of book, " +
                title +
                ", written by " + writer +
                ", published by " + publisher +
                ", released " + releaseDate;
    }
}
