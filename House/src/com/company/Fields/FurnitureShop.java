package com.company.Fields;

import com.company.Player;

import java.util.Scanner;

public class FurnitureShop {
    Player player = new Player();

    private int armchairPrice = 2000; //kettő kell
    private int couchPrice = 5000; //kanapé
    private int kitchenFurnitrePrice = 6000;
    private int bedPrice = 4000;


    public void buyArmchair(){ //meg kell oldani, hogy az elírásnál újra be lehessen írni
        if (!player.isArmchair()){
            if (player.getMoney() >= armchairPrice) {
                System.out.println("Do you want buy two armchairs? The price is " + armchairPrice * 2 + "Ft. Please type yes/no");
                Scanner sc;
                sc = new Scanner(System.in);
                String s;
                s = sc.nextLine();
                sc.close();
                if (s.equals("yes")) {
                    System.out.println("Ok. You have two armchair from now.");
                    player.setArmchair(true);
                    player.setMoney(player.getMoney() - armchairPrice);
                } else if (s.equals("no")) {
                    System.out.println("Ok.");
                } else {
                    System.out.println("Sorry, I didn't catch that. Please answer yes/no");
                    //buyWashMach();
                }
            } else System.out.println("You don't have enough money.");
    } else {
            System.out.println("You already have armchairs.");
        }
    }

    public void buyCouch() { //meg kell oldani, hogy az elírásnál újra be lehessen írni
        if (!player.isCouch()) {
            if (player.getMoney() >= couchPrice) {
                System.out.println("Do you want buy a couch? The price is " + couchPrice + "Ft. Please type yes/no");
            Scanner sc;
            sc = new Scanner(System.in);
            String s;
            s = sc.nextLine();
            sc.close();
            if (s.equals("yes")) {
                System.out.println("Ok. You have a couch from now.");
                player.setCouch(true);
                player.setMoney(player.getMoney() - couchPrice);
            } else if (s.equals("no")) {
                System.out.println("Ok.");
            } else {
                System.out.println("Sorry, I didn't catch that. Please answer yes/no");
                //buyWashMach();
            }
            } else System.out.println("You don't have enough money.");
        } else {
            System.out.println("You already have a couch.");
        }
    }
    public void buyKitchenFurniture() { //meg kell oldani, hogy az elírásnál újra be lehessen írni
        if (!player.isKitchenFurniture()) {
            if (player.getMoney() >= kitchenFurnitrePrice) {
            System.out.println("Do you want buy a kitchen furniture? The price is " + kitchenFurnitrePrice + "Ft. Please type yes/no");
            Scanner sc;
            sc = new Scanner(System.in);
            String s;
            s = sc.nextLine();
            sc.close();
            if (s.equals("yes")) {
                System.out.println("Ok. You have a couch from now.");
                player.setKitchenFurniture(true);
                player.setMoney(player.getMoney() - kitchenFurnitrePrice);
            } else if (s.equals("no")) {
                System.out.println("Ok.");
            } else {
                System.out.println("Sorry, I didn't catch that. Please answer yes/no");
                //buyWashMach();
            }
        } else System.out.println("You don't have enough money.");
    } else {
            System.out.println("You already have a kitchen furniture.");
        }
    }
    public void buyBed() { //meg kell oldani, hogy az elírásnál újra be lehessen írni
        if (!player.isBed()) {
            if (player.getMoney() >= bedPrice) {
            System.out.println("Do you want buy a bed? The price is " + bedPrice + "Ft. Please type yes/no");
            Scanner sc;
            sc = new Scanner(System.in);
            String s;
            s = sc.nextLine();
            sc.close();
            if (s.equals("yes")) {
                System.out.println("Ok. You have a couch from now.");
                player.setBed(true);
                player.setMoney(player.getMoney() - bedPrice);
            } else if (s.equals("no")) {
                System.out.println("Ok.");
            } else {
                System.out.println("Sorry, I didn't catch that. Please answer yes/no");
                //buyWashMach();
            }
            } else System.out.println("You don't have enough money.");
        } else {
            System.out.println("You already have a bed.");
        }
    }
}
/*- Bútorbolt, itt vásárolhatsz bútorokat.*/