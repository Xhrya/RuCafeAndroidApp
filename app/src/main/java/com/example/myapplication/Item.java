package com.example.myapplication;

public class Item {
    String donutType;
    String donutFlavor;

    int image;

    public Item(String t, String df, int i)
    {
        this.donutType=t;
        this.donutFlavor=df;
        this.image = i;
    }

    public Item(String t, String df)
    {
        this.donutType=t;
        this.donutFlavor=df;
    }

    public String getType()
    {
        return donutType;
    }

    public void setType(String t)
    {
        this.donutType = t;
    }

    public String getFlavor()
    {
        return donutFlavor;
    }

    public void setFlavor(String fl)
    {
        this.donutFlavor = fl;
    }

    public void setImage(int image)
    {
        this.image=image;
    }

    public int getImage()
    {
        return image;
    }





}
