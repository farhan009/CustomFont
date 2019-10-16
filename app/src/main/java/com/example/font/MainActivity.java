package com.example.font;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView text1, text2, text3, text4, text5;
    private Typeface typeface1, typeface2, typeface3, typeface4, typeface5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1 = findViewById(R.id.textView1_id);
        text2 = findViewById(R.id.textView2_id);
        text3 = findViewById(R.id.textView3_id);
        text4 = findViewById(R.id.textView4_id);
        text5 = findViewById(R.id.textView5_id);

        typeface1 = Typeface.createFromAsset(getAssets(), "Acme_Regular.ttf");
        typeface2 = Typeface.createFromAsset(getAssets(), "Grenze_Regular.ttf");
        typeface3 = Typeface.createFromAsset(getAssets(), "FiraSansCondensed_Regular.ttf");
        typeface4 = Typeface.createFromAsset(getAssets(), "Inconsolata_Regular.ttf");
        typeface5 = Typeface.createFromAsset(getAssets(), "Cinzel_Regular.ttf");

        text1.setTypeface(typeface1);
        text2.setTypeface(typeface2);
        text3.setTypeface(typeface3);
        text4.setTypeface(typeface4);
        text5.setTypeface(typeface5);

    }
}
