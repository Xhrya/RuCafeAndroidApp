package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class donutsViewActivity extends AppCompatActivity {

    Intent intent = getIntent();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donuts_view);
//        button = findViewById(R.id.btnOpenMain);
//        button.setOnClickListener(new View.onClickListener());
//        {
//            @Override
//            public void onClick (View v)
//            {
//                Intent i = new Intent(this, MainActivity.class);
//                startActivity(i);
//            }
//        }
    }

}