package com.example.nahid.kushtiadistrict;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

public class myselfInfo extends AppCompatActivity {
    ImageView imageView;
    TextView developer,info;
    ScrollView scrollView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myself_info);

        imageView = findViewById(R.id.myself_image);
        scrollView1 = findViewById(R.id.scrollView1);
        developer = findViewById(R.id.developer);
        info = findViewById(R.id.info);

        Typeface tf = Typeface.createFromAsset(getAssets(),
                "fonts/Siyamrupali.ttf");

        developer.setTypeface(tf);
        info.setTypeface(tf);

    }
}
