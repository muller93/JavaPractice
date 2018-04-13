package com.company;

public class Main {

    public static void main(String[] args) {
    Character shrek = new Character("Shrek", "Marsh");
    Character donkey = new Character("Donkey", "Szabadka");

    HorseDrawnCarriage carriage = new HorseDrawnCarriage();
    carriage.addObserver(shrek);
    carriage.addObserver(donkey);
    carriage.weHere("Szeged");
    carriage.weHere("Mórahalom");
    carriage.weHere("Börtön");
    carriage.weHere("Marsh");
    carriage.weHere("Kiskunhalas");
    carriage.weHere("Szabadka");
    carriage.weHere("Budapest");


    }
}
