/**
 * @author Shreya Pandey
 * @author Medhasri Veldurthi
 */
package com.example.myapplication;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Donuts extends MenuItem   {


    String donutType = "";
    String donutFlavor = "";
    int quantity;
    String id;

    int image;

    private boolean isChecked = false;

    public Donuts(String id, String t, String df, int i)
    {
        this.id = id;
        this.donutType=t;
        this.donutFlavor=df;
        this.image = i;
        this.quantity=0;

    }


    public Donuts(int imageResourceId, String type, String flavor) {
        this.image = imageResourceId;
        this.donutType = type;
        this.donutFlavor = flavor;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    public String getId()
    {
        return id;
    }

    public boolean isChecked()
    {
        return isChecked;
    }

    public void setChecked(boolean checked)
    {
        isChecked = checked;
    }


    /**
     * Constructor for donuts
     * @param donutFlavor the flavor of the donut
     * @param donutType the type of the donut
     * @param quantity is the number of donuts
     */
    public Donuts(String donutType, String donutFlavor, int quantity){
        this.donutType = donutType;
        this.donutFlavor = donutFlavor;
        this.quantity = quantity;
    }

    public Donuts(String donutType, String donutFlavor){
        this.donutType = donutType;
        this.donutFlavor = donutFlavor;
    }

    public String getType()
    {
        return this.donutType;
    }

    public String getFlavor()
    {
        return this.donutFlavor;
    }

    public int getImage()
    {
        return this.image;
    }
    /**
     * Returns the price of the donut based on its type
     */
    @Override
    public double itemPrice()
    {
        if(donutType.equals("Yeast Donuts"))
        {
            return DonutPrices.YEAST.getPrice();
        }
        else if(donutType.equals("Cake Donuts"))
        {
            return DonutPrices.CAKE.getPrice();
        }
        else if(donutType.equals("Hole Donuts"))
        {
            return DonutPrices.HOLE.getPrice();
        }
        return 0;
    }



    /**
     * Returns the price of the donut based on its type and quantity
     */
    public double donutPriceWithQuantity()
    {
        return itemPrice()*quantity;
    }

    /**
     * compares the menuitems
     */
    @Override
    public int compareTo(MenuItem o) {
        return 0;
    }

    /**
     * donut item changed to string
     */
    @Override
    public String toString()
    {
        String outputString = "";
        outputString += donutType + " " + donutFlavor + " (" + quantity + ")";
        return outputString;
    }


    public void addQuantity(int q) {
        quantity = quantity+ quantity;
    }
}