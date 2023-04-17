package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart(){
        super.onStart();
//        System.out.println("TEST");
    }

    public void ordersCoffee(View view) {
        Toast.makeText(this, "Welcome to ordering coffee!", Toast.LENGTH_SHORT).show();
    }
}