package com.example.work;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class GastricProblem1 extends AppCompatActivity {
    Button button,button1,button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gastric_problem1);
        button = findViewById(R.id.Gas1P1);
        button1 = findViewById(R.id.Gas1P2);
        button2 = findViewById(R.id.Gas1P3);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GastricProblem1.this,com.example.work.Docone.class);
                startActivity(intent);


            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GastricProblem1.this,com.example.work.Docone.class);
                startActivity(intent);


            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GastricProblem1.this,com.example.work.Docone.class);
                startActivity(intent);


            }
        });
    }
}