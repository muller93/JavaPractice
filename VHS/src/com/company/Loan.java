package com.company;

public interface Loan {
    boolean rent(int one, int two) throws ErrorLoan;
    boolean bringBack();
}
/*Írj egy interfészt Kolcsonozheto néven, mely két metódussal rendelkezik:
a kikolcsonoz metódus két egész szám típusú paramétert vár és logikai értékkel tér vissza,
 a visszahoz metódus nem vár paramétert, és szintén igaz/hamis értéket adhat vissza.
  A kikolcsonoz metódus HibasKolcsonzesException kivételt dobhat, ehhez készítsd
  el a HibasKolcsonzesException osztályt. Ebbol az osztalybol szamazzon egy
   NotFoundException osztaly is.
*/