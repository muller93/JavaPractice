package com.company.Fields;

import com.company.Devices.LuckyCard;
import com.company.Player.Player;

public class Lottery {
    Player player = new Player();
    LuckyCard luckyCard = new LuckyCard();

    public void gambling(){
        System.out.println("You played a lottery. That was 50Ft.");
        player.setMoney(player.getMoney()- 50);
        luckyCard.luckyCards();

    }
}
/*- Lottóztál, fizess 50 Ft-ot, és húzz egy szerencsekártyát!*/