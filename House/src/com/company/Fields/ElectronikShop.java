package com.company.Fields;

import com.company.Player;

import java.util.Scanner;

public class ElectronikShop {
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
}
