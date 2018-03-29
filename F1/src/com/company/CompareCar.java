package com.company;

import com.company.Vehicle.F1Car;
import java.util.Comparator;

public class CompareCar implements Comparator<F1Car> {
    @Override
    public int compare(F1Car f1Car, F1Car t1) {
        if (f1Car.competitiveness() == t1.competitiveness()){
            return 0;
        }else if (f1Car.competitiveness() < t1.competitiveness()){
            return 1;
        } else return -1;
    }
}
