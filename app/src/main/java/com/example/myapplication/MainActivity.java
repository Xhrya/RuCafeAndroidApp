package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class MainActivity extends AppCompatActivity {

    Button coffeeView;
    Button donutsView;

    Button storeOrderView;

    Button basketView;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        donutsView = (Button) findViewById(R.id.orderDonutsButton);
        coffeeView = (Button) findViewById(R.id.orderCoffeeButton);
        storeOrderView = (Button) findViewById(R.id.orderDonutsButton);
        basketView = (Button) findViewById(R.id.myOrderButton);



        donutsView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view2) {
                Toast.makeText(MainActivity.this, "Welcome to ordering donuts!", Toast.LENGTH_SHORT).show();
                Intent intentDonuts = new Intent(MainActivity.this, donutsViewActivity.class);
                startActivity(intentDonuts);
            }

        });

        coffeeView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Welcome to ordering coffee!", Toast.LENGTH_SHORT).show();
                Intent intentCoffee = new Intent(MainActivity.this, coffeeViewActivity.class);
                startActivity(intentCoffee);
            }

        });

//        storeOrderView.setOnClickListener(new View.OnClickListener()
//        {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, "Welcome to store orders!", Toast.LENGTH_SHORT).show();
//                Intent intentStoreOrders = new Intent(MainActivity.this, storeOrderActivity.class);
//                startActivity(intentStoreOrders);
//            }
//
//        });

        basketView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Welcome to your basket!", Toast.LENGTH_SHORT).show();
                Intent intentBasketView = new Intent(MainActivity.this, basketActivity.class);
                startActivity(intentBasketView);
            }

        });
     }


    @Override
    protected void onStart(){
        super.onStart();
//        System.out.println("TEST");
    }

    public void ordersCoffee(View view) {
            Toast.makeText(this, "Welcome to ordering coffee! outside", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, coffeeViewActivity.class);
            startActivity(intent);
    }


    public void ordersDonut(View view2)
    {

        Toast.makeText(this, "Welcome to ordering donuts! outside ", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, donutsViewActivity.class);
        startActivity(intent);
    }


//    @Override
//    public void onClick(View view) {
//        switch(view.getId())
//        {
//            case R.id.orderDonutsButton:
//                Toast.makeText(this, "Ordering Donuts!", Toast.LENGTH_SHORT).show();
//                break;
//
//            case R.id.orderCoffeeButton:
//                Toast.makeText(this, "Ordering Coffee!", Toast.LENGTH_SHORT).show();
//
//                break;
//        }
//
//    }

    public void storeOrdersClick(View view) {
        Toast.makeText(this, "Welcome to store orders!", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, storeOrderActivity.class);
        startActivity(intent);
    }

    public void basketOrders(View view) {
        Toast.makeText(this, "Welcome to basket orders!", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, basketActivity.class);
        startActivity(intent);
    }
}