package com.example.fragment_recycle.fragments.continents;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.fragment_recycle.OnClick;
import com.example.fragment_recycle.R;
import com.example.fragment_recycle.databinding.ItemContinentBinding;

import java.util.ArrayList;

public class ContinentsAdapter extends RecyclerView.Adapter<ContinentsViewHolder> {
    private ArrayList<ContinentModel> continentModelArrayList;
    private OnClick onItemClick;

    public ContinentsAdapter(ArrayList<ContinentModel> continentModelArrayList, OnClick onItemClick) {
        this.continentModelArrayList = continentModelArrayList;
        this.onItemClick = onItemClick;
    }

    @NonNull
    @Override
    public ContinentsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemContinentBinding binding = ItemContinentBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new ContinentsViewHolder(binding);
    }

    @Override
    public int getItemViewType(final int position) {
        return R.layout.item_continent;
    }

    @Override
    public void onBindViewHolder(@NonNull ContinentsViewHolder holder, int position) {
        ContinentModel item = continentModelArrayList.get(position);
        holder.getBinding().titleContinent.setText(item.getName());
        holder.getBinding().descriptionContinent.setText(item.getDescription());
        Glide.with(holder.getBinding().imageContinent).load(item.getImageUrl()).into(holder.getBinding().imageContinent);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClick.onClick(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return continentModelArrayList.size();
    }
}
