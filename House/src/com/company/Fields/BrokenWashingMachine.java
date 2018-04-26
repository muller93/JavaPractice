package com.company.Fields;

import com.company.Player.Player;

public class BrokenWashingMachine { //ready
    Player player = new Player();
    ElectroShop electroShop = new ElectroShop();

    public void washMach(){
        if (player.isWashingMachine()){
            if (player.isInsure()){
                System.out.println("Your washing machine is ruined, but you have insure. You get back the money.");
                player.setMoney(player.getMoney() - electroShop.getWashMachPrice());
                player.setWashingMachine(false);
            } else {
                System.out.println("Your washing machine is ruined, so you have to buy a new. You don't have insure.");
                player.setWashingMachine(false);
            }
        } else {
            System.out.println("You don't have washing machine.");
        }
    }
}
/*- Elromlott a mosógéped (ha volt). Ha van biztosításod, visszakapod az árát*/