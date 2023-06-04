package com.example.assignment1;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity3 extends AppCompatActivity {
    TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

    }

    public void showText(View view){
        textview = findViewById(R.id.textViewId);
        textview.setText("copying is stricty PROHIBITED");
    }
}