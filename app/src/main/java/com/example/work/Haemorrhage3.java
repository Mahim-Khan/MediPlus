package com.example.work;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Haemorrhage3 extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_haemorrhage3);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        button = findViewById(R.id.Hae1P3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Haemorrhage3.this,com.example.work.Docone.class);
                startActivity(intent);


            }
        });
    }
}