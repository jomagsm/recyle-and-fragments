package com.example.fragment_recycle.fragments.continents;


import androidx.recyclerview.widget.RecyclerView;

import com.example.fragment_recycle.databinding.ItemContinentBinding;

public class ContinentsViewHolder extends RecyclerView.ViewHolder {
    private ItemContinentBinding binding;

    public ContinentsViewHolder(ItemContinentBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public ItemContinentBinding getBinding() {
        return binding;
    }
}
