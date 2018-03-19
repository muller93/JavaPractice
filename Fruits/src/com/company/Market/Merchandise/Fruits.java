package com.company.Market.Merchandise;

public class Fruits {
    private double price;
    private String color;
    private String species;
    private int fruitCount = 0;

    public Fruits(String species, String color, double price) {
        this.price = price;
        this.color = color;
        this.species = species;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getFruitCount() {
        return fruitCount;
    }

    public void setFruitCount(int fruitCount) {
        this.fruitCount = fruitCount;
    }

    @Override
    public String toString() {
        return "Fruits{" +
                "price=" + price +
                ", color='" + color + '\'' +
                ", species='" + species + '\'' +
                ", fruitCount=" + fruitCount +
                '}';
    }
}
/*Készíts egy gyümölcs nevű osztályt, mely a következő adattagokkal rendelkezik ár,
 szin (ez csak zöld, sárga, és piros lehet), fajta. Mindhárom adattagra legyen igaz az,
  hogy direkt nem elérhető részét képzik az osztálynak, viszont ha el szeretnénk
   őket érni akkor metódusokon keresztül ezt megtehetjük! Legyen kiíratható a gyümölcs!
    Készíts egy vásárló nevü osztályt is, melyben egy vásárlót reprezentálunk!
    A  vásárló adattagjai a következőek, egy kosár amelyekbe gyümölcsöket kíván tenni a vásárló,
     egy összeg, amelyben a vásárló pénze van eltárolva. A vásárló kosarának méretét a
     felhasználó szabja meg parancssori argumentumként és a pénzét is.  Hasonlóan az előző
     feladathoz, itt is csak metódusokon keresztül lehessen elérni az attribútumokat!
      A vásárlóról is lehessen információt kérni! A vásárlót el kell látni egy vásárol()
      metódussal amellyel gyümölcsöket tud vásárolni. A metódus a következőképp működik:
      a vásárló akkor és csak akkor vesz meg egy gyümölcsöt, ha a.) van elegendő pénze b.)
      a gyümölcs színe zöld. Ha nincs elegendő pénzünk akkor erről tájékoztassuk a
       felhasználót a következő szöveggel: “sajnos nem tudjuk megvenni a megadott gyümölcsöt
        (itt információt kérünk egy adott gyümölcsről)”. Ha nem zöld a gyümölcs akkor pedig
         kérjünk elnézést az eladótól és mondjuk meg neki, hogy mi csak zöld gyümölcsöt
         szeretnénk vásárolni.*/