package com.company.Market;

import com.company.Market.Merchandise.Fruits;

import java.util.Arrays;

public class Customer{
    private Fruits[] basket;
    private double money;

    public Customer(int basket, double money) {
        this.basket = new Fruits[basket];
        this.money = money;
    }

    public Fruits[] getBasket() {
        return basket;
    }

    public void setBasket(Fruits[] basket) {
        this.basket = basket;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void shopping(Fruits fruit){
        if (money < fruit.getPrice()){
            System.out.println("Unfortunetly, we cant buy this fruit.");
        }else if (!fruit.getColor().equals("green")){
            System.out.println("Sorry, we just buy only green fruits.");
        }else {
            getBasket()[fruit.getFruitCount()] = fruit;
            fruit.setFruitCount(fruit.getFruitCount() + 1);
            setMoney((getMoney()) - fruit.getPrice());
        }
    }

    @Override
    public String toString() {
        return "Customer{" +
                "basket=" + basket +
                ", money=" + money +
                '}';
    }
}

/*Készíts egy vásárló nevü osztályt is, melyben egy vásárlót reprezentálunk!
    A  vásárló adattagjai a következőek, egy kosár amelyekbe gyümölcsöket kíván tenni a vásárló,
     egy összeg, amelyben a vásárló pénze van eltárolva. A vásárló kosarának méretét a
     felhasználó szabja meg parancssori argumentumként és a pénzét is.  Hasonlóan az előző
     feladathoz, itt is csak metódusokon keresztül lehessen elérni az attribútumokat!
      A vásárlóról is lehessen információt kérni! A vásárlót el kell látni egy vásárol()
      metódussal amellyel gyümölcsöket tud vásárolni. A metódus a következőképp működik:
      a vásárló akkor és csak akkor vesz meg egy gyümölcsöt, ha a.) van elegendő pénze b.)
      a gyümölcs színe zöld. Ha nincs elegendő pénzünk akkor erről tájékoztassuk a
       felhasználót a következő szöveggel: “sajnos nem tudjuk megvenni a megadott gyümölcsöt
        (itt információt kérünk egy adott gyümölcsről)”. Ha nem zöld a gyümölcs akkor pedig
         kérjünk elnézést az eladótól és mondjuk meg neki, hogy mi csak zöld gyümölcsöt
         szeretnénk vásárolni.*/