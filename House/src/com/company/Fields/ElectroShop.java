package com.company.Fields;

import com.company.Player;

import java.util.Scanner;

public class ElectroShop {
    Player player = new Player();
    private int washMachPrice = 6000;
    private int tvPrice = 8000;
    private int hooverPrice = 3000;
    private int radioPrice = 500;

    public void buyWashMach(){ //meg kell oldani, hogy az elírásnál újra be lehessen írni
        if (!player.isWashingMachine()){
            System.out.println("Do you want buy a wasching machine? The price is " + washMachPrice + "Ft. Please type yes/no");
            Scanner sc;
            sc = new Scanner(System.in);
            String s;
            s = sc.nextLine();
            sc.close();
            if (s.equals("yes")) {
                System.out.println("Ok. You have a washing machine from now.");
                player.setWashingMachine(true);
                player.setMoney(player.getMoney() - washMachPrice);
            }
            else if (s.equals("no")) {
                System.out.println("Ok.");
            }else {
                System.out.println("Sorry, I didn't catch that. Please answer yes/no");
                //buyWashMach();
            }
        } else {
            System.out.println("You already have a washing machine.");
        }
    }

    public void buyTv(){
        if (!player.isTv()){
            System.out.println("Do you want buy a TV? The price is " + tvPrice + "Ft. Please type yes/no");
            Scanner sc;
            sc = new Scanner(System.in);
            String s;
            s = sc.nextLine();
            sc.close();
            if (s.equals("yes")) {
                System.out.println("Ok. You have a TV from now.");
                player.setTv(true);
                player.setMoney(player.getMoney() - tvPrice);
            }
            else if (s.equals("no")) {
                System.out.println("Ok.");
            }else {
                System.out.println("Sorry, I didn't catch that. Please answer yes/no");
                //buyWashMach();
            }
        } else {
            System.out.println("You already have a TV.");
        }
    }

    public void buyHoover(){
        if (!player.isHoover()){
            System.out.println("Do you want buy a hoover? The price is " + hooverPrice + "Ft. Please type yes/no");
            Scanner sc;
            sc = new Scanner(System.in);
            String s;
            s = sc.nextLine();
            sc.close();
            if (s.equals("yes")) {
                System.out.println("Ok. You have a hoover from now.");
                player.setHoover(true);
                player.setMoney(player.getMoney() - hooverPrice);
            }
            else if (s.equals("no")) {
                System.out.println("Ok.");
            }else {
                System.out.println("Sorry, I didn't catch that. Please answer yes/no");
                //buyWashMach();
            }
        } else {
            System.out.println("You already have a hoover.");
        }
    }

    public void buyRadio(){
    if (!player.isRadio()){
        System.out.println("Do you want buy a radio? The price is " + radioPrice + "Ft. Please type yes/no");
        Scanner sc;
        sc = new Scanner(System.in);
        String s;
        s = sc.nextLine();
        sc.close();
        if (s.equals("yes")) {
            System.out.println("Ok. You have a radio from now.");
            player.setRadio(true);
            player.setMoney(player.getMoney() - radioPrice);
        }
        else if (s.equals("no")) {
            System.out.println("Ok.");
        }else {
            System.out.println("Sorry, I didn't catch that. Please answer yes/no");
            //buyWashMach();
        }
    } else {
        System.out.println("You already have a radio.");
        }
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public int getWashMachPrice() {
        return washMachPrice;
    }

    public void setWashMachPrice(int washMachPrice) {
        this.washMachPrice = washMachPrice;
    }

    public int getTvPrice() {
        return tvPrice;
    }

    public void setTvPrice(int tvPrice) {
        this.tvPrice = tvPrice;
    }

    public int getHooverPrice() {
        return hooverPrice;
    }

    public void setHooverPrice(int hooverPrice) {
        this.hooverPrice = hooverPrice;
    }

    public int getRadioPrice() {
        return radioPrice;
    }

    public void setRadioPrice(int radioPrice) {
        this.radioPrice = radioPrice;
    }
}
