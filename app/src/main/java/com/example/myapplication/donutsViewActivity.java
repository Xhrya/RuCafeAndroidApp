package com.example.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class donutsViewActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Intent intent = getIntent();
    private int quanitity = 1;

    private ArrayList<Donuts> donutList = new ArrayList<>();
    private Donuts currentDonut;

    Button orderDonut;
    Spinner quantitySelection;
    RecyclerView recyclerView;


    TextView particularDonutPrice;
    TextView subtotal;

    String flavors[], type[];
    int images[] = {R.drawable.cakedonuts, R.drawable.cakedonuts,R.drawable.cakedonuts, R.drawable.donutholes, R.drawable.donutholes, R.drawable.donutholes, R.drawable.food,  R.drawable.food,  R.drawable.food};

    List<Item> DonutsView;

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
//                startActivity(i);g
//            }
//        }

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        List<Item> items = new ArrayList<Item>();
        items.add(new Item("Donut Holes", "Stawberry", R.drawable.donutholes));
        items.add(new Item("Donut Holes", "Chocolate", R.drawable.donutholes));
        items.add(new Item("Donut Holes", "chocolate", R.drawable.donutholes));
        items.add(new Item("Yeast Holes", "Stawberry", R.drawable.donutholes));
        items.add(new Item("Yeast Holes", "Chocolate", R.drawable.donutholes));


        Spinner quantitySelection = findViewById(R.id.quantitySelection);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.quantities, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        quantitySelection.setAdapter(adapter);
        quantitySelection.setOnItemSelectedListener(this);




        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(), items));

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
        onDisplayPrice();
    }

    public void onAddToBasket()
    {
       // donutsPriceTotal.setText("$" + displayTotalPrice());

    }

    public double displayTotalPrice()
    {
        double total =0;
        for(int i =0; i<donutList.size(); i++)
        {
            total+= donutList.get(i).donutPriceWithQuantity();
        }

        total = Double.parseDouble(String.format("%.2f", total));
        return total;    }

    public void onDisplayPrice()
    {
        double price = 0;


        particularDonutPrice = findViewById(R.id.donutPrice);
        particularDonutPrice.setText("$" + String.format("%.2f",(price)));


        subtotal.setText("$" + String.format("%.2f",(price * quantitySelection.getId())));

    }
}