package com.example.work;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Allergy1 extends AppCompatActivity {
    Button button1,button2,button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_allergy1);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        button1= findViewById(R.id.btn1D7P1);
        button2 = findViewById(R.id.btn2D7P1);
        button3 = findViewById(R.id.btn3D7P1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Allergy1.this,com.example.work.Docone.class);
                startActivity(intent);


            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Allergy1.this,com.example.work.Docone.class);
                startActivity(intent);


            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Allergy1.this,com.example.work.Docone.class);
                startActivity(intent);


            }
        });
    }
}