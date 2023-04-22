package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class coffeeViewActivity extends AppCompatActivity {
    ArrayList addIns = new ArrayList();
    private int quantity = 1;
    RadioGroup sizeGroup;
    Button orderCoffee;
    CheckBox isSC;
    CheckBox isFV;
    CheckBox isMocha;
    CheckBox isCaramel;
    CheckBox isIC;
    TextView temp;
    Spinner spinner;
    private String [] quantityVal = {"1", "2", "3", "4", "5"};
    private ArrayAdapter<String> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        spinner = findViewById(R.id.spinner);
//        adapter = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, quantityVal);
//        spinner.setAdapter(adapter); //dynamically set the adapter that associates with the list of String.


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coffee_view);

        sizeGroup = findViewById(R.id.sizeRadioGroup);
        orderCoffee = findViewById(R.id.placeOrderButton);
        isSC = findViewById(R.id.sweetCreamBox);
        isFV = findViewById(R.id.FVBox);
        isMocha = findViewById(R.id.mochaBox);
        isCaramel = findViewById(R.id.caramelBox);
        isIC = findViewById(R.id.ICBox);

        //THIS CREATES THE FINAL DONUT OBJECT
        orderCoffee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String size = "";


                //getting the size
                try{
                    int check = sizeGroup.getCheckedRadioButtonId();
                    orderCoffee = findViewById(check);
                    size = orderCoffee.getText().toString();
                }catch(NullPointerException n){
                    Toast.makeText(coffeeViewActivity.this, "You must select a size!", Toast.LENGTH_SHORT).show();
                    return;
                }

                //getting the add-ins
                if(isSC.isChecked()){
                    addIns.add(AddIns.SWEETCREAM);
                }
                if(isFV.isChecked()){
                    addIns.add(AddIns.FRENCHVANILLA);
                }
                if(isIC.isChecked()){
                    addIns.add(AddIns.IRISHCREAM);
                }
                if(isCaramel.isChecked()){
                    addIns.add(AddIns.CARAMEL);
                }
                if(isMocha.isChecked()){
                    addIns.add(AddIns.MOCHA);
                }
                double price = (displayPrice()/quantity);
                for(int i=0; i<quantity; i++) {
                    Coffee newCoffee = new Coffee(size, addIns, price);
                }

//                Toast.makeText(coffeeViewActivity.this, "SWWWWEEET!" + size, Toast.LENGTH_SHORT).show();
                Toast.makeText(coffeeViewActivity.this, "Your order has been placed!", Toast.LENGTH_SHORT).show();
            }
        });

//        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { //event handler below
//            @Override
//            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
//                quantity = Integer.parseInt(spinner.getSelectedItem().toString());
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> adapterView) {
//
//            }
//        });

        //THESE HELP KEEP THE RUNNING TOTAL IN CHECK
        sizeGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    int check = sizeGroup.getCheckedRadioButtonId();
                    orderCoffee = findViewById(check);
                }catch(NullPointerException n){
                    Toast.makeText(coffeeViewActivity.this, "You must select a size!", Toast.LENGTH_SHORT).show();
                    return;
                }
                isSC = findViewById(R.id.sweetCreamBox);
                isFV = findViewById(R.id.FVBox);
                isMocha = findViewById(R.id.mochaBox);
                isCaramel = findViewById(R.id.caramelBox);
                isIC = findViewById(R.id.ICBox);
                displayPrice();
            }
        });

        isSC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    int check = sizeGroup.getCheckedRadioButtonId();
                    orderCoffee = findViewById(check);
                }catch(NullPointerException n){
                    Toast.makeText(coffeeViewActivity.this, "You must select a size!", Toast.LENGTH_SHORT).show();
                    return;
                }
                isSC = findViewById(R.id.sweetCreamBox);
                isFV = findViewById(R.id.FVBox);
                isMocha = findViewById(R.id.mochaBox);
                isCaramel = findViewById(R.id.caramelBox);
                isIC = findViewById(R.id.ICBox);
                displayPrice();
            }
        });

        isFV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    int check = sizeGroup.getCheckedRadioButtonId();
                    orderCoffee = findViewById(check);
                }catch(NullPointerException n){
                    Toast.makeText(coffeeViewActivity.this, "You must select a size!", Toast.LENGTH_SHORT).show();
                    return;
                }
                isSC = findViewById(R.id.sweetCreamBox);
                isFV = findViewById(R.id.FVBox);
                isMocha = findViewById(R.id.mochaBox);
                isCaramel = findViewById(R.id.caramelBox);
                isIC = findViewById(R.id.ICBox);
                displayPrice();
            }
        });


        isMocha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    int check = sizeGroup.getCheckedRadioButtonId();
                    orderCoffee = findViewById(check);
                }catch(NullPointerException n){
                    Toast.makeText(coffeeViewActivity.this, "You must select a size!", Toast.LENGTH_SHORT).show();
                    return;
                }
                isSC = findViewById(R.id.sweetCreamBox);
                isFV = findViewById(R.id.FVBox);
                isMocha = findViewById(R.id.mochaBox);
                isCaramel = findViewById(R.id.caramelBox);
                isIC = findViewById(R.id.ICBox);
                displayPrice();
            }
        });

        isCaramel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    int check = sizeGroup.getCheckedRadioButtonId();
                    orderCoffee = findViewById(check);
                }catch(NullPointerException n){
                    Toast.makeText(coffeeViewActivity.this, "You must select a size!", Toast.LENGTH_SHORT).show();
                    return;
                }
                isSC = findViewById(R.id.sweetCreamBox);
                isFV = findViewById(R.id.FVBox);
                isMocha = findViewById(R.id.mochaBox);
                isCaramel = findViewById(R.id.caramelBox);
                isIC = findViewById(R.id.ICBox);
                displayPrice();
            }
        });

        isIC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    int check = sizeGroup.getCheckedRadioButtonId();
                    orderCoffee = findViewById(check);
                }catch(NullPointerException n){
                    Toast.makeText(coffeeViewActivity.this, "You must select a size!", Toast.LENGTH_SHORT).show();
                    return;
                }
                isSC = findViewById(R.id.sweetCreamBox);
                isFV = findViewById(R.id.FVBox);
                isMocha = findViewById(R.id.mochaBox);
                isCaramel = findViewById(R.id.caramelBox);
                isIC = findViewById(R.id.ICBox);
                displayPrice();
            }
        });

    }

    public double displayPrice(){
        double price = 0.0;

        //getting the size
        try{
            int check = sizeGroup.getCheckedRadioButtonId();
            orderCoffee = findViewById(check);
            if(orderCoffee.getText().toString().equals("Short")){
                price+= 1.89;
            }else if(orderCoffee.getText().toString().equals("Tall")){
                price+= 2.29;
            }else if(orderCoffee.getText().toString().equals("Grande")){
                price+= 2.69;
            }else if(orderCoffee.getText().toString().equals("Venti")){
                price+= 3.09;
            }
        }catch(NullPointerException n){
            Toast.makeText(coffeeViewActivity.this, "You must select a size!", Toast.LENGTH_SHORT).show();
            return 0.0;
        }

        if(isSC.isChecked()){
            price += AddIns.SWEETCREAM.getPrice();
        }
        if(isFV.isChecked()){
           price += AddIns.FRENCHVANILLA.getPrice();
        }
        if(isIC.isChecked()){
           price += AddIns.IRISHCREAM.getPrice();
        }
        if(isCaramel.isChecked()){
           price += AddIns.CARAMEL.getPrice();
        }
        if(isMocha.isChecked()){
          price += AddIns.MOCHA.getPrice();
        }

        //HERE DISPLAYING THE CURRENT RUNNING PRICE
        temp = findViewById(R.id.textView4);
        temp.setText("$" + String.format("%.2f",(price * quantity)));

        return price;
    }


}