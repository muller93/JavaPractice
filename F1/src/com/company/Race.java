package com.company;

import com.company.Vehicle.Car;
import com.company.Vehicle.F1Car;

public class Race {

    public static void main(String[] args) {
        Race race = new Race();
        F1Car[] car = race.getCar(args);
        //System.out.println(fastestCar(car));

        F1Car[] carSort = race.getCar(args);
        printArray(sortedCar(carSort));

    }public static void carWrite(F1Car car){
        System.out.println(car);

    }public F1Car[] getCar(String[] args){
        F1Car[] cars = new F1Car[args.length / 5];
        int counter = 0;
        for (int i = 0; i < args.length; i += 5){
            F1Car ferrari = new F1Car(args[i], args[i+1], Double.parseDouble(args[i+2]), Double.parseDouble(args[i+3]), Double.parseDouble(args[i+4]));
            cars[counter] = ferrari;
            counter++;
        }
        return cars;
    }
    public static F1Car fastestCar(F1Car[] cars){
        F1Car fastestCar = cars[0];
        for (int i = 0; i < cars.length; i++){
            if (cars[i].competitiveness() > fastestCar.competitiveness()){
                fastestCar = cars[i];
            }
        }
        return fastestCar;
    }
    public static F1Car[] sortedCar(F1Car[] cars){
        F1Car[] sorted = new F1Car[cars.length];
        for (int i = 0; i < cars.length; i++) {
            sorted[i] = cars[i];
        }
            int max = 0;
        for (int i = 0; i < sorted.length; i++){
            max = i;
            for (int j = i + 1; j < sorted.length; j++){
                if (sorted[j].competitiveness() > sorted[max].competitiveness()) {
                    max = j;
                }
            }
            if (max != i){
                F1Car temp = sorted[i];
                sorted[i] = sorted[max];
                sorted[max] = temp;
            }
        }
        return sorted;
    }

    public static void printArray(F1Car[] cars){
        for(int i = 0; i < cars.length; i++){
            System.out.println("Position " + (i + 1) + ":");
            carWrite(cars[i]);
        }
    }
}
