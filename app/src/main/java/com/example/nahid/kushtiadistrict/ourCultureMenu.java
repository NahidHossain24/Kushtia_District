package com.example.nahid.kushtiadistrict;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ourCultureMenu extends AppCompatActivity {
    ImageView imageView;
    TextView textView1_ourCultureMenu,textView2_ourCultureMenu,textView3_ourCultureMenu,textView4_ourCultureMenu,textView5_ourCultureMenu,textView6_ourCultureMenu,textView7_ourCultureMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_our_culture_menu);

        imageView = findViewById(R.id.imageView);
        textView1_ourCultureMenu = findViewById(R.id.textView1_ourCultureMenu);
        textView2_ourCultureMenu = findViewById(R.id.textView2_ourCultureMenu);
        textView3_ourCultureMenu = findViewById(R.id.textView3_ourCultureMenu);
        textView4_ourCultureMenu = findViewById(R.id.textView4_ourCultureMenu);
        textView5_ourCultureMenu = findViewById(R.id.textView5_ourCultureMenu);
        textView6_ourCultureMenu = findViewById(R.id.textView6_ourCultureMenu);
        textView7_ourCultureMenu = findViewById(R.id.textView7_ourCultureMenu);

        Typeface tf = Typeface.createFromAsset(getAssets(),"fonts/Siyamrupali.ttf");

        textView1_ourCultureMenu.setTypeface(tf);
        textView2_ourCultureMenu.setTypeface(tf);
        textView3_ourCultureMenu.setTypeface(tf);
        textView4_ourCultureMenu.setTypeface(tf);
        textView5_ourCultureMenu.setTypeface(tf);
        textView6_ourCultureMenu.setTypeface(tf);
        textView7_ourCultureMenu.setTypeface(tf);
    }
}
