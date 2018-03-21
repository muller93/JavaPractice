package com.company.Book;

public class SchoolBook extends Book{
    private String subject;

    public SchoolBook(String title, String writer, String publisher, int releaseDate, String subject) {
        super(title, writer, publisher, releaseDate);
        this.subject = subject;
    }

    public SchoolBook(String subject) {
        this.subject = "Programozás 1";
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "This is a school book. " +
                "Subject: " + subject + " " +
                "Title: " +getTitle() + " " + getWriter() + " " + getPublisher() + " " + getReleaseDate();
    }
}
