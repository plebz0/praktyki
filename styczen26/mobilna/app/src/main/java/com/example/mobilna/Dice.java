package com.example.mobilna;

import android.widget.ImageView;

import java.util.Random;

public class Dice {
    public int valueOfDice;

    public boolean isDiceAvilable = false;
    public Dice()
    {
        isDiceAvilable = true;
    }


    public void RollDice()
    {
        if (isDiceAvilable) {
            Random random = new Random();
            int roll = random.nextInt(6)+1;
            valueOfDice = roll;
        }
    }

    public void blockDice()
    {
        isDiceAvilable = false;
    }
}
