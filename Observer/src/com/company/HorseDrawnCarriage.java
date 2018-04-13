package com.company;

import java.util.Observable;

public class HorseDrawnCarriage extends Observable {

    public void weHere(String station){
        setChanged();
        notifyObservers(station);
    }

}
