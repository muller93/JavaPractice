package com.company;

import com.company.Fields.Littering;
import com.company.Fields.Lottery;

public class Main {

    public static void main(String[] args) {
	    Trash trash = new Trash();
        System.out.println(trash.dice()); // dice ok

        LuckyCard luckyCard = new LuckyCard();
        luckyCard.luckyCards(); //kiírja a szerencsekártya nevét, plusz módosítja a player egyenlegét

        Lottery lottery = new Lottery();
        lottery.gambling(); //lottózás. 50 forintot levon, majd húzol egy szerencse káryát

        Littering littering = new Littering();
        littering.litter();
    }
}
