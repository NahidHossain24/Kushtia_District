package com.example.nahid.kushtiadistrict;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class mohoniMohonContent extends AppCompatActivity {

    TextView textView1_mohiniMillsContent,textView2_mohiniMillsContent,textView3_mohiniMillsContent,textView4_mohiniMillsContent,textView5_mohiniMillsContent,textView6_mohiniMillsContent,textView7_mohiniMillsContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mohoni_mohon_content);

        textView1_mohiniMillsContent = findViewById(R.id.textView1_mohiniMillsContent);
        textView2_mohiniMillsContent = findViewById(R.id.textView2_mohiniMillsContent);
        textView3_mohiniMillsContent = findViewById(R.id.textView3_mohiniMillsContent);
        textView4_mohiniMillsContent = findViewById(R.id.textView4_mohiniMillsContent);
        textView5_mohiniMillsContent = findViewById(R.id.textView5_mohiniMillsContent);
        textView6_mohiniMillsContent = findViewById(R.id.textView6_mohiniMillsContent);
        textView7_mohiniMillsContent = findViewById(R.id.textView7_mohiniMillsContent);

        Typeface tf = Typeface.createFromAsset(getAssets(),"fonts/Siyamrupali.ttf");

        textView1_mohiniMillsContent.setTypeface(tf);
        textView2_mohiniMillsContent.setTypeface(tf);
        textView3_mohiniMillsContent.setTypeface(tf);
        textView4_mohiniMillsContent.setTypeface(tf);
        textView5_mohiniMillsContent.setTypeface(tf);
        textView6_mohiniMillsContent.setTypeface(tf);
        textView7_mohiniMillsContent.setTypeface(tf);
    }
}
