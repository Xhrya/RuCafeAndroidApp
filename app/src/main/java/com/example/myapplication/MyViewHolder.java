package com.example.myapplication;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

public class MyViewHolder extends RecyclerView.ViewHolder
{
    TextView flavorsView, typesView;
    ImageView imageView;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.myImageView);
        typesView = itemView.findViewById(R.id.types);
        flavorsView = itemView.findViewById(R.id.types);


    }

}