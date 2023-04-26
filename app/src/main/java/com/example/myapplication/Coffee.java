package com.example.myapplication;


/**
 * @author Shreya Pandey
 * @author Medhasri Veldurthi
 */

import java.util.ArrayList;

public class Coffee extends MenuItem{
    private String cupSize;
    private ArrayList<String> addIns;

    private double coffeePrice = 0.0;

    /**
     * Constructor for coffee
     * @param size size of the coffee
     * @param addIns is an arraylist of add ins
     * @param price is the price of the coffee
     */
    public Coffee(String size, ArrayList addIns, double price){
        this.cupSize = size;
        this.addIns = addIns;
        this.coffeePrice = price;
    }

    /**
     * Return's the coffee's price
     */
    @Override
    public double itemPrice(){
        this.coffeePrice = 0.0;
        if(cupSize.toString().equals("Short")){
            this.coffeePrice+= 1.89;
        }else if(cupSize.toString().equals("Tall")){
            this.coffeePrice+= 2.29;
        }else if(cupSize.toString().equals("Grande")){
            this.coffeePrice+= 2.69;
        }else if(cupSize.toString().equals("Venti")){
            this.coffeePrice+= 3.09;
        }

        if(addIns.contains(AddIns.SWEETCREAM)){
            this.coffeePrice += AddIns.SWEETCREAM.getPrice();
        }
        if(addIns.contains(AddIns.FRENCHVANILLA)){
            this.coffeePrice += AddIns.FRENCHVANILLA.getPrice();
        }
        if(addIns.contains(AddIns.IRISHCREAM)){
            this.coffeePrice += AddIns.IRISHCREAM.getPrice();
        }
        if(addIns.contains(AddIns.CARAMEL)){
            this.coffeePrice += AddIns.CARAMEL.getPrice();
        }
        if(addIns.contains(AddIns.MOCHA)){
            this.coffeePrice += AddIns.MOCHA.getPrice();
        }

        return coffeePrice;
    }

    /**
     * Compares the two coffees
     */
    @Override
    public int compareTo(MenuItem o) {
        return 0;
    }

    /**
     * Returns coffee as a String
     */
    @Override
    public String toString() {
        return ("COFFEE: " + this.cupSize + " ADD-INS:" +  addIns.toString().toLowerCase());
    }
}

