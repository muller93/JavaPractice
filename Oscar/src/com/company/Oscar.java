package com.company;

import com.company.Films.Actionfilm;
import com.company.Films.Film;

public class Oscar {

    public static void main(String[] args) {
        Film[] films = Oscar.makeFilms(args);
        Oscar oscar = new Oscar(1999, makeFilms(args));

        oscar.printArray(makeFilms(args));
    }

    int yearOfGala;
    Film[] films;
    static String nameOfFounder;

    public Oscar(int yearOfGala, Film[] films) {
        this.yearOfGala = yearOfGala;
        this.films = films;
    }


    public static Film[] makeFilms(String[] args) {
        int length = 0;
        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("film")) {
                length++;
            } else if (args[i].equals("actionfilm")) {
                length++;
            }
        }
        int counter = 0;
        Film[] films = new Film[length];
        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("film")) {
                Film film = new Film(args[i + 1], args[i + 2], Integer.parseInt(args[i + 3]));
                films[counter] = film;
                counter++;
                i += 3;
            } else if (args[i].equals("actionfilm")) {
                Actionfilm actionfilm = new Actionfilm(args[i + 1], args[i + 2], Integer.parseInt(args[i + 3]), args[i + 4], Boolean.parseBoolean(args[i + 5]), Integer.parseInt(args[i + 6]));
                films[counter] = actionfilm;
                counter++;
                i += 6;
            }
        }
        return films;
    }

    public static void filmWrite(Film film) {
        System.out.println(film);
    }
    public void printArray (Film[] film){
        for (int i = 0; i < film.length; i++) {
            filmWrite(film[i]);
            film[i].oscarCandidacy(yearOfGala);
        }
    }
}
