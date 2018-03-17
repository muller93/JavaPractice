package com.company;

import com.company.Automata.DrinkAutomata;
import com.company.Automata.EmptyAutomata;

public class Distributor {

    public static void main(String[] args) {
        Distributor dist = new Distributor();
        EmptyAutomata empty = new EmptyAutomata(12, 15, true);
        DrinkAutomata drinkauto = new DrinkAutomata(3, true);

        info(drinkauto);

        drinkauto.moneyPutIn(50);
        info(drinkauto);
        drinkauto.moneyPutIn(150);
        info(drinkauto);
        drinkauto.moneyPutIn(200);
        info(drinkauto);
        drinkauto.moneyPutIn(59);
        info(drinkauto);
        drinkauto.moneyPutIn(105);
        info(drinkauto);
        drinkauto.moneyPutIn(110);
        info(drinkauto);
    }

    public static void info(DrinkAutomata da) {
        System.out.println("Remaining glasses: " + da.getAvalaibleGlasses() + " Money in the machine: " + da.getMoneyIn());
    }
}
/*. Írjunk egy Forgalmazo nevű futtatható osztályt, amely maradjon csomagon kívüli (de lássa az automata csomagot).
 Készítsünk egy statikus informacio nevű metódust, mely vár egy ital automatát paraméterként,
 (a forgalmazó cég számára ad információkat), mely megjeleníti a következő adatokat: hány alkalommal lehet még
 használni az automatát, hogy ne fogyjon el a pohárkészlet, valamint mekkora összeg található a készülékben.
 A main-ben hozzunk létre egy ital automatát a parancssori paraméterek segítségével, amelyek ebben a sorrendben
  következnek (2 paraméter érkezik): Rendelkezésre álló poharak száma (int) majd true/false (hideg/meleg)
Konstruktorban adjuk át ezeket, és hozzuk létre az objektumot.
Vásároljunk 100 Ft-ért belőle, majd hívjuk meg a statikus informacio metódust az automatánkra.  */