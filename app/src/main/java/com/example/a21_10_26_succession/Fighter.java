package com.example.a21_10_26_succession;

import android.util.Log;
public class Fighter extends Character {

    String sword;

    public Fighter(String name, int lives, String fightStyle,String sword)
    {
        super(name,lives,fightStyle);
        this.sword= sword;

    }

   @Override public void displayInfo()
    {
        System.out.println("FIGHTER");
        System.out.println("Character name:"+this.name);
        System.out.println("Live points:"+this.name);
    }

    @Override public void attack()
    {
        Log.d("THE WARRIOR ATTACKS WITH","a sword");

    }

    public String typeOfSword(String type)
    {
        return type;
    }

}
