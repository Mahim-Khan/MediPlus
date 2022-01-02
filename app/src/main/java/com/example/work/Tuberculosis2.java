package com.example.work;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Tuberculosis2 extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuberculosis2);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        button =findViewById(R.id.tub1P2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Tuberculosis2.this,com.example.work.Docone.class);
                startActivity(intent);


            }
        });
    }
}