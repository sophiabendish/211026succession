package com.example.a21_10_26_succession;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private static final String TAG= "Sophia";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        Log.d(TAG,"CREATE CHARACTERS");
        Character fighter= new Fighter("Player1",10,"smt1","sword");
        Character magician= new Magician("Player2",10,"smt2","magic");

        Log.d(TAG, "DISPLAY INFORMATION");
        fighter.displayInfo();
        magician.displayInfo();

        Log.d(TAG,"ATTACK");
        fighter.attack();
        magician.attack();

        if (fighter instanceof Fighter) {

            Fighter actualFighter = (Fighter) fighter;

            Log.d(TAG, "ההמרה הצליחה! זהו לוחם.");

           String type1= actualFighter.typeOfSword("Sharp");
           Log.d(TAG,"TYPE OF SWORD IS:"+type1);

        }

        if (magician instanceof Magician) {

            Magician actualMagician = (Magician) magician;

            Log.d(TAG, "ההמרה הצליחה! זהו קוסם.");
        }




        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


    }
}