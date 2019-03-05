package com.example.nahid.kushtiadistrict;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class khoksha extends AppCompatActivity {
    TextView textView1_khokshaContent,textView2_khokshaContent,textView3_khokshaContent,textView4_khokshaContent,textView5_khokshaContent,textView6_khokshaContent,textView7_khokshaContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khoksha);

        textView1_khokshaContent = findViewById(R.id.textView1_khokshaContent);
        textView2_khokshaContent = findViewById(R.id.textView2_khokshaContent);
        textView3_khokshaContent = findViewById(R.id.textView3_khokshaContent);
        textView4_khokshaContent = findViewById(R.id.textView4_khokshaContent);
        textView5_khokshaContent = findViewById(R.id.textView5_khokshaContent);
        textView6_khokshaContent = findViewById(R.id.textView6_khokshaContent);
        textView7_khokshaContent = findViewById(R.id.textView7_khokshaContent);

        Typeface tf = Typeface.createFromAsset(getAssets(),
                "fonts/Siyamrupali.ttf");

        textView1_khokshaContent.setTypeface(tf);
        textView2_khokshaContent.setTypeface(tf);
        textView3_khokshaContent.setTypeface(tf);
        textView4_khokshaContent.setTypeface(tf);
        textView5_khokshaContent.setTypeface(tf);
        textView6_khokshaContent.setTypeface(tf);
        textView7_khokshaContent.setTypeface(tf);
    }
}
