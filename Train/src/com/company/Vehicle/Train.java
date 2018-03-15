package com.company.Vehicle;

import com.company.Railway;

public class Train{
    private String startPoint;
    private String destination;
    private double distance;
    private double avgSpeed;

    public Train(String startPoint, String destination, int distance, int avgSpeed) {
        this.startPoint = startPoint;
        this.destination = destination;
        this.distance = distance;
        this.avgSpeed = avgSpeed;
    }

    public String getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(String startPoint) {
        this.startPoint = startPoint;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public double getAvgSpeed() {
        return avgSpeed;
    }

    public void setAvgSpeed(int avgSpeed) {
        this.avgSpeed = avgSpeed;
    }
    public double asSoonAs(){
        return distance / avgSpeed * 60;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public void setAvgSpeed(double avgSpeed) {
        this.avgSpeed = avgSpeed;
    }

    @Override
    public String toString() {
        return "Start point: " + startPoint  +
                ", destination: " + destination  +
                ", (distance:" + distance +
                " km), average Speed:" + avgSpeed +
                "km/h.";
    }
}
