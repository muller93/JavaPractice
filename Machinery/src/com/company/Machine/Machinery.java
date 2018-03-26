package com.company.Machine;

public abstract class Machinery {
    protected int weight;
    protected String type;

    public Machinery(int weight, String type) {
        this.weight = weight;
        this.type = type;
    }

    public int getWeight() {
        return weight;
    }

    public String getType() {
        return type;
    }
}
/*Készítsd el a Munkagep absztrakt osztályt és helyezd azt a gep csomagba.
Az osztálynak két adattagja legyen protected láthatósággal: suly (egész) és tipus (szöveg).
 Írj az osztálynak konstruktort, ami az adattagokat a paramétereivel inicializálja,
  továbbá mindkét adattaghoz készíts gettert. Írd meg csomagon kívül a Szallito interfészt,
   ami egy szallit() nevű metódust deklarál, aminek egy int típusú paramétere van
   (ami azt fejezi ki, hogy milyen messzire történik a szállítás), visszatérési értéke
   egy double (ami pedig azt fejezi ki, hogy mennyi időt vett igénybe a szállítás).
    A metódus Exception típusú kivételt dobhat. */