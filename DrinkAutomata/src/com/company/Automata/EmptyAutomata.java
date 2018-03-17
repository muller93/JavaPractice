package com.company.Automata;

import com.company.Distributor;

public class EmptyAutomata{
    private int moneyIn;
    private int avalaibleGlasses;
    private boolean usable = true;

    public EmptyAutomata(int moneyIn, int avalaibleGlasses, boolean usable) {
        this.moneyIn = moneyIn;
        this.avalaibleGlasses = avalaibleGlasses;
        this.usable = usable;
    }
    public EmptyAutomata(int avalaibleGlasses) {
        this.avalaibleGlasses = avalaibleGlasses;
    }

    public int getMoneyIn() {
        return moneyIn;
    }

    public void setMoneyIn(int moneyIn) {
        this.moneyIn = moneyIn;
    }

    public int getAvalaibleGlasses() {
        return avalaibleGlasses;
    }

    public void setAvalaibleGlasses(int avalaibleGlasses) {
        this.avalaibleGlasses = avalaibleGlasses;
    }

    public boolean isUsable() {
        return usable;
    }

    public void setUsable(boolean usable) {
        this.usable = true;
    }

    @Override
    public String toString() {
        return "The automata is working: " + isUsable() +
                " Credit: " + moneyIn;
    }
    public void moneyPutIn(int put) {
        if (usable){
           moneyIn += put;
        }else {
           System.out.println("This automat is not refill. Do not use.");
        }
    }
}
