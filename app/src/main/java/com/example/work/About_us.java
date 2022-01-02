package com.example.work;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class About_us extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        listView = findViewById(R.id.listViewabt);
        String[] about_us = getResources().getStringArray(R.array.Contact_info);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(About_us.this,R.layout.sampleview2,R.id.textView1,about_us);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0){
                    String value = about_us[position];

                }
                if (position==1){
                    String value = about_us[position];

                }
            }
        });

    }
}