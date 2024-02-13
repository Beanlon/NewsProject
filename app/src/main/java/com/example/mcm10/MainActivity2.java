package com.example.mcm10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


    }
    public void newactivity2 (View view){
        Intent activity3intent = new Intent(getApplicationContext(),MainActivity3.class);
        startActivity(activity3intent);
    }
}