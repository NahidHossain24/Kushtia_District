package com.example.nahid.kushtiadistrict;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class dowlotpurContent extends AppCompatActivity {
    TextView textView1_dowlotpurContent,textView2_dowlotpurContent,textView3_dowlotpurContent,textView4_dowlotpurContent,textView5_dowlotpurContent,textView6_dowlotpurContent,textView7_dowlotpurContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dowlotpur_content);

        textView1_dowlotpurContent = findViewById(R.id.textView1_dowlotpurContent);
        textView2_dowlotpurContent = findViewById(R.id.textView2_dowlotpurContent);
        textView3_dowlotpurContent = findViewById(R.id.textView3_dowlotpurContent);
        textView4_dowlotpurContent = findViewById(R.id.textView4_dowlotpurContent);
        textView5_dowlotpurContent = findViewById(R.id.textView5_dowlotpurContent);
        textView6_dowlotpurContent = findViewById(R.id.textView6_dowlotpurContent);
        textView7_dowlotpurContent = findViewById(R.id.textView7_dowlotpurContent);

        Typeface tf = Typeface.createFromAsset(getAssets(),
                "fonts/Siyamrupali.ttf");

        textView1_dowlotpurContent.setTypeface(tf);
        textView2_dowlotpurContent.setTypeface(tf);
        textView3_dowlotpurContent.setTypeface(tf);
        textView4_dowlotpurContent.setTypeface(tf);
        textView5_dowlotpurContent.setTypeface(tf);
        textView6_dowlotpurContent.setTypeface(tf);
        textView7_dowlotpurContent.setTypeface(tf);
    }
}
