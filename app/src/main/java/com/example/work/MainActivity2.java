package com.example.work;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    ListView listView;
    SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        listView = findViewById(R.id.listViewId);
        searchView = findViewById(R.id.searchViewId);
        String[] Disease_Name = getResources().getStringArray(R.array.Disease);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity2.this,R.layout.sample_view,R.id.textViewId,Disease_Name);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String value1 = adapter.getItem(position);
                if (value1.equals("Fever")){
                    String value = Disease_Name[position];
                    Intent intent = new Intent(MainActivity2.this, com.example.work.Fever.class);
                    startActivity(intent);
                }
                if (value1.equals("Cold")){
                    String value = Disease_Name[position];
                    Intent intent = new Intent(MainActivity2.this, com.example.work.Cold.class);
                    startActivity(intent);
                }
                if (value1.equals("Cough")){
                    String value = Disease_Name[position];
                    Intent intent = new Intent(MainActivity2.this, com.example.work.Cough.class);
                    startActivity(intent);
                }
                if (value1.equals("Diarrhoea")){
                    String value = Disease_Name[position];
                    Intent intent = new Intent(MainActivity2.this, com.example.work.Diarrhoea.class);
                    startActivity(intent);
                }
                if (value1.equals("Anxiety")){
                    String value = Disease_Name[position];
                    Intent intent = new Intent(MainActivity2.this, com.example.work.Anxiety.class);
                    startActivity(intent);
                }
                if (value1.equals("Chickenpox")){
                    String value = Disease_Name[position];
                    Intent intent = new Intent(MainActivity2.this, com.example.work.Chickenpox.class);
                    startActivity(intent);
                }
                if (value1.equals("Allergy")){
                    String value = Disease_Name[position];
                    Intent intent = new Intent(MainActivity2.this, com.example.work.Allergy.class);
                    startActivity(intent);
                }
                if (value1.equals("Malaria")){
                    String value = Disease_Name[position];
                    Intent intent = new Intent(MainActivity2.this, com.example.work.malaria.class);
                    startActivity(intent);
                }
                if (value1.equals("Tuberculosis")){
                    String value = Disease_Name[position];
                    Intent intent = new Intent(MainActivity2.this, com.example.work.Tuberculosis.class);
                    startActivity(intent);
                }
                if (value1.equals("Acne")){
                    String value = Disease_Name[position];
                    Intent intent = new Intent(MainActivity2.this, com.example.work.Acne.class);
                    startActivity(intent);
                }
                if (value1.equals("Annaemia")){
                    String value = Disease_Name[position];
                    Intent intent = new Intent(MainActivity2.this, com.example.work.Annaemia.class);
                    startActivity(intent);
                }
                if (value1.equals("Anaesthesia")){
                    String value = Disease_Name[position];
                    Intent intent = new Intent(MainActivity2.this, com.example.work.Anaesthesia.class);
                    startActivity(intent);
                }
                if (value1.equals("Aanl Fissure")){
                    String value = Disease_Name[position];
                    Intent intent = new Intent(MainActivity2.this, com.example.work.AanlFissure.class);
                    startActivity(intent);
                }
                if (value1.equals("Haemorrhage")){
                    String value = Disease_Name[position];
                    Intent intent = new Intent(MainActivity2.this, com.example.work.Haemorrhage.class);
                    startActivity(intent);
                }
                if (value1.equals("Hair Loss")){
                    String value = Disease_Name[position];
                    Intent intent = new Intent(MainActivity2.this, com.example.work.HairLoss.class);
                    startActivity(intent);
                }
                if (value1.equals("Headache")){
                    String value = Disease_Name[position];
                    Intent intent = new Intent(MainActivity2.this, com.example.work.Headache.class);
                    startActivity(intent);
                }
                if (value1.equals("Gastric Problem")){
                    String value = Disease_Name[position];
                    Intent intent = new Intent(MainActivity2.this, com.example.work.GastricProblem.class);
                    startActivity(intent);
                }
                if (value1.equals("Dry Skin")){
                    String value = Disease_Name[position];
                    Intent intent = new Intent(MainActivity2.this, com.example.work.DrySkin.class);
                    startActivity(intent);
                }
                if (value1.equals("Gum Disease")){
                    String value = Disease_Name[position];
                    Intent intent = new Intent(MainActivity2.this, com.example.work.GumDisease.class);
                    startActivity(intent);
                }
                if (value1.equals("Gum Sore")){
                    String value = Disease_Name[position];
                    Intent intent = new Intent(MainActivity2.this, com.example.work.GumSore.class);
                    startActivity(intent);
                }

            }
        });

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                if(newText.isEmpty()){
                    listView.setVisibility(View.GONE);
                }else {
                    listView.setVisibility(View.VISIBLE);
                }
                adapter.getFilter().filter(newText);
                return false;
            }
        });
    }
}