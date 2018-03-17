package com.company.Automata;

public class DrinkAutomata extends EmptyAutomata {
    private boolean coldHot;

    public DrinkAutomata(int moneyIn, int avalaibleGlasses, boolean usable, boolean coldHot) {
        super(moneyIn, avalaibleGlasses, usable);
        this.coldHot = coldHot;
    }
    public DrinkAutomata(int avalaibleGlasses, boolean coldHot){
        super(avalaibleGlasses);
        this.coldHot = coldHot;
    }

    public boolean isColdHot() {
        return coldHot;
    }

    public void setColdHot(boolean coldHot) {
        this.coldHot = coldHot;
    }

    @Override
    public void moneyPutIn(int put) { //a visszajárót nem számolja hozzá a pénzünkhöz. vagy nem is kell?
        int price = 95;
        if (getAvalaibleGlasses() <= 0 || !isUsable()){
            System.out.println("The machine is not working. Try later.");
        }
        else if (put < price){
            System.out.println("Please put in more money.");
        }
        else if (getAvalaibleGlasses() > 0 && isUsable()){
            System.out.println("We release the drink. Returning: " + (put - price));
            setAvalaibleGlasses(getAvalaibleGlasses() - 1);
            moneyPutIn(put - price);
            }
        }


    @Override
    public String toString() {
        if (coldHot){
        return toString() + "This machine give cold drinks";}
        else {return toString() + "This machine give hot drinks";}
    }
}
/*2. Írjunk egy ItalAutomata osztályt (ami az UresAutomata osztályból származik) az automata csomagba.
 Új adattagként adjuk meg, hogy az automata hideg vagy meleg italokat szolgáltat.
Készítsünk getter és setter metódust az új adattaghoz.
 Készítsünk paraméteres konstruktort, mely vár egy rendelkezésre álló poharak száma, és egy igaz/hamis értéket,
  attól függően, hogy hideg (true) vagy meleg (false) italokat szolgáltat a gép.
  Inicializáljuk a fenti két adattagot a paraméterek szerint, a bedobott pénz értékét definiáljuk nullára,
   a használható-e attribútumot IGAZ-ra. Definiáljuk felül a toString metódust,
    mely az ősosztály toString-je után hozzáfűzi: „ez a gép hideg italokat árusít"
     vagy „ez a gép meleg italokat árusít". Definiáljuk felül a penztBedob metódust,
     mely vár egy egész típusú számot (ez jelenti azt, hogy mennyi pénzt dobtak be az automatába)
      A metódus írjon ki bizonyos szövegeket a következők szerint:
95 Ft-ért lehet teát kérni.
- Ha nincs egy darab pohár se, vagy nem működőképes üzemmódban van az italautomata, írjuk ki: „Próbálkozzon később"
- Ha 95 Ft-nál kevesebbet adtak meg, írjuk ki: „Kevés a bedobott pénz"
- Ha többet adtak meg, írjuk ki, hogy Sikeresen kiadtuk a teát, és a visszajáró pénz mennyiségét.
- Ha sikeres volt a tranzakció (csak akkor) vonjunk le egyet a rendelkezésre álló poharakból,
valamint növeljük a bedobott pénzt a megfelelő értékkel. */