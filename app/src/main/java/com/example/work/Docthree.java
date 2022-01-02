package com.example.work;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Docthree extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_docthree);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}