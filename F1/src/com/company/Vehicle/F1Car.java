package com.company.Vehicle;

public class F1Car extends Car{
    private String pilot;
    private double options;

    public F1Car(String type, String pilot, double horsePower, double maxSpeed, double options) {
        super(horsePower, maxSpeed, type);
        this.pilot = pilot;
        this.options = options;
    }

    public String getPilot() {
        return pilot;
    }

    public void setPilot(String pilot) {
        this.pilot = pilot;
    }

    public double getOptions() {
        return options;
    }

    public void setOptions(double options) {
        this.options = options;
    }

    @Override
    public double competitiveness() {
        return super.competitiveness() * options;
    }

    @Override
    public String toString() {
        return "F1 Car " +
                "pilot: " + pilot +
                ", competitiveness " + competitiveness();
    }
}
/*3. Írj egy F1Auto nevű osztályt Forma-1-es versenyautók reprezentálása.
Az osztály az Auto osztályból származzon, és ne lehessen belőle további gyerekosztályokat létrehozni.
Az osztálynak legyen egy pilota adattagja, ami a versenyautót vezető pilóta nevét tárolja,
 továbbá legyen egy beallitasok adattag is, amely egy 0 és 1 közötti szám, azt fejezi ki,
  hogy a versenyautót a szerelők milyen sikeresen állították be az adott pályára, az adott időjárási
  és egyéb körülményhez. Ezen attribútumok láthatósága privát. Készíts metódusokat ezen mezők módosítására
   és lekérésére is. Írj konstruktort, amely az ős osztálytól örökölt adattagokat és a hozzáadottakat
    is inicializálja a paraméterei felhasználásával. Az Auto osztály versenykepesseg metódusát definiáld
     felül úgy, hogy az a teljesítmény és a maximális sebesség összegének a beallitasok adattaggal
     való szorzatát adja eredményül. Definiáld felül a toString metódust is, és helyezd el az osztályt
     a jarmu csomagban.*/