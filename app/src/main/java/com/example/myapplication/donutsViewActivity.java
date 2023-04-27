package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import static com.example.myapplication.basketActivity.currentOrder;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
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


public class donutsViewActivity extends AppCompatActivity {

    Intent intent = getIntent();

    TextView subtotal;

    DonutAdapter adapterDonut;

    Button addDonutButton;
    Button addToBasketButton;

    private List<Donuts> donutList;
    private List<Donuts> currentOrderList;

    String flavors[], type[];
    int images[] = {R.drawable.cakedonuts, R.drawable.cakedonuts, R.drawable.cakedonuts, R.drawable.donutholes, R.drawable.donutholes, R.drawable.donutholes, R.drawable.food, R.drawable.food, R.drawable.food};


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


//
//        Spinner quantitySelection = findViewById(R.id.quantitySelection);
//        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.quantities, android.R.layout.simple_spinner_item);
//        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        quantitySelection.setAdapter(adapter);
//        quantitySelection.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) this);


        donutList = new ArrayList<>();
        donutList.add(new Donuts("Donut Holes", "Strawberry", R.drawable.donutholes));
        donutList.add(new Donuts("Donut Holes", "Mint", R.drawable.donutholes));
        donutList.add(new Donuts("Donut Holes", "Chocolate", R.drawable.donutholes));
        donutList.add(new Donuts("Yeast Donuts", "Strawberry", R.drawable.food));
        donutList.add(new Donuts("Yeast Donuts", "Chocolate", R.drawable.food));
        donutList.add(new Donuts("Yeast Donuts", "Mint", R.drawable.food));
        donutList.add(new Donuts("Cake Donuts", "Strawberry", R.drawable.food));
        donutList.add(new Donuts("Cake Donuts", "Chocolate", R.drawable.food));
        donutList.add(new Donuts("Cake Donuts", "Mint", R.drawable.food));

        adapterDonut = new DonutAdapter(donutList, this);
        RecyclerView recyclerView = findViewById(R.id.donutRecyclerView);
        //adapter = new DonutAdapterA(donutList, this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapterDonut);

        addDonutButton = findViewById(R.id.addDonutButton);
        addToBasketButton = findViewById(R.id.addToBasketButton);

        //Button addDonut = findViewById(R.id.addDonut);

        currentOrderList = new ArrayList<>();


        addDonutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                displayTotalPrice();
              //get type, flavor, and quantity

                Donuts newDonut = new Donuts("Yeast", "Strawberry", 4);
                currentOrderList.add(newDonut);
                Toast.makeText(donutsViewActivity.this, "Added to donut list", Toast.LENGTH_SHORT).show();

            }
        });

        addToBasketButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for(int i =0; i< currentOrderList.size(); i++)
                {
                    Donuts donut = donutList.get(i);
                    int quantity = donut.getQuantity();

                    Donuts addThis = new Donuts(donut.getType(), donut.donutFlavor, quantity);
                    if(quantity >0)
                    {
                        //Order order = new Order(donut, quantity);
                        currentOrder.addDonut(addThis);
                    }
                }

                Toast.makeText(donutsViewActivity.this, "Added to Order", Toast.LENGTH_SHORT).show();


            }
        });

    }


    public void displayTotalPrice() {
        double total = 0;
        for (int i = 0; i < currentOrderList.size(); i++) {
            total += donutList.get(i).donutPriceWithQuantity();
        }

        total = Double.parseDouble(String.format("%.2f", total));


        subtotal = findViewById(R.id.subtotal);
        subtotal.setText("$" + total);
    }

    public void onAddToBasket(List<Order> currentOrderList) {
        {
//        Intent intent = new Intent(this, basketActivity.class);
//        intent.putExtra("orderList", orderList);
//        startActivity(intent);
        }


//    public void onDisplayPrice()
//    {
//        //these donuts Price
//        double price=0;
//
//
//        particularDonutPrice = findViewById(R.id.donutPrice);
//        particularDonutPrice.setText("$" + String.format("%.2f",(price)));
//
//        particularDonutPrice.setText("$" + String.format("%.2f",(price * quantitySelection.getId())));
//
//
//
//    }
    }
}