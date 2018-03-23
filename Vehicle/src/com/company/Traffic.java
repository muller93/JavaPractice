package com.company;

import java.util.ArrayList;

public class Traffic {

    static Traffic traffic = new Traffic();
    static ArrayList<Vehicle> vehicles = new ArrayList<>();

    public static void main(String[] args) {

        vehicles.add(new Bicycle(7));
        Bicycle csepel = new Bicycle(5);
        csepel.setBad(true);
        vehicles.add(csepel);
        vehicles.add(new Car(1235, 204));
        vehicles.add(new Car(1055, 186));

        Vehicle vehicle1 = new Car(1300, 200);

        for (Vehicle vehicle : vehicles) {
            try {
                vehicle.starting();
            } catch (Bad bad) {
                bad.printStackTrace();
            }
            }
            while (true) {
                try {
                    vehicle1.starting();
                } catch (Bad bad) {
                    bad.printStackTrace();
                    break;
                }
            }

    }
}
/* Készítsünk egy Kozlekedes osztályt, mely futtatható, és létrehoz egy járművekből
        álló List-et (valamelyik megvalósítással). Ebbe először elhelyez két kerékpárt és két
        gépkocsit. A második kerékpárt a listába helyezés előtt „el kell rontani”.
        Ezután a listában szereplő összes járművet meg kell próbálni elindítani.
        Ezután hozzunk létre egy Jarmu típusú változót, és adjunk neki értékül egy új
        Gepkocsi példányt. Ezt elindítjuk mindaddig, míg ki nem fogy az üzemanyag.*/