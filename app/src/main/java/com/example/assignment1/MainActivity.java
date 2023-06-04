package com.example.assignment1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView list_view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list_view = findViewById(R.id.lvId);

        final ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Activity 1");
        arrayList.add("Activity 2");
        arrayList.add("Activity 3");

        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1, arrayList);

        list_view.setAdapter(arrayAdapter);

        list_view.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0){
                    startActivity(new Intent(MainActivity.this, Activity1.class));
                    Toast.makeText(MainActivity.this, "Fist activity is running" + arrayList.get(position), Toast.LENGTH_SHORT).show();
                }
                else if (position == 1) {
                    startActivity(new Intent(MainActivity.this, Activity2.class));
                    Toast.makeText(MainActivity.this, "Second activity is running" + arrayList.get(position), Toast.LENGTH_SHORT).show();
                }
                else{
                    startActivity(new Intent(MainActivity.this, Activity3.class));
                    Toast.makeText(MainActivity.this, "Third activity is running" + arrayList.get(position), Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}