package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.btnOpenAct2);
        button.setOnClickListener(new View.OnClickListener())
        {
            @Override
                    public void onClick(View v)
            {
                Intent intent = new Intent(this, donutsViewActivity.class );
                startActivity(intent);
            }
    }

    @Override
    protected void onStart(){
        super.onStart();
//        System.out.println("TEST");
    }

    public void ordersCoffee(View view) {
        Toast.makeText(this, "Welcome to ordering coffee!", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, coffeeViewActivity.class);
        startActivity(intent);
    }

    public void ordersDonut(View view2)
    {

        Toast.makeText(this, "Welcome to ordering donuts!", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, donutsViewActivity.class);
        startActivity(intent);
    }


}