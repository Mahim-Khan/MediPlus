package com.example.work;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Diarrhoea1 extends AppCompatActivity {
    Button button,button1,button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diarrhoea1);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        button = findViewById(R.id.btn1D4P1);
        button1 = findViewById(R.id.btn2D4P1);
        button2 = findViewById(R.id.btn3D4P1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Diarrhoea1.this,com.example.work.Docone.class);
                startActivity(intent);


            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Diarrhoea1.this,com.example.work.Docone.class);
                startActivity(intent);


            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Diarrhoea1.this,com.example.work.Docone.class);
                startActivity(intent);


            }
        });
    }
}