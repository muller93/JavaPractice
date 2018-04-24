package com.company.Fields;

import com.company.Player.Player;

public class BrokenWashingMachine {
    Player player = new Player();

    public void washMach(){
        if (player.isWashingMachine()){
            if (player.isInsure()){
                System.out.println("Your washing machine is ruined, but you have insure. You get back the money.");
                // vissza kell kapnia az árát
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