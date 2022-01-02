package com.example.work;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Tuberculosis extends AppCompatActivity {
    Button button,button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuberculosis);
        button =findViewById(R.id.tub1);
        button1 =findViewById(R.id.tub2);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Tuberculosis.this,com.example.work.Tuberculosis1.class);
                startActivity(intent);


            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Tuberculosis.this,com.example.work.Tuberculosis2.class);
                startActivity(intent);


            }
        });

    }
}