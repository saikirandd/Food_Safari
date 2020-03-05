package com.example.food_safari;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class ProductViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    public TextView txtProductName, txtProductDescription, txtProductPrice;
    public ImageView imageView;
    public ItemClickListner listner;


    public ProductViewHolder(View itemView) {
        super(itemView);


        imageView = itemView.findViewById(R.id.product_image);
        txtProductName = itemView.findViewById(R.id.Restaurant_Name);
        txtProductDescription = itemView.findViewById(R.id.Restaurant_Timings);
        txtProductPrice = itemView.findViewById(R.id.Restaurant_desc);

    }

    public void setItemClickListner(ItemClickListner listner) {
        this.listner = listner;

    }

    @Override
    public void onClick(View view) {
        listner.onClick(view, getAdapterPosition(), false);

    }
}