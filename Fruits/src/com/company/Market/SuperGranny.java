package com.company.Market;

import com.company.Market.Merchandise.Fruits;

public class SuperGranny extends Customer {
    private boolean haggle = (Math.random() < 0.5);

    public SuperGranny(int basket, double money) {
        super(basket, money * 0.8);
    }

    public boolean isHaggle() {
        return haggle;
    }

    public void setHaggle(boolean haggle) {
        this.haggle = haggle;
    }

    @Override
    public void shopping(Fruits fruit) {
        if (getMoney() < fruit.getPrice() * 0.9){
            System.out.println("Unfortunetly, we cant buy this fruit.");
        }else if (!fruit.getColor().equals("green") || !fruit.getColor().equals("yellow")){
            System.out.println("Sorry, we just buy only green and yellow fruits.");
        }
        else if (haggle && (Math.random() < 0.75)){
                fruit.setPrice(fruit.getPrice() * 0.9);
                getBasket()[fruit.getFruitCount()] = fruit;
                fruit.setFruitCount(fruit.getFruitCount() + 1);
                setMoney((getMoney()) - fruit.getPrice());
                iToldYou();
        }
        else{
                getBasket()[fruit.getFruitCount()] = fruit;
                fruit.setFruitCount(fruit.getFruitCount() + 1);
                setMoney((getMoney()) - fruit.getPrice());
        }
    }
    public void iToldYou(){
        System.out.println("My grandchild, I told you, we could haggled at this vendor");
    }

    @Override
    public String toString() {
        return "SuperGranny{" +
                "haggle=" + haggle +
                '}';
    }
}

/*A Vásárló osztályból származzon egy szuperNagyi osztály mely egy attribútummal rendelkezik
a vásárló attributúmain kívűl, amivel azt szeretnénk jelezni, hogy a nagymama rendelkezik-e
 az alkudozás képességgel. Ez véletlen legyen, azaz random számmal döntsük el egy nagyiról,
  hogy alkudozó vagy sem. Ezen felül a nagyi mivel már nyugdíjas a vásárlóhoz képest kevesebb
   pénzzel rendelkezik, a parancssorban megadott paraméter 80%-val. A nagyi vásárol()
    metódusát definiáljuk felül mégpedig úgy, hogy Ő megveszi a sárga gyümölcsöket is
     és ha alkudozásra hajlamos, akkor alkudozik is, mégpedig minden vásárlás esetén
     75%-os sikerrel. Ha sikerült az alkudozás, akkor az árból engedhetünk 10%-ot.
     A nagyinak legyen egy megmondtam() metódusa is, melyet meghívunk minden sikeres
     alkudozás után, amely egyszerűen kiírja a képernyőre, hogy “ugye unokám megmondtam,
      hogy ennél az árusnál lehet alkudni…”. Legyen a nagyi is kiiratható, mégpedig úgy,
       hogy jelezzük azt, hogy szuperNagyiról van szó a kiiratásban, de maradjon meg a
        vásárló kiiratása is. A vásárló és a szupernagyi legyen egy piac csomagban,
         míg a gyümölcs a piac csomagon belül egy portéka csomagban.*/
