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