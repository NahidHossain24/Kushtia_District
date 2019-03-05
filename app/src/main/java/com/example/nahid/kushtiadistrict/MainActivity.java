package com.example.nahid.kushtiadistrict;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button buttonstart;
    TextView textViewmain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        buttonstart = findViewById(R.id.buttonstartid);
        textViewmain = findViewById(R.id.textViewmainid);

        Typeface tf = Typeface.createFromAsset(getAssets(),
                "fonts/Siyamrupali.ttf");

        textViewmain.setTypeface(tf);
    }

    public void start(View view) {
        Intent intent = new Intent(MainActivity.this,MenuPage.class);
        startActivity(intent);
    }
}
