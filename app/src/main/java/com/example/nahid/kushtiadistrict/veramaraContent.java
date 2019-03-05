package com.example.nahid.kushtiadistrict;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class veramaraContent extends AppCompatActivity {
    TextView textView1_veramaraContent,textView2_veramaraContent,textView3_veramaraContent,textView4_veramaraContent,textView5_veramaraContent,textView6_veramaraContent,textView7_veramaraContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_veramara_content);

        textView1_veramaraContent = findViewById(R.id.textView1_veramaraContent);
        textView2_veramaraContent = findViewById(R.id.textView2_veramaraContent);
        textView3_veramaraContent = findViewById(R.id.textView3_veramaraContent);
        textView4_veramaraContent = findViewById(R.id.textView4_veramaraContent);
        textView5_veramaraContent = findViewById(R.id.textView5_veramaraContent);
        textView6_veramaraContent = findViewById(R.id.textView6_veramaraContent);
        textView7_veramaraContent = findViewById(R.id.textView7_veramaraContent);

        Typeface tf = Typeface.createFromAsset(getAssets(),
                "fonts/Siyamrupali.ttf");

        textView1_veramaraContent.setTypeface(tf);
        textView2_veramaraContent.setTypeface(tf);
        textView3_veramaraContent.setTypeface(tf);
        textView4_veramaraContent.setTypeface(tf);
        textView5_veramaraContent.setTypeface(tf);
        textView6_veramaraContent.setTypeface(tf);
        textView7_veramaraContent.setTypeface(tf);

    }
}
