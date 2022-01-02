package com.example.work;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Fever1 extends AppCompatActivity {
    Button button,button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fever1);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        button = findViewById(R.id.Feverbtn);
        button1 = findViewById(R.id.Feverbtn1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Fever1.this,com.example.work.Docone.class);
                startActivity(intent);


            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Fever1.this,com.example.work.Docone.class);
                startActivity(intent);


            }
        });
    }
}