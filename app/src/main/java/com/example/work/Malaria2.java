package com.example.work;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Malaria2 extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_malaria2);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        button = findViewById(R.id.mal2P1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Malaria2.this,com.example.work.Docone.class);
                startActivity(intent);


            }
        });
    }
}