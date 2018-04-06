package com.company;

public class Main {

    public static void main(String[] args) {
	Trash trash = new Trash();
        System.out.println(trash.dice()); // dice ok

    LuckyCard luckyCard = new LuckyCard();
        luckyCard.luckyCards(); //kiírja a szerencsekártya nevét, plusz módosítja a player egyenlegét
    }
}
