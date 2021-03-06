package com.company;

import com.company.Vehicle.F1Car;
import java.util.ArrayList;
import java.util.Collections;

public class Race {

    public static void main(String[] args) {
        Race race = new Race();
        ArrayList car;

        ArrayList carSort = race.getCar(args);
        car = race.getCar(args);
        Collections.sort(car, new CompareCar());
        System.out.println(car);

    }
    public static void carWrite(F1Car car){
        System.out.println(car);

    }
    public ArrayList getCar(String[] args){
        ArrayList<F1Car> carList = new ArrayList<>();
        for (int i = 0; i < args.length; i += 5){
            F1Car ferrari = new F1Car(args[i], args[i+1], Double.parseDouble(args[i+2]), Double.parseDouble(args[i+3]), Double.parseDouble(args[i+4]));
            carList.add(ferrari);
        }
        return carList;
    }
    public static void printArray(F1Car[] cars){
        for(int i = 0; i < cars.length; i++){
            System.out.println("Position " + (i + 1) + ":");
            carWrite(cars[i]);
        }
    }
}
