package com.example.myapplication;

import android.content.ClipData;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder>{

  private Context context;
  List<Item> items;

    ImageView imageView;
    TextView typesView, flavorsView;

    public MyAdapter(Context context, List<Item> items) {
        this.context = context;
        this.items = items;
    }




    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.donuts_list_row, parent, false));

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
//        holder.myText1.setText(flavors[position]);
//        holder.myText1.setText(types[position]);
//        holder.myImage.setImageResource(images[position]);

        holder.typesView.setText(items.get(position).getType());
        holder.flavorsView.setText(items.get(position).getFlavor());
        holder.typesView.setText(items.get(position).getImage());


    }

    @Override
    public int getItemCount() {
        return items.size();
    }



}
