package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button coffeeView;
    Button donutsView;

    Button storeOrderView;

    Button basketView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        coffeeView = (Button) findViewById(R.id.orderCoffeeButton);
        coffeeView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Welcome to ordering coffee!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, coffeeViewActivity.class);
                startActivity(intent);
            }

        });



        donutsView = (Button) findViewById(R.id.orderDonutsButton);
        donutsView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Welcome to ordering donuts!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, coffeeViewActivity.class);
                startActivity(intent);
            }

        });

        storeOrderView = (Button) findViewById(R.id.orderDonutsButton);
        storeOrderView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Welcome to store orders!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, coffeeViewActivity.class);
                startActivity(intent);
            }

        });

        basketView = (Button) findViewById(R.id.orderDonutsButton);
        basketView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Welcome to your basket!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, coffeeViewActivity.class);
                startActivity(intent);
            }

        });
     }


    @Override
    protected void onStart(){
        super.onStart();
//        System.out.println("TEST");
    }

//    public void ordersCoffee(View view) {
//            Toast.makeText(this, "Welcome to ordering coffee!", Toast.LENGTH_SHORT).show();
//            Intent intent = new Intent(this, coffeeViewActivity.class);
//            startActivity(intent);
//    }
//
//    public void ordersDonut(View view2)
//    {
//
//        Toast.makeText(this, "Welcome to ordering donuts!", Toast.LENGTH_SHORT).show();
//        Intent intent = new Intent(this, donutsViewActivity.class);
//        startActivity(intent);
//    }


}