package com.example.work;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Contactus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactus);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}