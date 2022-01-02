package com.example.work;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class GumDisease2 extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gum_disease2);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        button = findViewById(R.id.GumD1P3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GumDisease2.this,com.example.work.Docone.class);
                startActivity(intent);


            }
        });
    }
}