package com.company;

import com.company.Fields.*;

public class Main {

    public static void main(String[] args) throws Exception {
	    Trash trash = new Trash();
        System.out.println(trash.dice()); // dice ok

        //LuckyCard luckyCard = new LuckyCard();
        //luckyCard.luckyCards(); //kiírja a szerencsekártya nevét, plusz módosítja a player egyenlegét

        //Lottery lottery = new Lottery();
        //lottery.gambling(); //lottózás. 50 forintot levon, majd húzol egy szerencse káryát

        //Littering littering = new Littering();
        //littering.litter(); // szemetelés miatt levon 200ft-ot

        //Insurer insurer = new Insurer();
        //insurer.insure(); //bíztosítás lekérdezése, ha nincs bekéri, hogy akarunk e kötni. az

        //ChimneySweeper chimneySweeper = new ChimneySweeper();
        //chimneySweeper.chimneyLuck();

        ElectroShop electronikShop = new ElectroShop();
        electronikShop.electroShop(); //ready

        //TvBurn tvBurn = new TvBurn();
        //tvBurn.tvBurn(); //leég a tv. ha biztosító visszakapja az árát. kész

        //FurnitureShop furnitureShop = new FurnitureShop();
        //furnitureShop.buyArmchair();
    }
}
