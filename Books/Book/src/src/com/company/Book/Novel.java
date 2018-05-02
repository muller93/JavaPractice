package com.company.Book;

public class Novel extends Book{
    String type;
    String stlye;
    int counter;


    public Novel(String title, String writer, String publisher, int releaseDate) {
        super(title, writer, publisher, releaseDate);
        this.type = type;
    }

    public Novel(String type, String stlye) {
        this.type = type;
        this.stlye = "youth";
        counter++;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStlye() {
        return stlye;
    }

    public void setStlye(String stlye) {
        this.stlye = stlye;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    @Override
    public String toString() {
        return "This is a novel. " +
                "Title: " + getTitle() + " " + getWriter() + " " + getPublisher() + " " + getReleaseDate();
    }
}
