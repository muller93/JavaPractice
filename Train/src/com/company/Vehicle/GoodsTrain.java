package com.company.Vehicle;

public class GoodsTrain extends Train{
    private String cargo;
    private int quantity;
    public GoodsTrain(String startPoint, String destination, int distance, int avgSpeed, String cargo, int quantity) {
        super(startPoint, destination, distance, avgSpeed);
        this.cargo = cargo;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Goods train: " +
                cargo +
                ", (" + quantity +
                "t), "+ getStartPoint() +
                " - "+ getDestination() + " (" +
                getDistance() + "km)" + " " +
                getAvgSpeed() + "km/h " +
                asSoonAs() + " min";
    }
}
