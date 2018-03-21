package com.company;

import com.company.Market.Customer;
import com.company.Market.Merchandise.Fruits;
import com.company.Market.SuperGranny;

public class Main {

    public static void main(String[] args) {
        if (args.length < 11){
            System.out.println("Please give 11 arguments.");
        }
	    SuperGranny mama = new SuperGranny(Integer.parseInt(args[0]), Double.parseDouble(args [1]));
        Customer customer = new Customer(Integer.parseInt(args[0]), Double.parseDouble(args[1]));
        Fruits[] fruits = {new Fruits(args[2], args[3], Double.parseDouble(args[4])),
                           new Fruits(args[5], args[6], Double.parseDouble(args[7])),
                           new Fruits(args[8], args[9], Double.parseDouble(args[10]))};

        Main market = new Main();
        double customerSpending = market.buying(customer, fruits);
        double grannySpending = market.buying(mama, fruits);
        System.out.println(customerSpending);
        //System.out.println(customer);
        System.out.println(grannySpending);
        //System.out.println(mama);
        if(grannySpending < customerSpending) {
            System.out.println("Granny is the price king!");
        }
    }
    public static double buying(Customer customer, Fruits[] fruits){
        double startMoney = customer.getMoney();
        double endMoney;
        for(Fruits fruit : fruits){
            customer.shopping(fruit);
        }
        endMoney = customer.getMoney();
        return startMoney - endMoney;
    }

}
/*
Hozz létre egy futtatható osztályt a piac csomagon kívűl és egy statikus metódust
 vasarlas() néven, mely egy gyümölcsökből álló tömbböt (3 elemmel) és egy vásárló
 esetleg nagyi objektumot vár paraméterül, a metódus térjen vissza az elköltött pénzzel.
  Járjuk be a gyümölcsöket és vegyük meg őket egy vásárlóval, majd egy nagyival is,
   majd vonjuk le a konklúziót, hogy megéri-e nagyival menni a piacra, azaz sikerült-e
    a nagyinknak alkudni vagy sem.  A parancssori argumentumok sorban a következőképpen
     néznek ki: kosár nagysága, kezdeti pénz, majd a gyümölcsök felsorolva: fajta, szín,
      ár szerint (legalább 3 gyümölcsöt kapnunk kell, ha annyit nem kapunk térjünk vissza
       hibaüzenettel)! Hozzunk létre egy vásárló és egy nagyi objektumot, majd egy
       piacnak nevezett 3 gyümölcsöt tároló tömböt, majd vizsgáljuk meg az előzőekben
        megfogalmazott feladatot!
véletlenszám generálása legfeljebb 5-ig:
Random randomGenerator = new Random();
int randomInt = randomGenerator.nextInt(5);*/