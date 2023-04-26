//package com.example.myapplication;
//
//import android.content.ClipData;
//import android.content.Context;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.RecyclerView;
//
//import java.lang.reflect.Array;
//import java.util.ArrayList;
//import java.util.List;
//
//public class SingleAdapter extends RecyclerView.Adapter<SingleAdapter.SingleViewHolder>{
//
//    class SingleViewHolder extends RecyclerView.ViewHolder
//    {
//
//        TextView flavorsView, typesView;
//        ImageView imageView;
////    Button add;
////    Button remove;
//
//
//        //add all the donuts here
//
//        public SingleViewHolder(@NonNull View itemView) {
//            super(itemView);
//
//            imageView = itemView.findViewById(R.id.imageView);
//            typesView = itemView.findViewById(R.id.types);
//            flavorsView = itemView.findViewById(R.id.flavors);
//            //add =(Button) flavorsView.findViewById(R.id.add);
//            // remove =(Button) flavorsView.findViewById(R.id.remove);
//
//            // add.setOnClickListener(this);
//            //remove.setOnClickListener(this);
//        }
//
//        void bind(final Donuts donut)
//        {
////            if(checkedPosition ==-1)
////            {
////
////            }
//
////            if(checkedPosition ==-1)
////            {
////                imageView.setVisibility(View.GONE);
////            }
////            else {
////                if(checkedPosition == getAbsoluteAdapterPosition())
////                {
////                    imageView.setVisibility(View.VISIBLE);
////                }
////                else {
////                    imageView.setVisibility(View.GONE);
////                }
////            }
////        }
////
////        flavorsView.setOnClickListener(new View OnClickListener())
////        {
////
////        }
//        }
//
//    }
//
//    private Context context;
//    ArrayList<Donuts> donuts;
//    private int checkedPosition =0;
//
//
//
////    ImageView imageView;
////    TextView typesView, flavorsView;
//    //synonymous with SingleAdapter
//
//    private ArrayList<Donuts> donutList = new ArrayList<>();
//    private Donuts currentDonut;
//
//    public SingleAdapter(Context context, ArrayList<Donuts> donutsArray) {
//        this.context = context;
//        this.donuts = donutsArray;
//    }
//
//    public void setDonuts(ArrayList<Donuts> donutsArrayList)
//    {
//        this.donuts = new ArrayList<>();
//        this.donuts = donutsArrayList;
//
//    }
//
//
//
//
//    @NonNull
//    @Override
//    public SingleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        return new SingleViewHolder(LayoutInflater.from(context).inflate(R.layout.donuts_list_row, parent, false));
//
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull SingleViewHolder holder, int position) {
////        holder.myText1.setText(flavors[position]);
////        holder.myText1.setText(types[position]);
////        holder.myImage.setImageResource(images[position]);
//
//        holder.typesView.setText(donuts.get(position).getType());
//        holder.flavorsView.setText(donuts.get(position).getFlavor());
//        holder.imageView.setImageResource(donuts.get(position).getImage());
//
//        holder.bind(donuts.get(position));
//    }
//
//    @Override
//    public int getItemCount() {
//        return donuts.size();
//    }
//
//    public Donuts getSelected()
//    {
//        if(checkedPosition != -1)
//        {
//            return donuts.get(checkedPosition);
//        }
//        return null;
//    }
//
////    @Override
////    public void onClick(View v)
////    {
////        if(v.equals(R.id.add))
////        {
////            //flavor, type, quantity
////            String flavor;
////            flavor = typesView.getId();
////
////            currentDonut = new Donuts(, 1);
////
////            //get the data that has been selected here
////            donutList.add(currentDonut);
////            //add teh donut to donutList
////        }
////
////        if(v.equals(R.id.remove))
////        {
////            removeAt(getPosition());
////        }
////
////    }
//
////    public void removeAt(int position)
////    {
////        donutList.remove(position);
////    }
//
//
//
//
//
//
//
//}
