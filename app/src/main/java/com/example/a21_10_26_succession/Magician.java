package com.example.a21_10_26_succession;

import android.util.Log;
public class Magician extends Character{
   String magic;

    public Magician(String name, int lives, String fightStyle, String magic)
    {
        super(name,lives,fightStyle);
        this.magic=magic;
    }

    @Override public void displayInfo()
    {
        System.out.println("MAGICIAN");
        System.out.println("Character name:"+this.name);
        System.out.println("Live points:"+this.name);
    }

    @Override public void attack()
    {
        Log.d("THE WARRIOR ATTACKS WITH","magic");

    }

    public String typeOfMagic(String type)
    {
        return type;
    }

}
