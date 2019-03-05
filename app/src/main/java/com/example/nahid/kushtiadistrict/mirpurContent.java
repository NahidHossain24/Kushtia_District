package com.example.nahid.kushtiadistrict;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class mirpurContent extends AppCompatActivity {

    TextView textView1_mirpurContent,textView2_mirpurContent,textView3_mirpurContent,textView4_mirpurContent,textView5_mirpurContent,textView6_mirpurContent,textView7_mirpurContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mirpur_content);

        textView1_mirpurContent = findViewById(R.id.textView1_mirpurContent);
        textView2_mirpurContent = findViewById(R.id.textView2_mirpurContent);
        textView3_mirpurContent = findViewById(R.id.textView3_mirpurContent);
        textView4_mirpurContent = findViewById(R.id.textView4_mirpurContent);
        textView5_mirpurContent = findViewById(R.id.textView5_mirpurContent);
        textView6_mirpurContent = findViewById(R.id.textView6_mirpurContent);
        textView7_mirpurContent = findViewById(R.id.textView7_mirpurContent);

        Typeface tf = Typeface.createFromAsset(getAssets(),
                "fonts/Siyamrupali.ttf");

        textView1_mirpurContent.setTypeface(tf);
        textView2_mirpurContent.setTypeface(tf);
        textView3_mirpurContent.setTypeface(tf);
        textView4_mirpurContent.setTypeface(tf);
        textView5_mirpurContent.setTypeface(tf);
        textView6_mirpurContent.setTypeface(tf);
        textView7_mirpurContent.setTypeface(tf);
    }
}
