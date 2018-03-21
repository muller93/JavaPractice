package com.company.Films;

public class Film {
    private String title;
    private String director;
    private int made;

    public Film(String title, String director, int made) {
        this.title = title;
        this.director = director;
        this.made = made;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getMade() {
        return made;
    }

    public void setMade(int made) {
        this.made = made;
    }


    @Override
    public String toString() {
        return "Film title: " + title +
                ", director: " + director +
                ", made in " + made + ".";
    }
    public boolean oscarCandidacy(int year) {
        boolean winOrLose = Math.random() < 0.5;
        if (year == made && winOrLose) {
          System.out.println("This film won the Oscar.");
          return winOrLose;
        } else
          System.out.println("This film didn't win Oscar.");
            return false;
    }
}