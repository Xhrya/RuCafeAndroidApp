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

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;


public class donutsViewActivity extends AppCompatActivity implements DonutAdapter.OnDonutClickListener {

    Intent intent = getIntent();
    private int quanitity;
    ArrayList<Donuts> officialDonutsList;


    Button orderDonut;
    Spinner quantitySelection;
    RecyclerView recyclerView;


    TextView particularDonutPrice;
    Button addDonut;
    TextView subtotal;

    DonutAdapter adapter;
    ArrayList<Donuts> donutList = new ArrayList<>();


    String flavors[], type[];
    int images[] = {R.drawable.cakedonuts, R.drawable.cakedonuts,R.drawable.cakedonuts, R.drawable.donutholes, R.drawable.donutholes, R.drawable.donutholes, R.drawable.food,  R.drawable.food,  R.drawable.food};



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



        Spinner quantitySelection = findViewById(R.id.quantitySelection);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.quantities, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        quantitySelection.setAdapter(adapter);
        quantitySelection.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) this);



        donutList.add(new Donuts("Donut Holes", "Strawberry", R.drawable.donutholes));
        donutList.add(new Donuts("Donut Holes", "Mint", R.drawable.donutholes));
        donutList.add(new Donuts("Yeast Holes", "Strawberry", R.drawable.food));
        donutList.add(new Donuts("Yeast Holes", "Chocolate", R.drawable.food));
        donutList.add(new Donuts("Yeast Holes", "Mint", R.drawable.food));
        donutList.add(new Donuts("Cake Donuts", "Strawberry", R.drawable.food));
        donutList.add(new Donuts("Cake Donuts", "Chocolate", R.drawable.food));
        donutList.add(new Donuts("Cake Donuts", "Mint", R.drawable.food));

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        //adapter = new DonutAdapterA(donutList, this);
        adapter = new DonutAdapter(donutList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);



//        ArrayAdapter<CharSequence> finalAdapter = adapter;
////        addDonut.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View view) {
////                if(finalAdapter.getSelected() != null)
////                {
////                    showToast(finalAdapter.getSelected().getName());
////                }
////                else {
////                    showToast("No Selected");
////                }
////            }
////        });

    }

    @Override
    public void onDonutClick(Donuts donut)
    {
        Donuts selectDonut = new Donuts(donut.donutFlavor, donut.donutType, donut.image);
    }

    private void addDonut(Donuts donut)
    {
        officialDonutsList = new ArrayList<>();
        officialDonutsList.add(donut);
    }



    private void showToast(String msg)
    {
        Toast.makeText(this,msg, Toast.LENGTH_LONG).show();
    }



//
//
//    @Override
//    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
//        String text = adapterView.getItemAtPosition(i).toString();
//        Toast.makeText(adapterView.getContext(), text, Toast.LENGTH_SHORT).show();
//    }
//
//    @Override
//    public void onNothingSelected(AdapterView<?> adapterView) {
//
//    }


//
//    public void onAddDonutClick()
//    {
//        quanitity = quantitySelection.getId();
//        onDisplayPrice();
//
//
//        double total = displayTotalPrice();
//        subtotal.setText("$" + String.format("%.2f",total));
//
//
//    }

    public double displayTotalPrice()
    {
        double total =0;
        for(int i =0; i<officialDonutsList.size(); i++)
        {
            total+= officialDonutsList.get(i).donutPriceWithQuantity();
        }

        total = Double.parseDouble(String.format("%.2f", total));
        return total;
    }



    public void onAddToBasketClick()
    {
       // donutsPriceTotal.setText("$" + displayTotalPrice());

    }



    public void onDisplayPrice()
    {
        //these donuts Price
        double price = 0;


        particularDonutPrice = findViewById(R.id.donutPrice);
        particularDonutPrice.setText("$" + String.format("%.2f",(price)));


        particularDonutPrice.setText("$" + String.format("%.2f",(price * quantitySelection.getId())));



    }
}