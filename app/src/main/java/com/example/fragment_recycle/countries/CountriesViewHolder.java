package com.example.fragment_recycle.countries;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fragment_recycle.databinding.ItemContinentBinding;

public class CountriesViewHolder extends RecyclerView.ViewHolder {
    private ItemContinentBinding binding;


    public CountriesViewHolder(ItemContinentBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public ItemContinentBinding getBinding() {
        return binding;
    }
}
