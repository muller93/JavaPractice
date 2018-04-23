package com.company;

public class Player {
    private int money = 10000;
    private Object furniture;
    private boolean house = false;
    private boolean insure = false;
    private boolean debit = false;
    private boolean armchair = false;
    private boolean couch = false;
    private boolean kitchenFurniture = false;
    private boolean hoover = false;
    private boolean tv = false;
    private boolean bed = false;
    private boolean washingMachine = false;
    private boolean radio = false;

    public boolean isHouse() {
        return house;
    }

    public void setHouse(boolean house) {
        this.house = house;
    }

    public boolean isDebit() {
        return debit;
    }

    public boolean isArmchair() {
        return armchair;
    }

    public void setArmchair(boolean armchair) {
        this.armchair = armchair;
    }

    public boolean isCouch() {
        return couch;
    }

    public void setCouch(boolean couch) {
        this.couch = couch;
    }

    public boolean isKitchenFurniture() {
        return kitchenFurniture;
    }

    public void setKitchenFurniture(boolean kitchenFurniture) {
        this.kitchenFurniture = kitchenFurniture;
    }

    public boolean isHoover() {
        return hoover;
    }

    public void setHoover(boolean hoover) {
        this.hoover = hoover;
    }

    public boolean isTv() {
        return tv;
    }

    public void setTv(boolean tv) {
        this.tv = tv;
    }

    public boolean isBed() {
        return bed;
    }

    public void setBed(boolean bed) {
        this.bed = bed;
    }

    public boolean isWashingMachine() {
        return washingMachine;
    }

    public void setWashingMachine(boolean washingMachine) {
        this.washingMachine = washingMachine;
    }

    public boolean isRadio() {
        return radio;
    }

    public void setRadio(boolean radio) {
        this.radio = radio;
    }

    public void setDebit(boolean debit) {
        this.debit = debit;
    }

    public boolean isInsure() {
        return insure;
    }

    public void setInsure(boolean insure) {
        this.insure = insure;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Object getFurniture() {
        return furniture;
    }

    public void setFurniture(Object furniture) {
        this.furniture = furniture;
    }

    @Override
    public String toString() {
        return "Your money: " + money +
                "\n Your furnitures: " + furniture;
    }
}
