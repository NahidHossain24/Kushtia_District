package com.example.nahid.kushtiadistrict;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class robindronathTagoreContent extends AppCompatActivity {
    TextView textView1_tagoreContent,textView2_tagoreContent,textView3_tagoreContent,textView4_tagoreContent,textView5_tagoreContent,textView6_tagoreContent,textView7_tagoreContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_robindronath_tagore_content);

        textView1_tagoreContent = findViewById(R.id.textView1_tagoreContent);
        textView2_tagoreContent = findViewById(R.id.textView2_tagoreContent);
        textView3_tagoreContent = findViewById(R.id.textView3_tagoreContent);
        textView4_tagoreContent = findViewById(R.id.textView4_tagoreContent);
        textView5_tagoreContent = findViewById(R.id.textView5_tagoreContent);
        textView6_tagoreContent = findViewById(R.id.textView6_tagoreContent);
        textView7_tagoreContent = findViewById(R.id.textView7_tagoreContent);

        Typeface tf = Typeface.createFromAsset(getAssets(),
                "fonts/Siyamrupali.ttf");

        textView1_tagoreContent.setTypeface(tf);
        textView2_tagoreContent.setTypeface(tf);
        textView3_tagoreContent.setTypeface(tf);
        textView4_tagoreContent.setTypeface(tf);
        textView5_tagoreContent.setTypeface(tf);
        textView6_tagoreContent.setTypeface(tf);
        textView7_tagoreContent.setTypeface(tf);
    }
}
