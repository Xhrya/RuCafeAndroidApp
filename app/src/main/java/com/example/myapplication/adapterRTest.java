//package com.example.myapplication;
//
//import android.content.Context;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.Button;
//import android.widget.ImageView;
//import android.widget.TextView;
//import android.widget.Toast;
//
//import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.RecyclerView;
//
//import java.util.ArrayList;
//
//public class adapterRTest extends RecyclerView.Adapter<adapterRTest.ViewHolder> {
//    private ArrayList<Donuts> donutsList;
//    private Context context;
//
//
//
//    public adapterRTest(Context context, ArrayList<Donuts> donutList) {
//        this.context = context;
//        this.donutsList = donutList;
//    }
//
//
//    public ViewHolder(@NonNull ViewGroup parent,  int viewType) {
//            super(itemView);
//
//            image = itemView.findViewById(R.id.images);
//            type = itemView.findViewById(R.id.types);
//            flavor = itemView.findViewById(R.id.flavors);
//            increaseQuantityButton = itemView.findViewById(R.id.increaseQuantityButton);
//
//            increaseQuantityButton.setOnClickListener(new View.OnClickListener()
//                                                      {
//                                                          @Override
//                                                          public void onClick(View view) {
//                                                              quantity++;
//                                                              Toast.makeText(view.getContext(), "Added 1" + flavor.getText().toString() + "donut to your order", Toast.LENGTH_SHORT).show();
//
//                                                          }
//
//          //  mOnDonutClickListener = onDonutClickListener;
//
//          //  itemView.setOnClickListener(this);
//        });
//
//    }
//
//    public static class ViewHolder extends RecyclerView.ViewHolder
//    {
//
//        public ImageView image;
//        public TextView type;
//        public TextView flavor;
//
//        public Button increaseQuantityButton;
//        int quantity = 0;
//
//        //  public OnDonutClickListener mOnDonutClickListener;
//
//        @Override
//        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//            View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.donuts_list_row, parent, false);
//            ViewHolder viewHolder = new ViewHolder(itemView);
//            return viewHolder;
//
//        }
//
//        @Override
//        public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
//            Donuts donut = donutsList.get(position);
//            holder.flavor.setText(donut.donutFlavor);
//            holder.type.setText(donut.donutType);
//            holder.image.setImageResource(donut.image);
//            holder.itemView.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    listener.onDonutClick(donut);
//                }
//            });
//        }
//
////        holder.itemView.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View v) {
////                notifyItemChanged(selectedPosition);
////                selectedPosition = holder.getAdapterPosition();
////                notifyItemChanged(selectedPosition);
////                mOnDonutClickListener.onDonutClick(donut);
////            }
////        });
//    }
//
//
//    @Override
//    public int getItemCount()
//    {
//        return donutsList.size();
//    }
//    public interface OnDonutClickListener {
//        void onDonutClick(Donuts donut);
//    }
//
//
//
//}
