package com.company;

public final class Car extends Vehicle implements Motorized{
    private int fuelQuantaty = 50;

    public Car(int weight, int maxSpeed) {
        super(weight, maxSpeed);
        this.fuelQuantaty = fuelQuantaty;
    }

    public int getFuelQuantaty() {
        return fuelQuantaty;
    }

    public void setFuelQuantaty(int fuelQuantaty) {
        this.fuelQuantaty = fuelQuantaty;
    }

    @Override
    public void starting() throws Bad {
        if (isBad()){
            throw new Bad("This is bad.");
        }else if (fuelQuantaty <= 0){
            throw new NoFuel("You have not fuel");
        }else {
            System.out.println("You started.");
            fuelQuantaty--;
        }
    }


    @Override
    public void reFueling(int fuel) {
        setFuelQuantaty(fuel);

    }

    @Override
    public int getFuel() {
     return getFuelQuantaty();
    }
}
/*Írjunk továbbá egy Gepkocsi osztályt is, mely szintén a Jarmu osztályból származik,
          de tovább már nem örökölhető és megvalósítja a Motorizalt interfészt úgy,
          hogy lesz egy új adattagja az üzemanyag mennyiségének számontartásához.
          Ennek értéke kezdetben legyen 50. Az indulas metódus leellenőrzi az
          elromlott változót és az üzemanyag mértékét. Ha a jármű elromlott,
          ElromlottException-t dob, ha pedig az üzemanyag értéke <= 0, NincsUzemanyagException-t.
           Ha ezek egyike sem áll fenn, kiír valamit a képernyőre és csökkenti az
            üzemanyag mennyiségét. A Motorizalt interfészből származó két metódusa
             értelemszerű műveleteket végez.*/