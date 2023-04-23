package com.example.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class donutsViewActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Intent intent = getIntent();
    private int quanitity = 1;

    Button orderDonut;
    Spinner quantitySelection;
    RecyclerView recyclerView;

    //call Donuts class and etc
    String donutFlavor;

    String flavors[];
    int images[] = {R.drawable.cakedonuts, R.drawable.donutholes, R.drawable.food};


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

        Spinner quantitySelection = findViewById(R.id.quantitySelection);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.quantities, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        quantitySelection.setAdapter(adapter);
        quantitySelection.setOnItemSelectedListener(this);

        recyclerView = findViewById(R.id.recyclerView);
        flavors = getResources().getStringArray(R.array.donutFlavors);
        MyAdapter myAdapter = new MyAdapter(this, flavors, images);


    }



    public double displayPrice()
    {
           double total =0;


           return total;
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String text = adapterView.getItemAtPosition(i).toString();
        Toast.makeText(adapterView.getContext(), text, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    public void onAddDonut()
    {
        quanitity = quantitySelection.getId();

    }
}