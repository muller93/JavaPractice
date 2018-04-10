package com.company.Fields;

import com.company.Player;

public class Insurer {
    Player player = new Player();

    public void insure() {
        if (player.isInsure()){
            System.out.println("You already have insure.");
        } else {
            System.out.println("Do you want insurance?");
        }
    }
}
/*- Biztosító: itt köthetsz biztosítást (ha még nincs).*/