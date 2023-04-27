package com.example.myapplication;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.InputType;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class DonutAdapter extends RecyclerView.Adapter<DonutAdapter.DonutViewHolder> {
    private List<Donuts> donutList;
    private Context context;

    public DonutAdapter(List<Donuts> donutList, Context context) {
        this.donutList = donutList;
        this.context = context;
    }

    public static class DonutViewHolder extends RecyclerView.ViewHolder {
        public ImageView donutImageView;
        public TextView donutTypeTextView;
        public TextView donutFlavorTextView;
        public Spinner donutQuantitySpinner;

        public DonutViewHolder(View itemView) {
            super(itemView);
            donutImageView = itemView.findViewById(R.id.donutImageView);
            donutTypeTextView = itemView.findViewById(R.id.donutTypeTextView);
            donutFlavorTextView = itemView.findViewById(R.id.donutFlavorTextView);
            donutQuantitySpinner = itemView.findViewById(R.id.donutQuantitySpinner);
        }
    }

    @Override
    public DonutViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new DonutViewHolder(LayoutInflater.from(context).inflate(R.layout.donuts_list_row, parent, false));
    }

    @Override
    public void onBindViewHolder(DonutViewHolder holder, int position) {
        final Donuts donut = donutList.get(position);
        holder.donutImageView.setImageResource(donut.getImage());
        holder.donutTypeTextView.setText(donut.getType());
        holder.donutFlavorTextView.setText(donut.getFlavor());

        // Populate the spinner with options for the quantity of the selected donut type
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                context, R.array.quantities, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        holder.donutQuantitySpinner.setAdapter(adapter);
    }

    @Override
    public int getItemCount() {
        return donutList.size();
    }
}