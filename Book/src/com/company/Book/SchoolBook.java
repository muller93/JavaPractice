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