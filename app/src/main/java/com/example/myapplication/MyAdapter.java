package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;

import java.util.List;

public class MyAdapter {
    private List<Donuts> mData;

    public MyAdapter(List<Donuts> data)
    {
        mData = data;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new MyViewHolder(view);
    }
}
