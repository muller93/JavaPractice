package com.company;

public class Player {
    private int money;
    private Object furniture;

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
