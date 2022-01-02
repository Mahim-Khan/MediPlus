package com.example.work;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class AanlFissure extends AppCompatActivity {
    Button button,button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aanl_fissure);
        button = findViewById(R.id.Aanl1);
        button1 = findViewById(R.id.Aanl2);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AanlFissure.this, com.example.work.AanlFissure1.class);
                startActivity(intent);


            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AanlFissure.this,com.example.work.AanlFissure2.class);
                startActivity(intent);


            }
        });
    }
}