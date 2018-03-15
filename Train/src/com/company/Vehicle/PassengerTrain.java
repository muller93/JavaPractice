package com.company.Vehicle;

public class PassengerTrain extends Train {
    private int Station;

    public PassengerTrain(String startPoint, String destination, int distance, int avgSpeed, int station) {
        super(startPoint, destination, distance, avgSpeed);
        Station = station;
    }

    public int getStation() {
        return Station;
    }

    public void setStation(int station) {
        if(Station > 1) {
            Station = station;
        }else {
            System.out.println("The minimum station is 2.");
        }
    }

    @Override
    public double asSoonAs() {
        return Math.floor(super.getDistance() / super.getAvgSpeed()) * 60 + (getStation() * 6);
    }

    @Override
    public String toString() {
        return "Passenger train: " +
                Station + " stations, " +
                 getStartPoint() +
                " - " + getDestination() +
                ", (" + getDistance() +
                " km), " + getAvgSpeed() +
                "km/h, " + asSoonAs() + "min";
    }
}

