package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class storeOrderActivity extends AppCompatActivity {

    public static ArrayList<Order> currentStoreOrders = new ArrayList<>();
    ListView storeListOrders;
    TextView subtotalText;
    TextView taxText;

    TextView totalText;
    Button saveExportButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        subtotalText = findViewById(R.id.subtotalText);
        taxText = findViewById(R.id.taxText);
        totalText = findViewById(R.id.totalText);
        saveExportButton = findViewById(R.id.SaveAndExport);

        storeListOrders = findViewById(R.id.storeOrdersList);
        ArrayAdapter storeOrderAdapter = new ArrayAdapter(storeOrderActivity.this, android.R.layout.simple_list_item_1, currentStoreOrders.toArray());
        storeListOrders.setAdapter(storeOrderAdapter);
        displayPrices();
    }

        protected void displayPrices(){
        Double totalOrdersPriceInit = 0.0;

        for (Order singleOrder: currentStoreOrders) {
            totalOrdersPriceInit += singleOrder.getTotalPrice();
        }
        subtotalText.setText(String.format("$%.2f",(totalOrdersPriceInit)));

        taxText.setText(String.format("$%.2f",(totalOrdersPriceInit*.06625)));

        totalText.setText(String.format("$%.2f",(totalOrdersPriceInit*1.06625)));
    }

}
