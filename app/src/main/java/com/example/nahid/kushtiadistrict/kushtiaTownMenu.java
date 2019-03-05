package com.example.nahid.kushtiadistrict;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class kushtiaTownMenu extends AppCompatActivity {

    Button  kumarkhali,dowlotpur,veramara,mirpur,khoksha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kushtia_town_menu);

        kumarkhali = findViewById(R.id.kumarkhali_btn);
        dowlotpur = findViewById(R.id.dowlotpur_btn);
        veramara = findViewById(R.id.veramara_btn);
        mirpur = findViewById(R.id.mirpur_btn);
        khoksha = findViewById(R.id.khoksha_btn);

        Typeface tf = Typeface.createFromAsset(getAssets(),
                "fonts/Siyamrupali.ttf");

        kumarkhali.setTypeface(tf);
        dowlotpur.setTypeface(tf);
        veramara.setTypeface(tf);
        mirpur.setTypeface(tf);
        khoksha.setTypeface(tf);
    }

    public void kumarkhali(View view) {
        Intent intent = new Intent(kushtiaTownMenu.this,kushtiaTownSubmenu.class);
        startActivity(intent);
    }

    public void dowlotpur(View view) {
        Intent intent = new Intent(kushtiaTownMenu.this,dowlotpurContent.class);
        startActivity(intent);
    }

    public void veramara(View view) {
        Intent intent = new Intent(kushtiaTownMenu.this,veramaraContent.class);
        startActivity(intent);
    }

    public void mirpur(View view) {
        Intent intent = new Intent(kushtiaTownMenu.this,mirpurContent.class);
        startActivity(intent);
    }

    public void khoksha(View view) {
        Intent intent = new Intent(kushtiaTownMenu.this,khoksha.class);
        startActivity(intent);
    }
}
