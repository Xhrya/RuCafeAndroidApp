package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class storeOrderActivity extends AppCompatActivity {

    Intent intent = getIntent();

    ListView storeOrdersList;
    TextView subtotalText;
    TextView taxText;

    TextView totalText;
    Button removeSelectedItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initialView();



    }

    protected void initialView()
    {

    }
}
