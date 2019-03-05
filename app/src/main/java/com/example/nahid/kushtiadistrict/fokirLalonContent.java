package com.example.nahid.kushtiadistrict;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class fokirLalonContent extends AppCompatActivity {

    TextView textView1_fokirLalonContent,textView2_fokirLalonContent,textView3_fokirLalonContent,textView4_fokirLalonContent,textView5_fokirLalonContent,textView6_fokirLalonContent,textView7_fokirLalonContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fokir_lalon_content);

        textView1_fokirLalonContent = findViewById(R.id.textView1_fokirLalonContent);
        textView2_fokirLalonContent = findViewById(R.id.textView2_fokirLalonContent);
        textView3_fokirLalonContent = findViewById(R.id.textView3_fokirLalonContent);
        textView4_fokirLalonContent = findViewById(R.id.textView4_fokirLalonContent);
        textView5_fokirLalonContent = findViewById(R.id.textView5_fokirLalonContent);
        textView6_fokirLalonContent = findViewById(R.id.textView6_fokirLalonContent);
        textView7_fokirLalonContent = findViewById(R.id.textView7_fokirLalonContent);


        Typeface tf = Typeface.createFromAsset(getAssets(),
                "fonts/Siyamrupali.ttf");

        textView1_fokirLalonContent.setTypeface(tf);
        textView2_fokirLalonContent.setTypeface(tf);
        textView3_fokirLalonContent.setTypeface(tf);
        textView4_fokirLalonContent.setTypeface(tf);
        textView5_fokirLalonContent.setTypeface(tf);
        textView6_fokirLalonContent.setTypeface(tf);
        textView7_fokirLalonContent.setTypeface(tf);
    }
}
