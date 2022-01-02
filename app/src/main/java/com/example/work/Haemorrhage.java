package com.example.work;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Haemorrhage extends AppCompatActivity {

    Button button,button1,button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_haemorrhage);
        button = findViewById(R.id.Hae1);
        button1 = findViewById(R.id.Hae2);
        button2 = findViewById(R.id.Hae3);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Haemorrhage.this, com.example.work.Haemorrhage1.class);
                startActivity(intent);


            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Haemorrhage.this, com.example.work.Haemorrhage2.class);
                startActivity(intent);


            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Haemorrhage.this, com.example.work.Haemorrhage3.class);
                startActivity(intent);


            }
        });
    }
}