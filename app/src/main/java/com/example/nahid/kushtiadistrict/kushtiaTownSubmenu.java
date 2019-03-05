package com.example.nahid.kushtiadistrict;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class kushtiaTownSubmenu extends AppCompatActivity {
    TextView textView1_KushtiaTownSubmenu,textView2_KushtiaTownSubmenu,textView3_KushtiaTownSubmenu,textView4_KushtiaTownSubmenu,textView5_KushtiaTownSubmenu,textView6_KushtiaTownSubmenu,textView7_KushtiaTownSubmenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kushtia_town_submenu);

        textView1_KushtiaTownSubmenu = findViewById(R.id.textView1_KushtiaTownSubmenu);
        textView2_KushtiaTownSubmenu = findViewById(R.id.textView2_KushtiaTownSubmenu);
        textView3_KushtiaTownSubmenu = findViewById(R.id.textView3_KushtiaTownSubmenu);
        textView4_KushtiaTownSubmenu = findViewById(R.id.textView4_KushtiaTownSubmenu);
        textView5_KushtiaTownSubmenu = findViewById(R.id.textView5_KushtiaTownSubmenu);
        textView6_KushtiaTownSubmenu = findViewById(R.id.textView6_KushtiaTownSubmenu);
        textView7_KushtiaTownSubmenu = findViewById(R.id.textView7_KushtiaTownSubmenu);


        Typeface tf = Typeface.createFromAsset(getAssets(),
                "fonts/Siyamrupali.ttf");

        textView1_KushtiaTownSubmenu.setTypeface(tf);
        textView2_KushtiaTownSubmenu.setTypeface(tf);
        textView3_KushtiaTownSubmenu.setTypeface(tf);
        textView4_KushtiaTownSubmenu.setTypeface(tf);
        textView5_KushtiaTownSubmenu.setTypeface(tf);
        textView6_KushtiaTownSubmenu.setTypeface(tf);
        textView7_KushtiaTownSubmenu.setTypeface(tf);

    }
}
