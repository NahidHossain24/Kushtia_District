package com.example.nahid.kushtiadistrict;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class azizurRahmanContent extends AppCompatActivity {

    TextView textView1_azizurRahmanContent,textView2_azizurRahmanContent,textView3_azizurRahmanContent,textView4_azizurRahmanContent,textView5_azizurRahmanContent,textView6_azizurRahmanContent,textView7_azizurRahmanContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_azizur_rahman_content);

        textView1_azizurRahmanContent = findViewById(R.id.textView1_azizurRahmanContent);
        textView2_azizurRahmanContent = findViewById(R.id.textView2_azizurRahmanContent);
        textView3_azizurRahmanContent = findViewById(R.id.textView3_azizurRahmanContent);
        textView4_azizurRahmanContent = findViewById(R.id.textView4_azizurRahmanContent);
        textView5_azizurRahmanContent = findViewById(R.id.textView5_azizurRahmanContent);
        textView6_azizurRahmanContent = findViewById(R.id.textView6_azizurRahmanContent);
        textView7_azizurRahmanContent = findViewById(R.id.textView7_azizurRahmanContent);


        Typeface tf = Typeface.createFromAsset(getAssets(),"fonts/Siyamrupali.ttf");

        textView1_azizurRahmanContent.setTypeface(tf);
        textView2_azizurRahmanContent.setTypeface(tf);
        textView3_azizurRahmanContent.setTypeface(tf);
        textView4_azizurRahmanContent.setTypeface(tf);
        textView5_azizurRahmanContent.setTypeface(tf);
        textView6_azizurRahmanContent.setTypeface(tf);
        textView7_azizurRahmanContent.setTypeface(tf);
    }
}
