package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class basketActivity extends AppCompatActivity {
    Intent intent = getIntent();
    Button removeSelected;
    Button placeOrder;
    TextView subTotal;
    TextView tax;
    TextView total;
    ListView ordersList;
    Order currentOrder = new Order();
    double subTotalCost = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basketorders_view);

        removeSelected = findViewById(R.id.removeItemButton);
        placeOrder = findViewById(R.id.orderButton);
        ordersList = findViewById(R.id.listOrders);

        initialView();

        removeSelected.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onRemove();
            }
        });

        placeOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //seralize and export

                Toast.makeText(basketActivity.this, "Your order has been placed!", Toast.LENGTH_SHORT).show();
            }
        });

    }

    protected void initialView(){
        //DESERALIZE HERE

        //        Coffee C = new Coffee();
//        currentOrder.addCoffee(C);

        ArrayAdapter arrayAdapterOrders = new ArrayAdapter(basketActivity.this, android.R.layout.simple_list_item_1, currentOrder.getOrderList());
        ordersList.setAdapter(arrayAdapterOrders);

        subTotal = findViewById(R.id.subtotalText);
        subTotal.setText("$");

        tax = findViewById(R.id.taxText);
        tax.setText("$");

        total = findViewById(R.id.totalText);
        total.setText("$");
    }

    protected void onRemove(){
        subTotal = findViewById(R.id.subtotalText);
        subTotal.setText("$");

        tax = findViewById(R.id.taxText);
        tax.setText("$");

        total = findViewById(R.id.totalText);
        total.setText("$");

        Toast.makeText(basketActivity.this, "Your item has been removed!", Toast.LENGTH_SHORT).show();
    }

}
