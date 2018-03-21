package com.company.Films;

public class Actionfilm extends Film {
    private String actionHero;
    private boolean isMale;
    private int numberOfDie;

    public Actionfilm(String title, String director, int made, String actionHero, boolean isMale, int numberOfDie) {
        super(title, director, made);
        this.actionHero = actionHero;
        this.isMale = isMale;
        this.numberOfDie = numberOfDie;
    }

    public String getActionHero() {
        return actionHero;
    }

    public void setActionHero(String actionHero) {
        this.actionHero = actionHero;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public int getNumberOfDie() {
        return numberOfDie;
    }

    public void setNumberOfDie(int numberOfDie) {
        this.numberOfDie = numberOfDie;
    }

    @Override
    public String toString() {
        return "Actionfilm. " +
                "ActionHero: " + actionHero +
                ", gender " + isMale +
                ", number of die " + numberOfDie;
    }
}
