package com.example.nahid.kushtiadistrict;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class horinathContent extends AppCompatActivity {
    TextView textView1_horinathContent,textView2_horinathContent,textView3_horinathContent,textView4_horinathContent,textView5_horinathContent,textView6_horinathContent,textView7_horinathContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horinath_content);

        textView1_horinathContent = findViewById(R.id.textView1_horinathContent);
        textView2_horinathContent = findViewById(R.id.textView2_horinathContent);
        textView3_horinathContent = findViewById(R.id.textView3_horinathContent);
        textView4_horinathContent = findViewById(R.id.textView4_horinathContent);
        textView5_horinathContent = findViewById(R.id.textView5_horinathContent);
        textView6_horinathContent = findViewById(R.id.textView6_horinathContent);
        textView7_horinathContent = findViewById(R.id.textView7_horinathContent);

        Typeface tf = Typeface.createFromAsset(getAssets(),"fonts/Siyamrupali.ttf");

        textView1_horinathContent.setTypeface(tf);
        textView2_horinathContent.setTypeface(tf);
        textView3_horinathContent.setTypeface(tf);
        textView4_horinathContent.setTypeface(tf);
        textView5_horinathContent.setTypeface(tf);
        textView6_horinathContent.setTypeface(tf);
        textView7_horinathContent.setTypeface(tf);
    }
}
