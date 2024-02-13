package com.example.mcm10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void newactivity  (View view){
        Intent activity2Intent = new Intent(getApplicationContext(), MainActivity2.class);
        startActivity(activity2Intent);
    }
}