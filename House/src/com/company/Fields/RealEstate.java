package com.company.Fields;

import com.company.Player;

import java.util.Scanner;

public class RealEstate {
    Player player = new Player();
    private int housePrice = 50000;

    public void buyHouse(){
        if (!player.isHouse()){
            if (player.getMoney() >= housePrice){
                System.out.println("Do you want buy a house? The price is " + housePrice + "Ft. Please type yes/no");
                Scanner sc;
                sc = new Scanner(System.in);
                String s;
                s = sc.nextLine();
                sc.close();
                if (s.equals("yes")) {
                    System.out.println("Congratulations. You have a house from now.");
                    player.setHouse(true);
                    player.setMoney(player.getMoney() - housePrice);
                }
                else if (s.equals("no")) {
                    System.out.println("Ok.");
                }else {
                    System.out.println("Sorry, I didn't catch that. Please answer yes/no");
                    //buyWashMach();
                }
            } else System.out.println("You don't have enough money.");
        } else {
            System.out.println("You already have a house.");
        }
    }
}
/*- Ingatlanközvetítő, itt vehetsz lakást, ára: 50.000 Ft.*/