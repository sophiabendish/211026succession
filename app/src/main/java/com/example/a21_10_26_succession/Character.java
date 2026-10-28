package com.example.a21_10_26_succession;

import android.util.Log;
public class Character {

    String name;
    int lives;
    String fightStyle;

    public Character(String name, int lives, String fightStyle)
    {
        this.name= name;
        this.lives= lives;
        this.fightStyle= fightStyle;
    }

    public void displayInfo()
    {
        System.out.println("Character name:"+this.name);
        System.out.println("Live points:"+this.name);
    }

    public void attack()
    {
        System.out.println();
    }



}
