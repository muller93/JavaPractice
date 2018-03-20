package com.company.Book;

public class Novel extends Book{
    String type;
    String stlye;
    int counter;


    public Novel(String title, String writer, String publisher, int releaseDate, String type) {
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
        return "Novel{" +
                "type='" + type + '\'' +
                ", stlye='" + stlye + '\'' +
                getTitle() + getWriter() + getPublisher() + getReleaseDate();
    }
}
/*Írj egy Tankonyv és egy Regény osztályt, melyek a Konyv-ből származnak és helyezd ezeket el a konyv csomagban!
A Tankonyv osztály tartalmaz egy tantárgy attribútumot, amit publikus gettet() és setter() metódusokon keresztül
 lehet elérni, vagy módosítani. A tankonyv objektum létrejöttekor alapesetben „Programozás 1" értéket vesz fel,
  egyébként pedig a paraméterrel lehet definiálni az egyes adattagokat. A Regeny osztály tartalmazzon egy
  package friendly láthatóságú típus mezőt, melyet szintén publikus metódusokon keresztül lehet elérni,
   vagy megváltoztatni. A Regeny osztály default konstruktorában a stílus az „ifjúsági" értéket kapja.
   Mind a két osztályban definiáld fölül a toString() metódust, hogy a kibővített attribútumkészlet
   kiírását hajtsa végre! A Regeny osztály tartalmazzon egy osztály szintű változót, mely arra hivatott,
    hogy megszámolja hány regeny objektum jött létre! Hogy módosítható az eddig megírt kód,
     hogy a Tankonyv osztály toString() metódusában ne kelljen meghívni a Konyv osztály getter() metódusát,
     annak egyes adattagjainak elérésekor? */
