/**
 * @author Shreya Pandey
 * @author Medhasri Veldurthi
 */

package com.example.myapplication;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Order {
    //should have order number and list of menu items

    private int orderNumber;
    private ArrayList<MenuItem> orderList;

    private double orderPrice;
    private final double NJ_TAX = 0.06625;
    //what's the point of this being an ArrayList?
    //it's the list of all the items chosen to odder(the different donuts and etc)



    /**
     * Creates a default order
     */
    public Order()
    {
        orderNumber =1;
        orderList= new ArrayList<MenuItem>();
        this.orderPrice = 0.0;
    }


    /**
     * Arraylist of orders is returned
     */
    public ArrayList<MenuItem> getOrderList()
    {
        return this.orderList;
    }


    /**
     * Adds donuts to orderlist
     */
    public void addDonut(Donuts a)
    {

        orderList.add(a);
    }

    public void clear()
    {
        orderList.clear();
    }


    /**
     * Adds coffee to orderlist
     */
    public void addCoffee(Coffee c)
    {
        orderList.add(c);
    }

    public void remove(Donuts a)
    {
        for(int i=0; i<orderList.size(); i++)
        {
            if(orderList.get(i).equals(a))
            {
                orderList.remove(i);
            }
        }
    }


    /**
     * sets the order number to this basket
     * @param orderNumber is the order number of the basket
     */

    public void setOrderNumber(int orderNumber)
    {
        this.orderNumber =orderNumber;
    }


    /**
     * Returns the order number
     */
    public int getOrderNumber()
    {
        return orderNumber;
    }

//    public int findIndexMenuItem(String menuItemFind)
//    {
//
//    }


    /**
     * Returns the size of the order
     */
    public int getOrderListSize()
    {
        return orderList.size();
    }


    /**
     * Converts the selected menuitem to a string
     * @param index shows which item to select
     */
    public String menuItemAsString(int index)
    {
        String outputString = "";
        outputString = orderList.get(index).toString();

        return outputString;
    }


    /**
     * Converts order to string
     */
    public String toString() {
        String orderString = "Order #" + this.orderNumber + " Total: $" + this.totalWithTax() + "(" + this.orderNumber + ")\n";
        //display each order from ArrayList as a new line
        for(int i =0; i<orderList.size(); i++) {
            orderString += orderList.get(i).toString() + "\n";
        }
        return orderString;
    }


    /**
     * Calculates the tax of the order
     */
    public double salesTax() //6.625% and dollars rounded to 2 decimal points
    {

        double subTotalCost = 0;
        for(int i =0; i<orderList.size(); i++){
            subTotalCost = subTotalCost + orderList.get(i).itemPrice();
        }

        double salesTax =NJ_TAX * totalWithoutTax();
        //add to total

        salesTax= Double.parseDouble(String.format("%.2f",salesTax));
        return salesTax;
    }


    public double totalWithoutTax()
    {
        double subTotalCost = 0;
        for(int i =0; i<orderList.size(); i++){
            subTotalCost = subTotalCost + orderList.get(i).itemPrice();
        }
        return subTotalCost;
    }


    /**
     * Calculates the total with the tax
     */
    public double totalWithTax() //6.625% and dollars rounded to 2 decimal points
    {
        double totalWithTax =0;
        //get the sales tax
        //   totalWithTax = salesTax() + orderList.itemPrice();
        //add to total
        totalWithTax = totalWithoutTax() + salesTax();
        totalWithTax= Double.parseDouble(String.format("%.2f",totalWithTax));

        return totalWithTax;
    }

    /**
     * sets the total price of the order
     */
    public void setTotalPrice(double price){
        this.orderPrice = price;
    }

    /**
     * gets the total price of the order
     */
    public double getTotalPrice(){
        return this.orderPrice;
    }




}

