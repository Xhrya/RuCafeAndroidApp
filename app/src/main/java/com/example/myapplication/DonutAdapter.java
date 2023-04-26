package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DonutAdapter extends RecyclerView.Adapter<DonutAdapter.ViewHolder> {
    private List<Donuts> donutsList;
    private OnDonutClickListener listener;
    private int selectedPosition = RecyclerView.NO_POSITION;

    public interface OnDonutClickListener {
        void onDonutClick(Donuts donut);
    }



    public DonutAdapter(List<Donuts> donutList, OnDonutClickListener listener) {
        donutsList = donutList;
        this.listener = listener;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
    {

        public ImageView image;
        public TextView type;
        public TextView flavor;

        public OnDonutClickListener mOnDonutClickListener;

        public ViewHolder(View itemView, OnDonutClickListener onDonutClickListener) {
            super(itemView);

            image = itemView.findViewById(R.id.images);
            type = itemView.findViewById(R.id.types);
            flavor = itemView.findViewById(R.id.flavors);

            mOnDonutClickListener = onDonutClickListener;

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            mOnDonutClickListener.onDonutClick(getAdapterPosition());
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.donuts_list_row, parent, false);
        ViewHolder viewHolder = new ViewHolder(itemView, mOnDonutClickListener);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Donuts donut = donutsList.get(position);
        holder.itemView.setSelected(selectedPosition == position);
        holder.flavor.setText(donut.donutFlavor);
        holder.type.setText(donut.donutType);
        holder.image.setImageResource(donut.image);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                notifyItemChanged(selectedPosition);
                selectedPosition = holder.getAdapterPosition();
                notifyItemChanged(selectedPosition);
                listener.onDonutClick(donut);
            }
        });
    }


    @Override
    public int getItemCount()
    {
        return donutsList.size();
    }



}