package com.company.Vehicle;

import java.util.Comparator;

public class CompareTrain implements Comparator<Train>{
    @Override
    public int compare(Train train, Train t1) {
        if (train.asSoonAs() == t1.asSoonAs()){
            return 0;
        }else if (train.asSoonAs() > t1.asSoonAs()){
            return 1;
        } else return -1;
    }
}
