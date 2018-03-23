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
