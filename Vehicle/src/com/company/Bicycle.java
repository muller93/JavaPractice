package com.company;

public class Bicycle extends Vehicle{

    public Bicycle(int weight) {
        super(weight, 40);
        }


    @Override
    public void starting() throws Bad {
        if (isBad()){
            throw new Bad("This is bad.");
        }
    }

    @Override
    public String toString() {
        return "Bicycle{ " + super.toString()+ "  }";
    }
}

/*Készítsünk egy Kerekpar osztályt a Jarmu osztályból, melynek indulas metódusa,
         ha az elromlott adattag igaz értékű, dob egy ElromlottException típusú kivételt,
         illetve kiír valamilyen értelemszerű üzenetet egyéb esetben.
         Definiáljuk felül a toString metódust is.
         A konstruktorban legyen inicializálható a súly, de a maximális sebesség értéke 40.
          Írjunk továbbá egy Gepkocsi osztályt is, mely szintén a Jarmu osztályból származik,
          de tovább már nem örökölhető és megvalósítja a Motorizalt interfészt úgy,
          hogy lesz egy új adattagja az üzemanyag mennyiségének számontartásához.
          Ennek értéke kezdetben legyen 50. Az indulas metódus leellenőrzi az
          elromlott változót és az üzemanyag mértékét. Ha a jármű elromlott,
          ElromlottException-t dob, ha pedig az üzemanyag értéke <= 0, NincsUzemanyagException-t.
           Ha ezek egyike sem áll fenn, kiír valamit a képernyőre és csökkenti az
            üzemanyag mennyiségét. A Motorizalt interfészből származó két metódusa
             értelemszerű műveleteket végez.*/