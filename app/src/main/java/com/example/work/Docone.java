package com.example.work;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Docone extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_docone);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}