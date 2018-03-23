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
}
