package com.company;

public interface Transporter {
    abstract double transport(int distance) throws Exception;
}
/*Írd meg csomagon kívül a Szallito interfészt,
   ami egy szallit() nevű metódust deklarál, aminek egy int típusú paramétere van
   (ami azt fejezi ki, hogy milyen messzire történik a szállítás), visszatérési értéke
   egy double (ami pedig azt fejezi ki, hogy mennyi időt vett igénybe a szállítás).
    A metódus Exception típusú kivételt dobhat.*/