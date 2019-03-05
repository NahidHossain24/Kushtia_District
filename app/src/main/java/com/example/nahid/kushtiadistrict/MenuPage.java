package com.example.nahid.kushtiadistrict;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuPage extends AppCompatActivity {
     Button kushtia_town,ourTradition,ourCulture,kushtiaAdministration,myself;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_page);

        kushtia_town = findViewById(R.id.kushtia_town_btn);
        ourTradition = findViewById(R.id.ourTradition_btn);
        ourCulture = findViewById(R.id.ourCulture_btn);
        myself = findViewById(R.id.myself_btn);

        Typeface tf = Typeface.createFromAsset(getAssets(),
                "fonts/Siyamrupali.ttf");

        kushtia_town.setTypeface(tf);
        ourTradition.setTypeface(tf);
        ourCulture.setTypeface(tf);

    }

    public void kushtiaTown(View view) {
        Intent intent = new Intent(MenuPage.this,kushtiaTownMenu.class);
        startActivity(intent);
    }

    public void ourTradition(View view) {
        Intent intent = new Intent(MenuPage.this,ourTraditionMenu.class);
        startActivity(intent);
    }

    public void ourCulture(View view) {
        Intent intent = new Intent(MenuPage.this,ourCultureMenu.class);
        startActivity(intent);
    }

    public void me(View view) {
        Intent intent = new Intent(MenuPage.this,myselfInfo.class);
        startActivity(intent);
    }
}
