package com.company;

import java.util.*;

public class LuckyCard {
    private String message;
    private int value;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void luckyCards() {
        Map<String, Integer> cards = new HashMap<>();
        Player player = new Player();
        //decrase
        cards.put("You bought a new shoes. Decrease your money with 800Ft.", 800);
        cards.put("You were driving too fast and got a penalty. Decrase your money with 2500Ft.", 2500);
        cards.put("You had to be repaire your car. Decrase your money with 4000Ft.", 4000);
        cards.put("You have to bought a new suit. Decrase your money with 1500Ft.", 1500);
        cards.put("You were at the dentist. The treatment price was 1200Ft.", 1200);
        //increase
        cards.put("You won on tippmix. You got 1200Ft", 1200);
        cards.put("Happy birthday! You got 700ft from your grandmother.", 700);
        cards.put("You got a premium from your boss. Your money increase with 4000Ft.", 4000);
        cards.put("Inherited a little money. You got 1500ft", 1500);
        cards.put("You won on the lottery. You got 2500Ft.", 2500);
        //10 luckycard ready

        Random random = new Random();
        List<String> keys = new ArrayList<String>(cards.keySet());
        String message = keys.get(random.nextInt(keys.size()));
        Integer val = cards.get(message);
        System.out.println(message); //random select from map

        player.setMoney(- val);
    }
}
/*A szerencsekártyákat véletlenszerűen kell generálni;
mindegyiknek van egy üzenete (pl. Új cipőt kell venned,
Elromlott a porszívód, Jutalmat kaptál, Nyertél a tombolán, stb.) és egy hatása.
A hatás egy kisebb összeg (50, 100, 200, 500 Ft) elköltése vagy megnyerése lehet,
vagy az, hogy a játékos egy körből kimarad.*/