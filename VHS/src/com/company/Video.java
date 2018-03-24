package com.company;

public class Video implements Loan{
    private String filmTitle;
    private boolean canLoan;
    private String howLongLoan; //lehetséges értékei: „egynapos”, „kétnapos”, „korlátlan”),
    private int ageLimit; //(értéke 0, 12, 16 vagy 18 lehet)

    public Video(String filmTitle, String howLongLoan, int ageLimit) {
        this.filmTitle = filmTitle;
        this.canLoan = true;
        this.howLongLoan = howLongLoan;
        this.ageLimit = ageLimit;
    }

    @Override
    public boolean rent(int age, int howLongLoan) throws ErrorLoan {
        return false;
    }

    @Override
    public boolean bringBack() {
        return false;
    }
}
/*Írj egy Video osztályt, mely implementálja a Kolcsonozheto interfészt!
Az osztály a következő adattagokkal rendelkezzen: film címe (szöveges),
ki van-e kölcsönözve (logikai), mennyi időre kölcsönözhető (szöveges,
 lehetséges értékei: „egynapos”, „kétnapos”, „korlátlan”), milyen korhatáros
 (értéke 0, 12, 16 vagy 18 lehet). Az osztályhoz 3 paramétert váró konstruktor tartozik,
 melynek segítségével inicializálható, a kölcsönözhető adattag minden új példány
 esetén igaz értéket kap. A kikolcsonoz metódus implementációja paraméterként kapja,
  hogy hány éves a kölcsönző személy és mennyi időre vinné el a videót (napokban),
  ez alapján megvizsgálja, hogy az adott videó kiadható-e. Ez azt jelenti, hogy meg kell vizsgálni,
   korhatárban megfelel-e a kölcsönző életkorának és kölcsönözhető-e a megadott időtartamra
    – amennyiben valamelyik feltétel nem teljesül, HibasKolcsonzesException hibát kell dobni.
     Amennyiben a videó éppen ki van kölcsönözve, akkor hamissal térjen vissza.
     A visszahoz metódus implementációja a ki van-e kölcsönözve adattagot hamisra állítja.
 Az osztályhoz tartoznak getterek, setterek és toString metódus.*/