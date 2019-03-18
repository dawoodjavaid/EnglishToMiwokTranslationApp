package com.example.miwokapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView Numbers, Family, Colors, Phrases;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Numbers = findViewById(R.id.NumbersCategoryTv);
        Family = findViewById(R.id.FamilyCategoryTv);
        Colors = findViewById(R.id.ColorsCategoryTv);
        Phrases = findViewById(R.id.PhrasesCategory);
        Numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intent = new Intent(MainActivity.this,Numbers.class);
                NewActivity(intent);

            }
        });

            Family.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    intent = new Intent(MainActivity.this,Family.class);
                    NewActivity(intent);
                }
            });


            Colors.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    intent = new Intent(MainActivity.this,Colors.class);
                    NewActivity(intent);
                }
            });

            Phrases.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    intent = new Intent(MainActivity.this,Phrases.class);
                    NewActivity(intent);
                }
            });
    }

    public void NewActivity(Intent intent){
        startActivity(intent);
    }

}
