package com.company.Fields;

import com.company.Player.Player;

public class Littering {
    Player player = new Player();
    public void litter(){
        player.setMoney(player.getMoney()- 200);
        System.out.println("You littered. That wasn't a nice thing. You have to pay 200Ft.");
    }
}
/*- Szemeteltél, megbüntettek 200 Ft-ra.*/