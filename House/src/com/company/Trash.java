package com.company;

import java.util.Random;

public class Trash {
    Random rand = new Random();

    public int dice(){
        int num = rand.nextInt(6) + 1;
    return num;
    }
}
