package com.example.myapplication;

import static com.example.myapplication.storeOrderActivity.currentStoreOrders;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.jetbrains.annotations.NotNull;
import org.w3c.dom.Text;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class basketActivity extends AppCompatActivity {
    Button placeOrder;
    TextView subTotal;
    TextView tax;
    TextView total;
    ListView ordersList;
    ArrayAdapter arrayAdapterOrders;
    public static Order currentOrder = new Order();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basketorders_view);

//        removeSelected = findViewById(R.id.removeItemButton);
        placeOrder = findViewById(R.id.orderButton);
        ordersList = findViewById(R.id.listOrders);


        arrayAdapterOrders = new ArrayAdapter(basketActivity.this, R.layout.basket_item, R.id.orderedItemName, currentOrder.getOrderList()){
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
                if(convertView == null){
                    convertView = LayoutInflater.from(getContext()).inflate(R.layout.basket_item, parent, false);
                }

                View view = super.getView(position, convertView, parent);
                Button removeSelected = convertView.findViewById(R.id.removeOrderItembutton);
                removeSelected.setOnClickListener(v -> removeItem(position));

                return view;
            }
        };
        ordersList.setAdapter(arrayAdapterOrders);
        displayPrices();


        placeOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentOrder.setTotalPrice(displayPrices());
                currentStoreOrders.add(currentOrder);
                //empty the order here
                Toast.makeText(basketActivity.this, "Your order has been placed!", Toast.LENGTH_SHORT).show();
            }
        });

    }

    protected void removeItem(int indexRemove){
        currentOrder.getOrderList().remove(indexRemove);
        displayPrices();
        Toast.makeText(basketActivity.this, "Your item has been removed!", Toast.LENGTH_SHORT).show();
        arrayAdapterOrders.notifyDataSetChanged();

    }

    protected double displayPrices(){
        Double displayInitialPrice = 0.0;
        subTotal = findViewById(R.id.subtotalText);
        ArrayList<MenuItem> temp = currentOrder.getOrderList();
        for (MenuItem orderItem: temp) {
            displayInitialPrice += orderItem.itemPrice();
        }
        subTotal.setText(String.format("$%.2f",(displayInitialPrice)));

        tax = findViewById(R.id.taxText);
        tax.setText(String.format("$%.2f",(displayInitialPrice*.06625)));

        total = findViewById(R.id.totalText);
        total.setText(String.format("$%.2f",(displayInitialPrice*1.06625)));

        return displayInitialPrice;
    }

}
