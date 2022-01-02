package com.example.work;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class Medicine_details extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicine_details);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        listView = findViewById(R.id.listViewId);
        String[] Disease_Name = getResources().getStringArray(R.array.Disease);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(Medicine_details.this,R.layout.sample_view,R.id.textViewId,Disease_Name);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0){
                    String value = Disease_Name[position];
                    Intent intent = new Intent(Medicine_details.this, com.example.work.Fever1.class);
                    startActivity(intent);
                }
                if (position==1){
                    String value = Disease_Name[position];
                    Intent intent = new Intent(Medicine_details.this, com.example.work.Cold.class);
                    startActivity(intent);
                }
                if (position==2){
                    String value = Disease_Name[position];
                    Intent intent = new Intent(Medicine_details.this, com.example.work.Cough1.class);
                    startActivity(intent);
                }
                if (position==3){
                    String value = Disease_Name[position];
                    Intent intent = new Intent(Medicine_details.this, com.example.work.Diarrhoea1.class);
                    startActivity(intent);
                }
                if (position==4){
                    String value = Disease_Name[position];
                    Intent intent = new Intent(Medicine_details.this,com.example.work. Anxiety1.class);
                    startActivity(intent);
                }
                if (position==5){
                    String value = Disease_Name[position];
                    Intent intent = new Intent(Medicine_details.this, com.example.work.Chickenpox1.class);
                    startActivity(intent);
                }
                if (position==6){
                    String value = Disease_Name[position];
                    Intent intent = new Intent(Medicine_details.this, com.example.work.Allergy1.class);
                    startActivity(intent);
                }
                if (position==7){
                    String value = Disease_Name[position];
                    Intent intent = new Intent(Medicine_details.this, com.example.work.malaria.class);
                    startActivity(intent);
                }
                if (position==8){
                    String value = Disease_Name[position];
                    Intent intent = new Intent(Medicine_details.this, com.example.work.Tuberculosis.class);
                    startActivity(intent);
                }
                if (position==9){
                    String value = Disease_Name[position];
                    Intent intent = new Intent(Medicine_details.this, com.example.work.Acne.class);
                    startActivity(intent);
                }
                if (position==10){
                    String value = Disease_Name[position];
                    Intent intent = new Intent(Medicine_details.this, com.example.work.Annaemia1.class);
                    startActivity(intent);
                }
                if (position==11){
                    String value = Disease_Name[position];
                    Intent intent = new Intent(Medicine_details.this, com.example.work.Anaesthesia1.class);
                    startActivity(intent);
                }
                if (position==12){
                    String value = Disease_Name[position];
                    Intent intent = new Intent(Medicine_details.this, com.example.work.AanlFissure.class);
                    startActivity(intent);
                }
                if (position==13){
                    String value = Disease_Name[position];
                    Intent intent = new Intent(Medicine_details.this, com.example.work.Haemorrhage.class);
                    startActivity(intent);
                }
                if (position==14){
                    String value = Disease_Name[position];
                    Intent intent = new Intent(Medicine_details.this, com.example.work.HairLoss.class);
                    startActivity(intent);
                }
                if (position==15){
                    String value = Disease_Name[position];
                    Intent intent = new Intent(Medicine_details.this, com.example.work.Headache1.class);
                    startActivity(intent);
                }
                if (position==16){
                    String value = Disease_Name[position];
                    Intent intent = new Intent(Medicine_details.this, com.example.work.GastricProblem1.class);
                    startActivity(intent);
                }
                if (position==17){
                    String value = Disease_Name[position];
                    Intent intent = new Intent(Medicine_details.this, com.example.work.DrySkin1.class);
                    startActivity(intent);
                }
                if (position==18){
                    String value = Disease_Name[position];
                    Intent intent = new Intent(Medicine_details.this, com.example.work.GumDisease.class);
                    startActivity(intent);
                }
                if (position==19){
                    String value = Disease_Name[position];
                    Intent intent = new Intent(Medicine_details.this, com.example.work.GumSore1.class);
                    startActivity(intent);
                }
            }
        });

    }
}