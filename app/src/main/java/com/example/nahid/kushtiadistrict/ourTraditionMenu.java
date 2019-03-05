package com.example.nahid.kushtiadistrict;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ourTraditionMenu extends AppCompatActivity {
    Button fokirLalon,mirMosharrofHossain,robindronathTagore,azizurRahman,horinath,mohoniMohon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_our_tradition_menu);

        fokirLalon = findViewById(R.id.fokirLalon_btn);
        mirMosharrofHossain = findViewById(R.id.mirMosharrofHossain_btn);
        robindronathTagore = findViewById(R.id.robindronathTagore_btn);
        azizurRahman = findViewById(R.id.azizurRahman_btn);
        horinath = findViewById(R.id.horinath_btn);
        mohoniMohon = findViewById(R.id.mohoniMohon_btn);

        Typeface tf = Typeface.createFromAsset(getAssets(),"fonts/Siyamrupali.ttf");
    }

    public void fokirLalon(View view) {
        Intent intent = new Intent(ourTraditionMenu.this,fokirLalonContent.class);
        startActivity(intent);
    }

    public void mirMosharrofHossain(View view) {
        Intent intent = new Intent(ourTraditionMenu.this,mirMosharrofContent.class);
        startActivity(intent);
    }

    public void robindronathTagore(View view) {
        Intent intent = new Intent(ourTraditionMenu.this,robindronathTagoreContent.class);
        startActivity(intent);
    }

    public void azizurRahman(View view) {
        Intent intent = new Intent(ourTraditionMenu.this,azizurRahmanContent.class);
        startActivity(intent);
    }

    public void horinath(View view) {
        Intent intent = new Intent(ourTraditionMenu.this,horinathContent.class);
        startActivity(intent);
    }

    public void mohoniMohon(View view) {
        Intent intent = new Intent(ourTraditionMenu.this,mohoniMohonContent.class);
        startActivity(intent);
    }
}
