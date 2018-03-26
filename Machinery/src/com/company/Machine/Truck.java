package com.company.Machine;

import com.company.Transporter;

import java.util.Random;

public class Truck extends Machinery implements Transporter{
    private int carryingCapacity;
    private int loaded;

    public Truck(String type, int weight, int carryingCapacity) {
        super(weight, type);
        this.carryingCapacity = carryingCapacity;
        this.loaded = 0;
    }

    public int getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(int carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    public int getLoaded() {
        return loaded;
    }

    public void setLoaded(int loaded) {
        this.loaded = loaded;
    }

    @Override
    public double transport(int distance) throws Exception {
        Random r = new Random();
        double randomValue = 0 + (1) * r.nextDouble();
        if (loaded == 0){
            throw new Exception("No load.");
        }else loaded = 0;
        return distance / (weight + loaded) * randomValue;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "carryingCapacity=" + carryingCapacity +
                ", loaded=" + loaded +
                ", weight=" + weight +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
}
/*Készítsd el a Teherauto osztályt a gep csomagban, ami a Munkagep osztályból származik,
 valamint implementálja a Szallito interfészt. A Teherauto osztályba vedd fel teherbiras
  (egész) és a megrakodtsag (egész) adattagokat. A Konstruktor az örökölt adattagok mellett
   a teherbiras-t is inicializálja a paraméterei alapján, és a megrakodtsag-ot állítsa be 0-ra.
    A szallit() metódust kiszámolja, hogy mennyi ideig tart a rakományt elszállítani
    . Amennyiben nincs rakomány, vagyis a megrakodtsag 0, dobjon Exception típusú kivételt a
    „Nincs rakomány" szöveggel, ellenkező esetben állítsa a megrakodtsag-ot 0-ra, majd térjen
     vissza a távolság és a sebesség hányadosával. A távolság a paraméterben kapott szám,
      a sebesség pedig a suly + megrakodtsag összeg megszorozva egy 0 és 1 közötti véletlen
      számmal. Legyen az osztály String-gé alakítható. Definiáld felül az osztály hashCode
      valamint equals metodusait!*/