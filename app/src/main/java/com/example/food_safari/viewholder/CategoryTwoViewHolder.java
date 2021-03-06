package com.example.food_safari.viewholder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.food_safari.interfaces.ItemClickListner;
import com.example.food_safari.R;

public class CategoryTwoViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView dataName;
    public TextView dataId;
    public TextView dataAge;
    public ItemClickListner subCategoryOnClickInterface;

    public CategoryTwoViewHolder(@NonNull final View itemView) {
        super(itemView);
        dataId = itemView.findViewById(R.id.data_id);
        dataAge = itemView.findViewById(R.id.data_age);
        dataName = itemView.findViewById(R.id.data_name);
        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        subCategoryOnClickInterface.onClick(v, false);
    }

    public void SubCategoryInterfaceClick(ItemClickListner subCategoryOnClickInterface) {
        this.subCategoryOnClickInterface = subCategoryOnClickInterface;
    }
}