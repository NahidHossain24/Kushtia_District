package com.example.nahid.kushtiadistrict;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class mirMosharrofContent extends AppCompatActivity {
    TextView textView1_mirMosharrofContent,textView2_mirMosharrofContent,textView3_mirMosharrofContent,textView4_mirMosharrofContent,textView5_mirMosharrofContent,textView6_mirMosharrofContent,textView7_mirMosharrofContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mir_mosharrof_content);

        textView1_mirMosharrofContent = findViewById(R.id.textView1_mirMosharrofContent);
        textView2_mirMosharrofContent = findViewById(R.id.textView2_mirMosharrofContent);
        textView3_mirMosharrofContent = findViewById(R.id.textView3_mirMosharrofContent);
        textView4_mirMosharrofContent = findViewById(R.id.textView4_mirMosharrofContent);
        textView5_mirMosharrofContent = findViewById(R.id.textView5_mirMosharrofContent);
        textView6_mirMosharrofContent = findViewById(R.id.textView6_mirMosharrofContent);
        textView7_mirMosharrofContent = findViewById(R.id.textView7_mirMosharrofContent);

        Typeface tf = Typeface.createFromAsset(getAssets(),
                "fonts/Siyamrupali.ttf");

        textView1_mirMosharrofContent.setTypeface(tf);
        textView2_mirMosharrofContent.setTypeface(tf);
        textView3_mirMosharrofContent.setTypeface(tf);
        textView4_mirMosharrofContent.setTypeface(tf);
        textView5_mirMosharrofContent.setTypeface(tf);
        textView6_mirMosharrofContent.setTypeface(tf);
        textView7_mirMosharrofContent.setTypeface(tf);
    }
}
