package com.company.Vehicle;

public class Car {
    private double horsePower;
    private double maxSpeed;
    private String type;

    public Car(double horsePower, double maxSpeed, String type) {
        this.horsePower = horsePower;
        this.maxSpeed = maxSpeed;
        this.type = type;
    }

    public double getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public double competitiveness(){
        return horsePower + maxSpeed;
    }

    @Override
    public String toString() {
        return "Car: " +
                type +
                ", horsePower: " + horsePower +
                ", maxSpeed: " + maxSpeed +
                ", competitiveness: " + competitiveness();
    }
}



/*2.  Az Auto osztály versenykepesseg metódusát definiáld
     felül úgy, hogy az a teljesítmény és a maximális sebesség összegének a beallitasok adattaggal
     való szorzatát adja eredményül. Definiáld felül a toString metódust is, és helyezd el az osztályt
     a jarmu csomagban. */