package com.company;

public abstract class Vehicle {
    private int weight;
    private int maxSpeed;
    private boolean isBad = false;

    public Vehicle(int weight, int maxSpeed) {
        this.weight = weight;
        this.maxSpeed = maxSpeed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public boolean isBad() {
        return isBad;
    }

    public void setBad(boolean bad) {
       isBad = bad;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "weight=" + weight +
                ", maxSpeed=" + maxSpeed +
                ", isBad=" + isBad +
                '}';
    }
    public abstract void starting() throws Bad;
}
